package Data.repositories;

import Data.model.Diary;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoriesImpl implements DiaryRepositories {
    public List<Diary> diaryList = new ArrayList<>();

    private int generateId() {
        return diaryList.size() + 1;
    }
    @Override
    public Diary save(Diary diary) {
        diary.setId(generateId());
        diaryList.add(diary);
        return diary;
    }

    @Override
    public void delete(Diary diary) {
        diaryList.remove(diary);
    }

    @Override
    public Diary findById(int id) {
        for (Diary diary: diaryList) {
            if (diary.getId() == id){
                return diary;
            }
        } return null;
    }

    @Override
    public Iterable<Diary> findAll() {
        return diaryList;
    }

    @Override
    public long count() {
        return diaryList.size();
    }

    @Override
    public void clear() {
        diaryList.clear();
    }

}
