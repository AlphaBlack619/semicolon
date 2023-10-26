package MyList;

import java.util.ArrayList;

public class SubSet {
    private static StringBuilder setChecker(StringBuilder stringBuilder1, StringBuilder stringBuilder2){
        int length = 0;
        StringBuilder word = new StringBuilder();
      if (stringBuilder1.length() > stringBuilder2.length()){
          length = stringBuilder1.length();
          for (int x = 0; x < length;x++){
              for (int y = 0; y < stringBuilder2.length();y++){
                  if (stringBuilder2.charAt(y) == stringBuilder1.charAt(x)) {
                      word.append(String.valueOf(stringBuilder1.charAt(x)));
                      }
              }
          }
      }
      else{
          length = stringBuilder2.length();
          for (int x = 0; x < length;x++){
              for (int y = 0; y < stringBuilder1.length();y++){
                  if (stringBuilder1.charAt(y) == stringBuilder2.charAt(x)) {
                      word.append(String.valueOf(stringBuilder2.charAt(x)));
                      }
              }
          }
      }
      return word;
    }
    private static boolean aBoolean(StringBuilder newWord, StringBuilder smallWord){
        if (newWord.length() > smallWord.length()){
            for (int x = 0; x < smallWord.length(); x++){
                if (smallWord.charAt(x)!=newWord.charAt(x)){
                    return false;}
            }
            return true;
        }
        else {
            for (int x = 0; x < newWord.length(); x++){
                if (newWord.charAt(x)!=smallWord.charAt(x)){
                    return false;}
            }
            return true;
        }
    }
    public static boolean check_mate(StringBuilder stringBuilder1, StringBuilder stringBuilder2){
        if (stringBuilder1.length() > stringBuilder2.length()){
            return aBoolean(setChecker(stringBuilder1,stringBuilder2),stringBuilder2);
        }
        else return aBoolean(setChecker(stringBuilder1,stringBuilder2),stringBuilder1);
    }


    public static void main(String[] args) {
        System.out.println(check_mate(new StringBuilder("acebd"), new StringBuilder("ace")));
        System.out.println(check_mate(new StringBuilder("ace"), new StringBuilder("accebd")));
        System.out.println(check_mate(new StringBuilder("steam"), new StringBuilder("stream")));
        System.out.println(check_mate(new StringBuilder("stream"), new StringBuilder("steam")));
    }
}
