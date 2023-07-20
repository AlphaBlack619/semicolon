package tdd;

import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    Television lg = new Television();
    @BeforeTest

    @Test
    public void onTelevision(){
        boolean checkStatus = lg.getIsOn();
        assertFalse(checkStatus);
        lg.setOn();
        checkStatus = lg.getIsOn();
        assertTrue(checkStatus);
    }

    @Test
    public void ofTelevision(){
        boolean checkStatus = lg.getIsOn();
        assertFalse(checkStatus);
        lg.setOn();
        checkStatus = lg.getIsOn();
        assertTrue(checkStatus);
        lg.setOn();
        checkStatus = lg.getIsOn();
        assertFalse(checkStatus);
    }


    @Test
    public void canSetChannelsInTelevision(){
        boolean checkStatus = lg.getIsOn();
        assertFalse(checkStatus);
        lg.setOn();
        checkStatus = lg.getIsOn();
        assertTrue(checkStatus);
        int checkChanel = lg.getChanel();
        assertEquals(0,checkChanel);
        lg.setChanel(17);
        checkChanel = lg.getChanel();
       assertEquals(17, checkChanel);
    }

    @Test
    public void canMoveToNextChannelsInTelevision(){
        boolean checkStatus = lg.getIsOn();
        assertFalse(checkStatus);
        lg.setOn();
        checkStatus = lg.getIsOn();
        assertTrue(checkStatus);
        int checkChanel = lg.getChanel();
        assertEquals(0, checkChanel);
        lg.setChanel(17);
        lg.nextChanel();
        checkChanel = lg.getChanel();
        assertEquals(18, checkChanel);
    }

   @Test
    public void canMoveToPreviousChannelsInTelevision(){
        boolean checkStatus = lg.getIsOn();
        assertFalse(checkStatus);
        lg.setOn();
        checkStatus = lg.getIsOn();
        assertTrue(checkStatus);
        int checkChanel = lg.getChanel();
        assertEquals(0, checkChanel);
        lg.setChanel(17);
        lg.previousChanel();
        checkChanel = lg.getChanel();
        assertEquals(16, checkChanel);
    }
    @Test
    public void canSetVolume(){
    boolean checkStatus = lg.getIsOn();
    assertFalse(checkStatus);
    lg.setOn();
    checkStatus = lg.getIsOn();
    assertTrue(checkStatus);
    lg.setVolume(15);
    int volume = lg.getVolume();
    assertEquals(15,volume);
}
    @Test
    public void canMuteVolume(){
        boolean checkStatus = lg.getIsOn();
        assertFalse(checkStatus);
        lg.setOn();
        checkStatus = lg.getIsOn();
        assertTrue(checkStatus);
        lg.setVolume(17);
        int volume = lg.getVolume();
        assertEquals(17,volume);
        lg.muteVolume();
        volume = lg.getVolume();
        assertEquals(0,volume);
    }
    @Test
    public void canIncreaseVolumeInTelevision(){
        boolean checkStatus = lg.getIsOn();
        assertFalse(checkStatus);
        lg.setOn();
        checkStatus = lg.getIsOn();
        assertTrue(checkStatus);
        int checkChanel = lg.getChanel();
        assertEquals(0,checkChanel);
        lg.setVolume(6);
        lg.increaseVolume();
        int checkVolume = lg.getVolume();
        assertEquals(7,checkVolume);
    }
    @Test
    public void canDecreaseVolumeInTelevision(){
        boolean checkStatus = lg.getIsOn();
        assertFalse(checkStatus);
        lg.setOn();
        checkStatus = lg.getIsOn();
        assertTrue(checkStatus);
        int checkChanel = lg.getChanel();
        assertEquals(0,checkChanel);
        lg.setVolume(0);
        lg.decreaseVolume();
        int checkVolume = lg.getVolume();
        assertEquals(0,checkVolume);
    }
    
@Test
public void canScanChannelInTelevision(){
    boolean checkStatus = lg.getIsOn();
    assertFalse(checkStatus);
    lg.setOn();
    checkStatus = lg.getIsOn();
    assertTrue(checkStatus);
    int checkChannel = lg.getChanel();
    assertEquals(0,checkChannel);
    lg.scanChannels();
    assertEquals(lg.getChanel(),lg.getChanel());
}
}
