package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.BeforeTest;

public class MyClockTest {
    MyClock nero = new MyClock();

    @BeforeTest
    @Test
    public void setTime() {
        nero.setTime(3601);
        assertEquals(1, nero.getSeconds());
        assertSame("Sec: 01 Min: 00 Hours: 01", nero.getTime());
    }
  @Test
  public void checkMinutes(){
        nero.setHour(25);
        assertEquals(0, nero.getHour());
        assertEquals(1, nero.getHour());
    }
    @Test
    public void checkSeconds(){
        nero.setHour(1);
        assertEquals(1,nero.getHour());
    }
}

