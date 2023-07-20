package tdd;

import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    Bike nero = new Bike();
    @BeforeTest
    @Test
    public void canOnBike(){
        boolean checkStatus = nero.getIsOn();
        assertFalse(checkStatus);
        nero.setOn();
        checkStatus = nero.getIsOn();
        assertTrue(checkStatus);
    }
   @Test
   public void canOffBike(){
        boolean checkStatus = nero.getIsOn();
        assertFalse(checkStatus);
        nero.setOn();
        checkStatus = nero.getIsOn();
        assertTrue(checkStatus);
        nero.setOn();
       checkStatus = nero.getIsOn();
        assertFalse(checkStatus);
    }
    @Test
    public void canAccelerateBike(){
        boolean checkStatus = nero.getIsOn();
        assertFalse(checkStatus);
        nero.setOn();
       checkStatus = nero.getIsOn();
        assertTrue(checkStatus);
        int speed = nero.Show_speed();
        assertEquals(0,speed);
        int gear = nero.Show_gear();
        assertEquals(0,gear);
        nero.accelerate();
        speed = nero.Show_speed();
        assertEquals(1,speed);
        gear = nero.Show_gear();
        assertEquals(1,gear);
    }
    @Test
    public void canDeAccelerateInBike(){
        boolean checkStatus = nero.getIsOn();
        assertFalse(checkStatus);
        nero.setOn();
       checkStatus = nero.getIsOn();
        assertTrue(checkStatus);
        int speed = nero.Show_speed();
        nero.accelerate();
        speed = nero.Show_speed();
        assertEquals(1,speed);
        int gear = nero.Show_gear();
        assertEquals(1,gear);
        nero.deAccelerate();
        speed = nero.Show_speed();
        assertEquals(0,speed);
        gear = nero.Show_gear();
        assertEquals(0,gear);
    }
}
