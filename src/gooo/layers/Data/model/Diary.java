package gooo.layers.Data.model;
import lombok.Data;

import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.List;
@Data
@Document
public  class Diary {
    private  String user_Name;
    private String password;
    private boolean isLock;
    private List<Entry> entryList = new ArrayList<>();
    private int id;
}
