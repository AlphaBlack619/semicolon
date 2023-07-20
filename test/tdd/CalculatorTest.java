package tdd;

import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
   Calculator nero = new Calculator();
   @BeforeTest
    @Test
    public void canOnCalculator(){
       boolean checkStatus = nero.getPower();
       assertFalse(checkStatus);
   }
@Test
public void canOffCalculator(){
   boolean checkStatus = nero.getPower();
   assertFalse(checkStatus);
   nero.powerButton();
   checkStatus = nero.getPower();
   assertTrue(checkStatus);
   nero.powerButton();
   checkStatus = nero.getPower();
   assertFalse(checkStatus);
}
}
