public class Palindrome {
    public static void palindrome(String word){
        StringBuilder word1 = new StringBuilder();
        for (int counter = word.length()-1; counter >= 0; counter--){
            char character = word.charAt(counter);
            word1.append(character);
        }
        if (word1.toString().equals(word)){
            System.out.println("Its a palindrome");
        }else {
            System.out.println("Its not a palindrome");
        }

    }

    public static void main(String[] args) {
        String word = "ada";
        palindrome(word);
    }
}
