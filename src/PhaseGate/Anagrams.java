package PhaseGate;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagrams {
    public ArrayList<Character> returned(String word1){
        ArrayList<Character> word = new ArrayList<>();
        for (int x = 0; x < word1.length(); x++){
            word.add((word1.charAt(x)));
        }return word;
    }


}
