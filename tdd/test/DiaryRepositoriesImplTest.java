package test;

import gooo.layers.Data.model.Diary;
import gooo.layers.Data.repositories.DiaryRepositoriesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
class DiaryRepositoriesImplTest {
    DiaryRepositoriesImpl saver = new DiaryRepositoriesImpl();
    @BeforeEach
    @Test
    void canSaveDairy(){
        Diary diary = new Diary();
        assertNotNull(saver.save(diary));
    }
    @Test
    void canDelete(){
        Diary one = new Diary();
        Diary two = new Diary();
        saver.save(one);
        saver.save(two);
        assertNotNull(saver.findById(one.getId()));
        saver.delete(one);
        assertNull(saver.findById(one.getId()));
        assertNotNull(saver.findById(two.getId()));
    }
    @Test
    void findById() {
        DiaryRepositoriesImpl saver = new DiaryRepositoriesImpl();
        Diary one = new Diary();
        Diary two = new Diary();
        Diary three = new Diary();
        Diary four = new Diary();
        saver.save(one);
        saver.save(two);
        saver.save(three);
        saver.save(four);
        saver.delete(four);
        System.out.println(saver.diaryList);
        assertNull(saver.findById(4));
        assertNotNull(saver.findById(two.getId()));

    }

    @Test
    void findAll() {
    }

    @Test
    void count() {
    }

    @Test
    void clear() {
    }

}