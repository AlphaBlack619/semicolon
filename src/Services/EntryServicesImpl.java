package Services;

import Data.model.Entry;
import Data.repositories.EntryRepository;
import Data.repositories.EntryRepositoryImpl;
import utils.Mapper;
import dtos.CreateEntryRequest;
import dtos.FindEntryRequest;
public class EntryServicesImpl implements EntryServices {

    private EntryRepository entryRepository =  new EntryRepositoryImpl();

    @Override
    public Entry addEntry(CreateEntryRequest createEntryRequest) {
        checkIfTitleAlreadyExists(createEntryRequest.getID(),createEntryRequest.getTitle());
        Entry newEntry = Mapper.map(createEntryRequest);
        entryRepository.save(newEntry);
        return newEntry;
    }


    private void checkIfTitleAlreadyExists(int iD, String title) {
        Entry foundEntry = entryRepository.findByUsername(iD, title);
        if (foundEntry != null)
            throw new IllegalArgumentException("Entry Title Already Exists");
    }

    @Override
    public long count() {
        return entryRepository.count();
    }

    @Override
    public void delete(int iD, String title) {
        FindEntryRequest findEntryRequest = new FindEntryRequest();
        findEntryRequest.setId(iD);
        findEntryRequest.setTitle(title);
        Entry foundEntry = findEntry(findEntryRequest);
        entryRepository.delete(foundEntry);
    }

    @Override
    public Entry findEntry(FindEntryRequest findEntryRequest) {
        Entry foundEntry = entryRepository.findByUsername(findEntryRequest.getId(), findEntryRequest.getTitle());
        boolean entryIsNotFound = foundEntry == null;
        if (entryIsNotFound) throw new IllegalArgumentException("Entry is not Found");
        return foundEntry;
    }

}