package Data.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Entry {
    private int iD;
    private String title;
    private String body;
    private LocalDateTime time = LocalDateTime.now();




}
