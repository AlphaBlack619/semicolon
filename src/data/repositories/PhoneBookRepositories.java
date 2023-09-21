package data.repositories;

import data.model.PhoneBook;

public interface PhoneBookRepositories {
    PhoneBook save(PhoneBook phoneBook);
    void delete(PhoneBook phoneBook);
    PhoneBook findById(String id);
    Iterable<PhoneBook> findAll();
    long count();
    void clear();
}
