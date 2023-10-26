package gooo.layers.utils;

import gooo.layers.Data.model.Diary;
import gooo.layers.Data.model.Entry;
import gooo.layers.dtos.CreateEntryRequest;
import gooo.layers.dtos.RegisterUserRequest;
import gooo.layers.dtos.FindEntryResponse;

public class Mapper {
    public static void map(RegisterUserRequest registerUserRequest, Diary diary){
        diary.setUser_Name(registerUserRequest.getUsername());
        diary.setPassword(registerUserRequest.getPassword());

    }

    public static Entry map(CreateEntryRequest createEntryRequest){
        Entry newEntry = new Entry();
        newEntry.setTitle(createEntryRequest.getTitle());
        newEntry.setBody(createEntryRequest.getBody());
        return newEntry;
    }

    public static FindEntryResponse map(Entry entry){
        FindEntryResponse findEntryResponse = new FindEntryResponse();
        findEntryResponse.setTitle(entry.getTitle());
        findEntryResponse.setBody(entry.getBody());
        findEntryResponse.setDateCreated(String.format("EE dd/MMM/yyyy", entry.getTime()));
        findEntryResponse.setTimeCreated(String.format("HH:MM:SS a", entry.getTime().toLocalTime()));
        return findEntryResponse;
    }
}
