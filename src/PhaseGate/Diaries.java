package PhaseGate;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
   private final List<Diary> diaries;
   public Diaries(){
       diaries = new ArrayList<>();
   }
   public void canAddDiary(String username, String password){
        Diary diary = new Diary(username,password);
        diaries.add(diary);
    }
    public void canAddDiary(Diary diary){
       diaries.add(diary);
    }
    public boolean checkDiaryList(){
       return diaries.isEmpty();
    }

    public Diary findByUserName(String userName) {
        for (Diary diary: diaries) {
            if (diary.getUser_Name().equals(userName)) return diary;}
        return null;
    }

    public void delete(String userName, String pin) {
        diaries.removeIf(diary -> findByUserName(userName).getPin().equals(pin));
    }
}
