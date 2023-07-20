import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello world!");
        System.out.print("Enter an integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Integer: ");
        int num2 = input.nextInt();
        int result = num1 * num2 / num2;
        System.out.println("The Result is " + result);
        System.out.print("Thank you");
    }
}