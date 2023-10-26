package gooo.layers.Services;

import gooo.layers.Data.model.Diary;
import gooo.layers.Data.model.Entry;
import gooo.layers.dtos.*;

public interface DiaryService {
    void register(RegisterUserRequest registerUserRequest);

    long count();

    Diary findByUsername(String username);

    void delete(String username, String password);

    void update(String username, String oldPassword, String newPassword);


    Entry addEntry(CreateEntryRequest createEntryRequest);

    FindEntryResponse findEntry(FindEntryRequest findEntryRequest);

    void lock(String username);

    void unlock(LogInRequest logInRequest);
}
