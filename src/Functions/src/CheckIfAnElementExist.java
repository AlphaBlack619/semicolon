import java.util.Scanner;

public class CheckIfAnElementExist {
    public static String check(String element, String [] array) {
        boolean check = false;
        for (String s : array) {
            if (s.equals(element)) {
                check = true;
                break;
            }
        }
    return String.valueOf(check);}



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter array size: ");
        int size = input.nextInt();
        String [] array = new String[size];
        for (int index = 0; index < size; index++){
            System.out.println("enter element");
            String element = input.next();
            array[index] = element;
        }
        var check = check("12",array);
        System.out.println(check);

    }

    }
