package tdd;

import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;
import static org.junit.jupiter.api.Assertions.*;

public class Mp3Test {
    Mp3 boomplay = new Mp3();

    @BeforeTest

    @Test
    public void canOnMp3(){
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertTrue(checkStatus);
}
@Test
    public void canOffMp3(){
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
    }
    @Test
    public void canSetVolumeInMp3(){
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertTrue(checkStatus);
        boomplay.setVolume(20);
        int checkVolume = boomplay.getVolume();
        assertEquals(20, checkVolume);
    }
    @Test
    public void canIncreaseVolumeInMp3(){
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertTrue(checkStatus);
        boomplay.setVolume(20);
        int checkVolume = boomplay.getVolume();
        assertEquals(20, checkVolume);
        boomplay.increaseVolume();
        checkVolume = boomplay.getVolume();
        assertEquals(21, checkVolume);
    }
    @Test
    public void canDecreaseVolumeInMp3(){
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertTrue(checkStatus);
        boomplay.setVolume(20);
        int checkVolume = boomplay.getVolume();
        assertEquals(20, checkVolume);
        boomplay.decreaseVolume();
        checkVolume = boomplay.getVolume();
        assertEquals(19,checkVolume);
    }
    @Test
    public void canMuteVolumeInMp3(){
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertTrue(checkStatus);
        boomplay.setVolume(20);
        int checkVolume = boomplay.getVolume();
        assertEquals(20, checkVolume);
        boomplay.muteVolume();
        checkVolume = boomplay.getVolume();
        assertEquals(0, checkVolume);
    }
    @Test
    public void canChooseSongInMp3(){
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertTrue(checkStatus);
        boomplay.chooseSong(17);
        int song = boomplay.checkSong();
        assertEquals(17,song);
    }
    @Test
    public void canNextSongInMp3(){
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertTrue(checkStatus);
        boomplay.chooseSong(17);
        int song = boomplay.checkSong();
        assertEquals(17,song);
        boomplay.nextSong();
        song = boomplay.checkSong();
        assertEquals(18, song);
    }
    @Test
    public void canBackSongInMp3(){
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertTrue(checkStatus);
        boomplay.chooseSong(17);
        int song = boomplay.checkSong();
        assertEquals(17,song);
        boomplay.backSong();
        song = boomplay.checkSong();
        assertEquals(16, song);
    }

    @Test
    public void canSetRadioModeInMp3(){
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertTrue(checkStatus);
        boomplay.radioMode();
        double checkFrequency = boomplay.radioMode();
        assertEquals(0,checkFrequency);
    }
    @Test
    public void canSetRadioFrequencyInMp3(){
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertTrue(checkStatus);
        boomplay.radioMode();
        double checkFrequency = boomplay.radioMode();
        assertEquals(0,checkFrequency);
        boomplay.setFrequency(1);
        checkFrequency = boomplay.radioMode();
        assertEquals(1,checkFrequency);
    }
    @Test
    public void canScanRadioFrequencyInMp3() {
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertTrue(checkStatus);
        boomplay.radioMode();
        double checkFrequency = boomplay.radioMode();
        assertEquals(0, checkFrequency);
        boomplay.setFrequency(1);
        checkFrequency = boomplay.radioMode();
        assertEquals(1, checkFrequency);
        boomplay.scanRadio();
        assertEquals(boomplay.radioMode(), boomplay.radioMode());
    }
    @Test
        public void canGoToNextRadioFrequencyInMp3(){
            boolean checkStatus = boomplay.getIsOn();
            assertFalse(checkStatus);
            boomplay.setOn();
            checkStatus = boomplay.getIsOn();
            assertTrue(checkStatus);
            boomplay.radioMode();
            double checkFrequency = boomplay.radioMode();
            assertEquals(0,checkFrequency);
            boomplay.setFrequency(1);
            checkFrequency = boomplay.radioMode();
            assertEquals(1,checkFrequency);
            boomplay.nextRadioStation();
            checkFrequency = boomplay.radioMode();
            assertEquals(2,checkFrequency);
        }
    @Test
    public void canBackwardFrequencyInRadioFrequencyInMp3(){
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertTrue(checkStatus);
        boomplay.radioMode();
        double checkFrequency = boomplay.radioMode();
        assertEquals(0,checkFrequency);
        boomplay.setFrequency(1);
        checkFrequency = boomplay.radioMode();
        assertEquals(1,checkFrequency);
        boomplay.previousStation();
        checkFrequency = boomplay.radioMode();
        assertEquals(0,checkFrequency);
    }
    @Test
    public void canChangeModeInMp3(){
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertTrue(checkStatus);
        boolean checkMode = boomplay.getRadioMode();
        assertTrue(checkMode);
        boomplay.SDCardMode();
        assertTrue(checkMode);
    }

    @Test
    public void canPlayAndPauseInSDCardModeInMp3(){
        boolean checkStatus = boomplay.getIsOn();
        assertFalse(checkStatus);
        boomplay.setOn();
        checkStatus = boomplay.getIsOn();
        assertTrue(checkStatus);
        boolean checkMode = boomplay.SDCardMode();
        assertTrue(checkMode);
        boolean checkPlay = boomplay.checkPlay();
        assertFalse(checkPlay);
        boomplay.play();
        checkPlay = boomplay.checkPlay();
        assertTrue(checkPlay);
        boomplay.play();
        checkPlay = boomplay.checkPlay();
        assertFalse(checkPlay);
    }
    }
