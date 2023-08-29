package PhaseGate;

import java.util.ArrayList;
import java.util.List;

public class Diary {
   private final String user_Name;
  private final String password;
  private boolean isLock;
  private final List<Entry> entryList;

    public Diary(String user_Name, String password) {
        this.user_Name = user_Name;
        this.password = password;
        this.entryList = new ArrayList<>();
    }
    public boolean checkEntryListIsEmpty() {
        return entryList.isEmpty();
    }

    public void lockDiary() {
        isLock = true;
    }

    public boolean lockStatus() {
        return isLock;
    }
    public boolean validate(String pin){
        return pin.equals(password);
    }

    public void unLock(String pin) {
        if (validate(pin)){isLock = false;}else System.out.println("Wrong Pin");}

    public void createEntry(String title, String body, String pin) {
        if (validate(pin)) {Entry entry = new Entry(generateID(), title, body);
        entryList.add(entry);}
    }

    private int generateID() {
        return entryList.size() + 1;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void delete(int entry) {
        entryList.remove(findEntry(entry));
    }

    public Entry findEntry(int entry) {
        for (Entry entries: entryList) {
            if (entries.getID() == entry) return entries;}
        return null;
    }

    public void upDate(int i, String title, String body) {
        findEntry(i).upDateTitle(title);
        findEntry(i).upDateBody(body);
    }

    public String getPin() {
        return password;
    }
}
