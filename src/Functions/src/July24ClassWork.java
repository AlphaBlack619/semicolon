import java.util.Arrays;
import java.util.Scanner;

public class July24ClassWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] array = new int[3][7];
        for (int index = 0; index < array.length; index++){
            for (int index2 = 0; index2 < 7; index2++){
                if (index2 == 0){
                    System.out.println("enter element: ");
                    int element = input.nextInt();
                    array[index][index2] = element;
                }
                if (index2 == 1){
                    System.out.println("enter element");
                    int element = input.nextInt();
                    array[index][index2] = element;
                }
                if (index2 == 2){
                    System.out.println("enter element");
                    int element = input.nextInt();
                    array[index][index2] = element;
                }
                if ( index2 == 3){
                    array[index][index2] = array[index][0] + array[index][1] + array[index][2];
                }
                if (index2 == 4){
                    array[index][index2] = array[index][3] / 3;
                }
                if (index2 == 5){
                    int small2 = array[index][1], small3  = array[index][2];
                    int small = array[index][0];
                    if (small2 < small){
                        small = small2;
                    } if (small3 < small) {
                        small = small3;
                    } array[index][5] = small;
                }
                if (index2 == 6){
                    int max2 = array[index][1], max3 = array[index][2];
                    int max = array[index][0];
                    if (max2 > max){
                        max = max2;
                    }if (max3 > max) {
                        max = max3;} array[index][6] = max;}}
        }
        System.out.println(Arrays.deepToString(array));
    }
}
