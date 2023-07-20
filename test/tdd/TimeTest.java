package tdd;
import org.testng.annotations.BeforeTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TimeTest {
    Time nero = new Time();
    @BeforeTest
    @Test
    public void canConvertTimeInSecondsToMinutes(){
        nero.inputSecondConverter(15);
        assertEquals(1,nero.getMinutes());
    }
    @Test
    public void canConvertTimeInMinutesToHours(){
        nero.inputMinutes(15);
        assertEquals(16,nero.getHours());
    }
    @Test
    public void canConvertTimeInHoursToDays(){
        nero.inputHours(48);
        assertEquals(2,nero.getDays());
    }
@Test
    public void canConvertDaysToWeeks(){
        nero.inputDays(14);
        assertEquals(2,nero.getWeeks());
}
@Test
    public void canCovertMinutesTSeconds(){
        nero.inputConvertMinutesToSeconds(100);
        assertEquals(900,nero.getSeconds());
}
@Test
    public void canConvertMinutesToYears(){
        nero.canConvertMinutesToYears(4);
        assertEquals(0,nero.getYears());
}

}
