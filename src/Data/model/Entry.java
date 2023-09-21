package Data.model;

import java.time.LocalDateTime;

public class Entry {
    private final int iD;
    private String title;
    private String body;
    private LocalDateTime time = LocalDateTime.now();


    public Entry(int iD, String title, String body) {
        this.iD = iD;
        this.title = title;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void upDateBody(String body) {
        this.body = body;
        time = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public void upDateTitle(String title) {
        this.title = title;
        time = LocalDateTime.now();
    }

    public int getID() {
        return iD;
    }
}
