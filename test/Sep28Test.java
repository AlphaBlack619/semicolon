import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sep28Test {
@Test
    void canSwap(){
    String word = "kissdry";
    int [] x = {6,2,3,4,1,0,5};
    String newWord = "yssdikr";
    assertEquals(Sep28.switcher(word,x),newWord);
}
}