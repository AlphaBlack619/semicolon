package PhaseGate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2Test {
    @Test
    void testForOddReturn(){
        int [] sampleInput = {22, 41, 15, 8, 2, 1};
        int [] sampleOutput = {39, 13, -1};
        assertArrayEquals(sampleOutput, MyArray.arraysReturn(sampleInput));
    }

}