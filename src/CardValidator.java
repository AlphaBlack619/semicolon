import java.util.Scanner;

public class CardValidator {
    Scanner input = new Scanner(System.in);
    public int checker1(long number){
       int checker = 0;
       String converter = "";
       String creditCard = converter + number;
           for (int index = creditCard.length() - 1; index >= 0; index--) {
               var x = Integer.parseInt(String.valueOf(creditCard.charAt(index))) * 2;
               if (index % 2 == 0 && x < 10) {
                   checker += x;
               }
           }
           return checker;

        }
    public int checker2(long number){
        int checker = 0;
        String converter = "";
        String creditCard = number + converter;
        for (int index = creditCard.length()-1; index>= 0; index--){
            var i = Integer.parseInt(String.valueOf(creditCard.charAt(index))) * 2;
            if (index % 2 == 0 && i >= 10){
                String bigIndex = String.valueOf(i);
                for (int x = 0; x < bigIndex.length(); x++){
                    var y = Integer.parseInt(String.valueOf(bigIndex.charAt(x)));
                    checker+=y;
                }
            }
        }
        return checker;}


    public int checker3(long number){
        int checker = 0;
        String converter = "";
        String creditCard = number + converter;
        for (int index = 0; index < creditCard.length(); index++){
            if (index % 2 != 0){
             var i = Integer.parseInt(String.valueOf(creditCard.charAt(index)));
             checker+= i;
            }
        }
        return checker;
        }
        public String type (long number){
            String converter = "", type = "";
            String creditCard = number + converter;
            if (creditCard.charAt(0) == '4'){
                type = "Visa Card";
            } else if (creditCard.charAt(0) == '5') {
                type = "Master Card";
            } else if (creditCard.charAt(0) == '6') {
                type = "Discover Card";
            } else if (creditCard.charAt(0) == '3' && creditCard.charAt(1) == '7') {
                type = "American Express Card";
            }
            else type = "Invalid Card Type";
            return type;
        }

        public void creditCardValidator(){
        System.out.println("Hello, Kindly Enter Card To verify: ");
        long number = input.nextLong();
        String converter = "", type = type(number), validType = "";
        String creditCard = converter + number;
        int cardLength = creditCard.length();
        if (cardLength >=13 && cardLength <=16) {
        int total = checker1(number) + checker2(number) + checker3(number), lengthChecker = creditCard.length();
        if (total % 10 == 0){
            validType = "valid";
        }else {
            validType = "invalid";
        }
            System.out.println("**************************************************************************\n" +
                    "************** Credit Card Type: " + type + "\n" +
                    "************** Credit Card Number: " + creditCard + "\n" +
                    "************** Credit Card Digit Length: " + cardLength + "\n" +
                    "************** Credit Card Digit Validity Status: " + validType + "\n" +
                    "**************************************************************************");
        }
            else System.out.println("invalid card length");
        }

    public static void main(String[] args) {
        CardValidator checker = new CardValidator();
        checker.creditCardValidator();


    }

    }
