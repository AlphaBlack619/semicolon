package data.repositories;

import data.model.MyGUI;
import data.model.PhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneBookImpl implements PhoneBookRepositories {
    public String createId;
    private final List<PhoneBook> phoneBookListList = new ArrayList<>();
    private final MyGUI gui = new MyGUI();

    @Override
    public PhoneBook save(PhoneBook phoneBook) {
        phoneBookListList.add(phoneBook);
        return phoneBook;
    }

    @Override
    public void delete(PhoneBook phoneBook) {
        gui.warning("You Are About To Delete PHoneBook With UserName?\n"
                + phoneBook.getUserName(),"Warning");
        phoneBookListList.remove(phoneBook);
       gui.info("Delete Successful","Delete Information");
     }

    @Override
    public PhoneBook findById(String id) {
        PhoneBook cc = null;
        for (PhoneBook ph: phoneBookListList) {
            if (Objects.equals(ph.getId(), id)) cc = ph;
        }
        return cc;
    }

    @Override
    public Iterable<PhoneBook> findAll() {
        return phoneBookListList;
    }

    @Override
    public long count() {
        return phoneBookListList.size();
    }

    @Override
    public void clear() {
        phoneBookListList.clear();

    }
    public String createId(){
        this.createId = String.valueOf(phoneBookListList);
        int a = phoneBookListList.size() + 1;
        return String.valueOf(a);
    }

    @Override
    public String toString() {
        return "PhoneBookImpl{" +
                "phoneBookListList=" + phoneBookListList +
                ", gui=" + gui +
                '}';
    }
}
