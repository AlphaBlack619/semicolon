package tdd;

public class Star {
    public static void main(String[] args) {
        triangle(9);
    }

        public static void triangle(int size){
            for (int counter = 1; counter<size; counter++) {
                for (int star1 = counter; star1 > 0; star1--) {
                    System.out.print('#');
                }
                for (int space1 = counter; space1 < size; space1++) {
                    System.out.print(' ');
                }
                System.out.print(' ');
                for (int star2 = counter; star2 < size; star2++) {
                    System.out.print('#');
                }
                for (int space2 = counter; space2 > 0; space2--) {
                    System.out.print(' ');
                }
                for (int space3 = counter; space3 > 0; space3--) {
                    System.out.print(' ');
                }
                for (int star3 = counter; star3 < size; star3++) {
                    System.out.print('#');
                }
                for (int space4 = counter; space4 < size; space4++) {
                    System.out.print(' ');
                }
                System.out.print(' ');
                for (int star4 = counter; star4 > 0; star4--) {
                    System.out.print('#');
                }
                System.out.println();
            }
        }
    }

