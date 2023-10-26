package gooo.layers.Services;

import gooo.layers.Data.model.Entry;
import gooo.layers.dtos.CreateEntryRequest;
import gooo.layers.dtos.FindEntryRequest;

public interface EntryServices {
    Entry addEntry(CreateEntryRequest createEntryRequest);

    long count();

    void delete(int iD, String title);

    Entry findEntry(FindEntryRequest findEntryRequest);
}
