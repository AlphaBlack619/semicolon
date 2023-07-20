

public class Triangle {
    public static void main(String[] args) {

       int  counter = 9;
       while (counter >= 0){
           int secondCounter2 = counter;
           while (secondCounter2 >= 0){
               System.out.print(" ");
               secondCounter2--;}
           int y = counter;
           while (y <= 9) {
               System.out.print("*");
               y++;}
           int x = counter;
           while (x <= 9) {
               System.out.print("*");
               x++;}
           int secondCounter1 = counter;
           while (secondCounter1 >= 0){
               System.out.print(" ");
               secondCounter1--;}
           System.out.println();
           counter--;
       }
        int counter2 = 9;
        while (counter2 >= 0){
            int y = counter2;
            while (y <= 9) {
                System.out.print(" ");
                y++;}
            int secondCounter3 = counter2;
            while (secondCounter3 >= 0){
                System.out.print("*");
                secondCounter3--;}
            int secondCounter1 = counter2;
            while (secondCounter1 >= 0){
                System.out.print("*");
                secondCounter1--;}
            System.out.println();
            counter2--;
        }

    }}
