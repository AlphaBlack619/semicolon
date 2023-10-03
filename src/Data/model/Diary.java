package Data.model;

import java.util.List;

public  class Diary {
    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private  String user_Name;
    private String password;
    private boolean isLock;
    private List<Entry> entryList;
    private int id;
    public int getId() {
        return this.id;
    }
    public void setId(int id){
        this.id = id;
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

    public void upDateEntry(int i, String title, String body) {
        findEntry(i).upDateTitle(title);
        findEntry(i).upDateBody(body);
    }

    public String getPin() {
        return password;
    }

}
