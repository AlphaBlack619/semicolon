public class WithoutMultiplicationSign {

    public  int multiply(int number1, int number2){
        int answer = number1;
        for (int counter = 1; counter < number2; counter++){
            answer +=number1;
        }return answer;

    }
    public int square(int number){
        int square = number;
        int number1 = 0;
        for (int counter = 1; counter < number; counter++){
            number1 = multiply(square,number);
        } return number1;
    }

    public int pow(int number1, int number2){
        int power = number1;
        for (int counter = 1; counter < number2; counter++){
            power = multiply(power,number1);
        }
        return power;
    }

    public  int [] largestAndSmallestElement(int[] array) {
        int max = array[0];
        int small = array[0];

        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {max = array[index];}
            if (array[index] < small) {small = array[index];}

        }
        int[] newArray = new int [] {max,small};
        return newArray;
    }
    
    public String reverse(int number){
        String word = String.valueOf(number);
        String word1 = "";
        for (int counter = word.length()-1; counter >= 0; counter--) {
            char character = word.charAt(counter);
            word1 += character;
        }
        return word1;
    }
    public int [] arrays(int number){
        int [] fibonacci = new int[number];
        fibonacci[0] = 0;
        fibonacci[1]= 1;
        for (int index = 2; index < number; index++){
            fibonacci[index] = fibonacci[index-1] + fibonacci[index-2];

        }
        return fibonacci;
    }
}
