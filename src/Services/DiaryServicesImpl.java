package Services;

import Data.model.Diary;
import Data.repositories.DiaryRepositoriesImpl;

import java.util.Scanner;

public class DiaryServicesImpl extends Diary  implements DairyService{
    Scanner scanner = new Scanner(System.in);
    private final DiaryRepositoriesImpl diaryRepositories = new DiaryRepositoriesImpl();
    @Override
    public Diary register() {
    String name = scanner.nextLine();
    String password = scanner.nextLine();
        for (Diary diary: diaryRepositories.diaryList) {
            if (diary.getUser_Name().equalsIgnoreCase(name)) System.out.println("UserName Exist");
            else {
                Diary diary1;
                diary1 = new Diary();
                diary1.setUser_Name(name);
                diary1.setPassword(password);
                diaryRepositories.save(diary1);
                return diary1;
            }
        } return null;
    }

    @Override
    public Diary findById(int id) {
        for (Diary diary: diaryRepositories.diaryList) {
            if (diary.getId() == id){
                return diary;}
        } return null;
    }


    public long count() {
        return diaryRepositories.count();
    }


    @Override
    public void delete(String diary_userName) {
        for (Diary diary: diaryRepositories.diaryList) {
            if (diary.getUser_Name().equals(diary_userName)){
                diaryRepositories.delete(diary);}}}

}
