package MyList;

public class MovingString {
    public static StringBuilder movingString(StringBuilder stringBuilder) {
        for (int x = 0; x < stringBuilder.length(); x++) {
            if (stringBuilder.charAt(x) == '#') {
                stringBuilder.delete(x - 1, x+1);
            }
        }
        return stringBuilder;
    }
    public static int timesToRun(StringBuilder stringBuilder){
        int count = 0;
        for (int x = 0; x < stringBuilder.length(); x++){
            if (stringBuilder.charAt(x) == '#'){
                count++;
            }
        }
        return count;
    }

    public static boolean myCompare(StringBuilder stringBuilder, StringBuilder stringBuilder1){
        StringBuilder word1 = new StringBuilder();
        StringBuilder word2 = new StringBuilder();
        for (int x = 0; x <= timesToRun(stringBuilder); x++){
             word1 = movingString(stringBuilder);
        }
        for (int x = 0; x <= timesToRun(stringBuilder1); x++){
            word2 = movingString(stringBuilder1);
        }
       if (word1.toString().equals(word2.toString()))
        {
            return true;
        }
       else return false;
    }

public static void main(String[] args) {
        StringBuilder word = new StringBuilder("abc#ab#");
        StringBuilder word1 = new StringBuilder("abc#a");
        System.out.println(myCompare(word,word1));
        StringBuilder word2 = new StringBuilder("ab##");
        StringBuilder word3 = new StringBuilder("a#");
        System.out.println(myCompare(word2,word3));

}
}
