package PhaseGate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1Test {


    @Test
    void testingForArraySize(){
       Q1 q1 = new Q1(9);
       int [] a = {1,2,3,4,5,6,7,8,9};
       q1.add(a);
       assertEquals(9,q1.getSize());
    }
    @Test
    void testForSwap(){
        Q1 q1 = new Q1(10);
        int [] a = {1,2,3,4,5,6,7,8,9,0};
        q1.add(a);
        int [] b = {2, 1, 4, 3, 6, 5, 8, 7, 0, 9};
        assertArrayEquals(b, q1.switcher());
    }
    @Test
    void testSwap2(){
        Q1 q2 = new Q1(9);
        int [] a1 = {1,2,3,4,5,6,7,8,9};
        q2.add(a1);
        int [] b1 = {2, 1, 4, 3, 6, 5, 8, 7, 9};
        assertArrayEquals(b1, q2.switcher());
    }
    @Test
    void testForEvenTest(){
        Q1 q1 = new Q1(5);
        int [] a = {45,52,11,33,48};
        q1.add(a);
        int [] b = {45,52,33,11,48};
        assertArrayEquals(b, q1.evenSwitcher());
    }
    @Test
    void testForEven2(){
        Q1 q1 = new Q1(8);
        int [] a = {45,52,11,33,48,3,7,8};
        q1.add(a);
        int [] b = {45,52,33,11,48,7,3,8};
        assertArrayEquals(b, q1.evenSwitcher());
    }
    @Test
    void test3(){
        Q1 q1 = new Q1(6);  int [] a = {45,52,11,33,48,25};
        q1.add(a);
        int [] b = {25,48, 33, 11, 52, 45};
        assertArrayEquals(b, q1.switcher3());

    }@Test
    void test4(){
        Q1 q1 = new Q1(7);  int [] a = {45,52,11,12,33,48,25};
        q1.add(a);
        int [] b = {25,48, 33, 12, 11, 52, 45};
       assertArrayEquals(b, q1.switcher3());
    }

}