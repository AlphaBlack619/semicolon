package Data.repositories;

import Data.model.Diary;

public interface DiaryRepositories {
    Diary save(Diary diary);
    void delete(Diary diary);
    Diary findById(int id);
    Iterable<Diary> findAll();
    long count();
    void clear();
}
