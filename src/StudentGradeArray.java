import java.util.Arrays;
import java.util.Scanner;

public class StudentGradeArray {
    static Scanner input = new Scanner(System.in);
    public static double [][] gradeCompiler(){
        System.out.println("How many student do you have?: ");
        int numberOfStudent = input.nextInt();
        System.out.println("How many subject do they offer?: ");
        int numberOfSubject = input.nextInt();
            System.out.printf("Saving>>>>>>>>>>>>>>>>>>>>>>>>>>%nSaved successfully%n%n");
            int row = numberOfSubject + 2, col = numberOfStudent + 1;
            double[][] arrays = new double[col][row];
            for (int index1 = 0; index1 < col; index1++) {
                double x = 0;
                if (index1 <= numberOfStudent - 1) {
                    for (int index2 = 0; index2 < row; ) {
                        if (index2 < numberOfSubject) {
                            System.out.printf("Entering score for student %d%nEnter the score for subject %d%n", index1, index2);
                            int grade = input.nextInt();
                            if (grade >= 0 && grade <= 100) {
                                System.out.printf("Saving>>>>>>>>>>>>>>>>>>>>>>>>>>%nSaved successfully%n%n");
                                arrays[index1][index2] += grade;
                                index2++;
                                x += grade;
                            } else {
                                System.out.println("Invalid grade");
                            }
                        }
                        if (index2 > numberOfSubject - 1) {
                            arrays[index1][numberOfSubject] = x;
                            arrays[index1][row - 1] = x / numberOfSubject;
                            index2++;
                        }
                    }
                }

            }
            return arrays;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(gradeCompiler()));
    }
}
