import java.util.Arrays;
import java.util.Scanner;

public class July24ClassWork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[7][3];
        for (int index = 0; index < 7; index++) {
            for (int index2 = 0; index2 < 3; index2++) {
                if (index < 3 && index2 == 0) {
                    System.out.println("enter element: ");
                    int element = input.nextInt();
                    array[index][index2] = element;
                }
                if (index < 3 && index2 == 1) {
                    System.out.println("enter element");
                    int element = input.nextInt();
                    array[index][index2] = element;
                }
                if (index < 3 && index2 == 2) {
                    System.out.println("enter element");
                    int element = input.nextInt();
                    array[index][index2] = element;
                }
                if (index == 3) {
                    int element = array[0][0] + array[1][0] + array[2][0];
                    int element2 = array[0][1] + array[1][1] + array[2][1];
                    int element3 = array[0][2] + array[1][2] + array[2][2];
                    array[3][0] = element;
                    array[3][1] = element2;
                    array[3][2] = element3;
                }
                if (index == 4) {
                    int element = array[3][0] / 3;
                    int element2 = array[3][1] / 3;
                    int element3 = array[3][2] / 3;
                    array[4][0] = element;
                    array[4][1] = element2;
                    array[4][2] = element3;
                }
                if (index == 5) {
                    int element = Math.min(array[0][0], Math.min(array[1][0], array[2][0]));
                    int element2 = Math.min(array[0][1], Math.min(array[1][1], array[2][1]));
                    int element3 = Math.min(array[0][2], Math.min(array[1][2], array[2][2]));
                    array[5][0] = element;
                    array[5][1] = element2;
                    array[5][2] = element3;
                }
                if (index == 6) {
                    int element = Math.max(array[0][0], Math.max(array[1][0], array[2][0]));
                    int element2 = Math.max(array[0][1], Math.max(array[1][1], array[2][1]));
                    int element3 = Math.max(array[0][2], Math.max(array[1][2], array[2][2]));
                    array[6][0] = element;
                    array[6][1] = element2;
                    array[6][2] = element3;
                }
            }
            System.out.println(Arrays.deepToString(array));
        }
    }}