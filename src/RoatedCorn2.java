import java.util.Scanner;

public class RoatedCorn2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalGrade = 0, grade = 0, studentCounter = 0;
         while (studentCounter < 20){
             System.out.println("Enter Grade: ");
             grade = input.nextInt();
             studentCounter++;
             totalGrade+= grade;
         }
    int average = totalGrade / studentCounter;
        System.out.printf("*************************************************************************************%n                 Aso Rock Secondary School, Abuja Nigeria                   %n*************************************************************************************%nClass: SSS3%nNumber Of Student: %d%nTotal Number Of Grade: %d%nAverage: %d%n*************************************************************************************%n", studentCounter, totalGrade, average);
    }
}
