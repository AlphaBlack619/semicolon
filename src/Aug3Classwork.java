import java.util.Arrays;

public class Aug3Classwork {
    public static void sorting(int[]arrays){
        int length = arrays.length;
        int [] string = new int [length];
        int [] string2= new int [length];
        int [] string3 = new int[length];
        string = Arrays.copyOf(arrays,length);
        Arrays.sort(arrays);
        for (int x = length-1; x >= 0; x--){
            int b = arrays[x];
                string2[length-1] = b;}
        for (int t = 0; t < length; t++) {
            for (int o = 0; o < length; o++){
                if (string[t] == string2[o]){
                    string3[t] = o;}}}
        System.out.println(Arrays.toString(string2));}
    public static int multiply(int number, int number1){
        var answer = 0;
        for (int i = 0; i < number1; i++){
            answer+=number;}
        return answer;}
    public static int multiply(int ... numbers){
        var answer = numbers[0];
        for (int number : numbers) {
            answer = multiply(answer, number);}
        return answer;
    }
    public static int myMinValue(int number, int number1){
        int answer;
        if (number <= number1) answer = number;
        else answer = number1;
        return answer;
    }
    public static int myMinValue(int ... numbers){
        int answer = numbers[0];
        for (int number : numbers) {
            answer = myMinValue(answer, number);
        }
        return answer;
    }
    public static int myMaxValue(int number, int number1){
        int answer;
        if (number >= number1)answer = number;
        else answer = number1;
        return answer;}
    public static int myMaxValue(int ... numbers){
        int answer = numbers[0];
        for (int number: numbers) {
            answer = myMaxValue(answer,number);
        }
        return answer;
    }
    public static double myAverage(double...numbers){
        if (numbers.length > 5){
            throw new IllegalArgumentException("number out of range");
        }
        double answer,total=0;
        for (double number : numbers)total += number;
        answer = total/numbers.length;
        return answer;
    }

    public static void main(String[] args) {
        int [] number = {5, 18, 32, 3, 4};
        sorting(number);
        System.out.println(multiply(1, 2, 3, 4, 5, 6));
        System.out.println(multiply(5, 10));
        System.out.println(myMinValue(13,31));
        System.out.println(myMinValue(6,8,9,11,6,4,4,3));
        System.out.println(myAverage(1, 2, 3, 4, 5, 6));
    }
}
