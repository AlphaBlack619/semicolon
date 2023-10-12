package Data.repositories;

import Data.model.Entry;

public interface EntryRepository {
    Entry save(Entry entry);
    void delete(Entry entry);
    long count();
    Entry findById(int i);
    Iterable<Entry> findAll();
    void clear();
    Entry findByUsername(int Id, String title);
}
