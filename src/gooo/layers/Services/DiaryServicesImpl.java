package gooo.layers.Services;

import gooo.layers.Data.model.Diary;
import gooo.layers.Data.model.Entry;
import gooo.layers.Data.repositories.DiaryRepositories;
import gooo.layers.Data.repositories.DiaryRepositoriesImpl;
import gooo.layers.dtos.*;
import gooo.layers.utils.Mapper;


public class DiaryServicesImpl implements DiaryService {

    private final DiaryRepositories diaryRepository = new DiaryRepositoriesImpl();
    private final EntryServices entryServices = new EntryServicesImpl();


    @Override
    public void register(RegisterUserRequest registerUserRequest) {
        validateUser(registerUserRequest.getUsername());
        Diary newDiary = new Diary();
        Mapper.map(registerUserRequest, newDiary);
        diaryRepository.save(newDiary);
    }



    private void validateUser(String username) {
        for(Diary diary: diaryRepository.findAll())
            if (diary.getUser_Name().equals(username))
                throw new IllegalArgumentException("Username Already Exist");
    }

    @Override
    public long count() {
        return diaryRepository.count();
    }

    @Override
    public Diary findByUsername(String username) {
        for(Diary diary: diaryRepository.findAll())
            if(diary.getUser_Name().equals(username))
                return diary;
        throw new IllegalArgumentException("Diary not found");
    }

    @Override
    public void delete(String username, String password) {
        Diary diary = findByUsername(username);
        if(diary.getPassword().equals(password)) diaryRepository.delete(diary);
        else throw new IllegalArgumentException("Invalid Credentials");
    }

    @Override
    public void update(String username, String oldPassword, String newPassword) {
        Diary diary = findByUsername(username);
        if(diary.getPassword().equals(oldPassword)) diary.setPassword(newPassword);
        else throw new IllegalArgumentException("Invalid Credentials");
    }

    @Override
    public Entry addEntry(CreateEntryRequest createEntryRequest) {
        validate(createEntryRequest.getID());
        Entry entry = entryServices.addEntry(createEntryRequest);
        return entry;
    }



    private void validate(int username) {
        Diary foundDiary = diaryRepository.findById(username);
        if(foundDiary == null)
            throw new IllegalArgumentException("Diary not Found");
        if(foundDiary.isLock())
            throw new IllegalArgumentException("Diary is Locked");
    }

    @Override
    public FindEntryResponse findEntry(FindEntryRequest findEntryRequest) {
        Entry entry = entryServices.findEntry(findEntryRequest);
        return Mapper.map(entry);
    }

    @Override
    public void lock(String username) {
        Diary foundDiary = findByUsername(username);
        foundDiary.setLock(foundDiary.isLock());
        diaryRepository.save(foundDiary);
    }

    @Override
    public void unlock(LogInRequest logInRequest){
        Diary diary = diaryRepository.findByUser(logInRequest.getUsername());
        if(diary == null) throw new IllegalArgumentException("Diary Not Found");
        if(diary.getPassword().equals(logInRequest.getPassword())) diary.setLock(false);
        else throw new IllegalArgumentException("Incorrect Password");
        diaryRepository.save(diary);
    }

}