package PhaseGate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    @Test
    void canCreateDiary(){
        Diary diary = new Diary("Alpha","Pin");
        assertNotNull(diary);
    }
    @Test
    void canLockDiary(){
        Diary diary = new Diary("Alpha","Pin");
        assertNotNull(diary);
        diary.lockDiary();
        assertTrue(diary.lockStatus());
    }
    @Test
    void canUnLockDiary(){
        Diary diary = new Diary("Alpha","Pin");
        assertNotNull(diary);
        diary.lockDiary();
        assertTrue(diary.lockStatus());
        diary.unLock("Pin");
        assertFalse(diary.lockStatus());
    }
    @Test
    void checkDairyCanCreateEntry(){
        Diary diary = new Diary("Alpha","Pin");
        diary.unLock("Pin");
        assertFalse(diary.lockStatus());
        assertTrue(diary.checkEntryListIsEmpty());
        diary.createEntry("My first love","Lucia De Immortal Light","Pin");
        assertFalse(diary.checkEntryListIsEmpty());

    }
    @Test
    void canDeleteEntry(){
        Diary diary = new Diary("Alpha","Pin");
        diary.unLock("Pin");
        assertFalse(diary.lockStatus());
        assertTrue(diary.checkEntryListIsEmpty());
        diary.createEntry("My first love","Lucia De Immortal Light","Pin");
        diary.createEntry("My second love","Solace De Dark Princess","Pin");
        diary.createEntry("My first Sex","Evil Monalisa","Pin");
        assertFalse(diary.checkEntryListIsEmpty());
        assertNotNull(diary.findEntry(3));
        diary.delete(3);
        assertNull(diary.findEntry(3));
    }

    @Test
    void findEntry() {
        Diary diary = new Diary("Alpha","Pin");
        diary.unLock("Pin");
        assertFalse(diary.lockStatus());
        assertTrue(diary.checkEntryListIsEmpty());
        diary.createEntry("My first love","Lucia De Immortal Light","Pin");
        diary.createEntry("My second love","Solace De Dark Princess","Pin");
        diary.createEntry("My first Sex","Evil Monalisa","Pin");
        assertFalse(diary.checkEntryListIsEmpty());
        Entry b = diary.findEntry(3);
        assertNotNull(b);
        assertSame(b, diary.findEntry(3));
        assertNull(diary.findEntry(4));
    }

    @Test
    void getUser_Name() {
        Diary diary = new Diary("Alpha","Pin");
        diary.unLock("Pin");
        assertFalse(diary.lockStatus());
        String userName = "Alpha";
        assertSame(userName,diary.getUser_Name());
    }
    @Test
    void canUpDateDiary(){
        Diary diary = new Diary("Alpha","Pin");
        diary.unLock("Pin");
        assertFalse(diary.lockStatus());
        diary.createEntry("My first love","Lucia De Immortal Light","Pin");
        String updateBody = "MaryAnn Was My First Love";
        diary.upDate(1, "My first sex", updateBody);
        assertSame(updateBody,diary.findEntry(1).getBody());
        assertSame("My first sex",diary.findEntry(1).getTitle());
    }
}