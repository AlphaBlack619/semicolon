package Services;

import Data.model.Diary;

public interface DairyService{
    Diary register();
    Diary findById(int id);
    void delete(String name);

}
