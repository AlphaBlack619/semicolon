package data.repositories;

import data.model.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookImplTest {

    @org.junit.jupiter.api.Test
    void save() {
        PhoneBookImpl books = new PhoneBookImpl();
        PhoneBook book = new PhoneBook(books.createId(),"alpha");
        books.save(book);
        assertEquals(books.count(),1);
    }

    @org.junit.jupiter.api.Test
    void findById() {
    }

    @org.junit.jupiter.api.Test
    void clear() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @Test
    void delete() {
        PhoneBookImpl books = new PhoneBookImpl();
        PhoneBook book = new PhoneBook(books.createId(),"alpha");
        books.save(book);
        assertEquals(books.count(),1);
        PhoneBook book1 = new  PhoneBook(books.createId(),"Nero");
        books.save(book1);
        PhoneBook book2 = new  PhoneBook(books.createId(),"p");
        books.save(book2);
        assertEquals(3,books.count());
        System.out.println(books.findAll());
        books.delete(book);
        assertEquals(2,books.count());
    }
}