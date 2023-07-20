import java.util.Scanner;

public class RoatedCorn1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studentCounter = 0, totalGrade = 0, grade = 0;
        while (grade != -25){
            System.out.println("enter grade or -25 to terminate: ");
            grade = input.nextInt();
            if (grade != -25) {
                studentCounter++;
                totalGrade = totalGrade + grade;
            }
        }
        int average = totalGrade/studentCounter;
        System.out.printf("*************************************************************************************%n                 Aso Rock Secondary School, Abuja Nigeria                   %n*************************************************************************************%nClass: SSS3%nNumber Of Student: %d%nTotal Number Of Grade: %d%nAverage: %d%n*************************************************************************************%n", studentCounter, totalGrade, average);
    }
}
