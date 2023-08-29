package PhaseGate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Aug24ClassworkTest {
    @Test
    void testingForSplitMethod(){
        int [] outPut = {2,3,4,5,6,0,3,8};
        int [] input = {23,45,60,38};
        assertArrayEquals(outPut,Aug24Classwork.split(input));
    }
    @Test
    void testingForAddingMethod(){
        int [] inPut = {9,9,9};
        int [] outPut = {1,0,0,0};
        assertArrayEquals(outPut,Aug24Classwork.arrayAdding(inPut));
        int [] inPut1 = {9};
        int [] outPut1 = {1,0};
        assertArrayEquals(outPut1,Aug24Classwork.arrayAdding(inPut1));
    }

}