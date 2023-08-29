package PhaseGate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiariesTest {
    @Test
    void canCreateNewDiary(){
        Diaries diaries = new Diaries();
        assertTrue(diaries.checkDiaryList());
        diaries.canAddDiary("Alpha", "pin");
        assertFalse(diaries.checkDiaryList());
    }
    @Test
    void canFindByUserName(){
        Diaries diaries = new Diaries();
        assertTrue(diaries.checkDiaryList());
        diaries.canAddDiary("Alpha", "pin");
        Diary dd = new Diary("Nero", "pin");
        diaries.canAddDiary("Black", "pin");
        diaries.canAddDiary(dd);
        assertSame( diaries.findByUserName("Nero"),dd);
    }
    @Test
    void canDeleteDiary(){
        Diaries diaries = new Diaries();
        assertTrue(diaries.checkDiaryList());
        diaries.canAddDiary("Alpha", "pin");
        Diary dd = new Diary("Nero", "pin");
        diaries.canAddDiary("Black", "pin");
        diaries.canAddDiary(dd);
        diaries.delete("Alpha","pin");
        assertNull(diaries.findByUserName("Alpha"));
    }

}