public class List {
    public static void list(String word){
        StringBuilder word1 = new StringBuilder();
        for (int counter = 0; counter < word.length(); counter++){
            char character = word.charAt(counter);
            if (counter == word.length()-1){
                word1.append(character);
            }
            else {
                word1.append(character).append(",");
            }
        }
        System.out.println(word1);}

    public static void main(String[] args) {
        String number = "12345";
        list(number);
    }

}

