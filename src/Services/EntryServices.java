package Services;

import Data.model.Entry;
import dtos.CreateEntryRequest;
import dtos.FindEntryRequest;

public interface EntryServices {
    Entry addEntry(CreateEntryRequest createEntryRequest);

    long count();

    void delete(int iD, String title);

    Entry findEntry(FindEntryRequest findEntryRequest);
}
