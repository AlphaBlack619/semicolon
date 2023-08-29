package PhaseGate;

public class DiaryUse {
    public static void main(String[] args) {
        Diary myDiary = new Diary("Alpha", "619");
        myDiary.createEntry("My sex life", "I first had sex at the age of 17.\n" +
                "Her name was EnoAbasi, She Was My First Love In Life","619");
        String ok = myDiary.findEntry(1).getBody(), title = myDiary.findEntry(1).getTitle();
        System.out.println(title);
        System.out.println(ok);
    }
}
