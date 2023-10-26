import java.util.Arrays;

public class Sep28 {
    public static String switcher(String word, int [] number){
        String newWord = "";
        String [] word1 = new String[word.length()];
        for (int y = 0; y < number.length; y++) {
            word1[y] =   String.valueOf(word.charAt(number[y]));}
        for (int a = 0; a < number.length; a++){
            newWord += word1[a];
        }
        return newWord;
    }
}
