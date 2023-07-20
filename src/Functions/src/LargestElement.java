import java.util.Scanner;

public class LargestElement {

    public static int largestElement(int[] array){
        int max = 0;
        for (int index = 0; index < array.length; index++){
            if (array[index] > max){
                max = array[index];
            }

        }return max;


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter array size: ");
        int size = input.nextInt();
        int [] array = new int[size];
        for (int index = 0; index < size; index++){
            System.out.println("enter element");
            int element = input.nextInt();
            array[index] = element;
        }
        var maximum = largestElement(array);
        System.out.println("the maximum number is " + maximum);
    }
}
