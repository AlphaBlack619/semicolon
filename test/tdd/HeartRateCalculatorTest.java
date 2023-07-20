package tdd;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeartRateCalculatorTest {
    HeartRateCalculator casio = new HeartRateCalculator();
    @BeforeTest
    @Test
    public  void weHaveHeartCalculator(){
        HeartRateCalculator casio = new HeartRateCalculator();
        //assert
    }
}
