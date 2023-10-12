package Data.repositories;

import Data.model.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryRepositoryImpl implements EntryRepository{
    private List<Entry> entries = new ArrayList<>();

    @Override
    public Entry save(Entry entry) {
        boolean entryDoesNotExist = entry.getID() == 0;
        if (entryDoesNotExist) saveNew(entry);
        else update(entry);

        return entry;
    }

    private void saveNew(Entry entry) {
        entry.setID(generateId());
        entries.add(entry);
    }

    private void update(Entry entry) {
        Entry newEntry = findById(entry.getID());
        newEntry.setTitle(entry.getTitle());
        newEntry.setBody(entry.getBody());
    }

    private int generateId() {
        return entries.size() + 1;
    }

    @Override
    public void delete(Entry entry) {
        Entry foundEntry = findById(entry.getID());
        entries.remove(foundEntry);
    }

    @Override
    public long count() {
        return entries.size();
    }

    @Override
    public Entry findById(int id) {
        for(Entry entry: entries)
            if(entry.getID() == id) return entry;

        return null;
    }

    @Override
    public Iterable<Entry> findAll() {
        return entries;
    }

    @Override
    public void clear() {
        entries.clear();
    }

    @Override
    public Entry findByUsername(int id, String title) {
        for(Entry entry: entries)
            if (entry.getID() == id
                    && entry.getTitle().equalsIgnoreCase(title))
                return entry;
        return null;

    }
}
