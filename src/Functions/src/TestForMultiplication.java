import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestForMultiplication {
    WithoutMultiplicationSign multiplicationSign = new WithoutMultiplicationSign();
    @BeforeTest
    @Test
    public void checkCanMultiply(){
       int number = multiplicationSign.multiply(2,5);
        assertEquals(10,number);
    }
    @Test
    public void checkCanSquare(){
        int number = multiplicationSign.square(5);
        assertEquals(25,number);
    }
    @Test
    public void checkPower(){
        int number = multiplicationSign.pow(8,4);
        assertEquals(4096,number);
    }
    @Test
    public void biggestNumberAndSmall(){
        int [] array = {12,13,3,4,5,};
        int [] array1 = {13,3};

        int [] array2 = multiplicationSign.largestAndSmallestElement(array);

        System.out.println(Arrays.toString(array1)+"\n"+Arrays.toString(array2));

        assertArrayEquals(array1,array2);
    }
    @Test
    public void reverse(){
        String word = multiplicationSign.reverse(12345);
        String word1 = "54321";
        assertEquals(word1,word);
    }

    @Test
    public void fibonacci(){
        int [] fibonacci = multiplicationSign.arrays(5);
        int [] compareFibonacci = {0,1,1,2,3};
        System.out.println(Arrays.toString(fibonacci));
        assertArrayEquals(fibonacci,compareFibonacci);

    }

}
