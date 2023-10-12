package Data.model;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
@Data
public  class Diary {
    private  String user_Name;
    private String password;
    private boolean isLock;
    private List<Entry> entryList = new ArrayList<>();
    private int id;



}
