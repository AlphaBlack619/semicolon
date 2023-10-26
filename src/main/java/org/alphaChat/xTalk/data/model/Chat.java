package org.alphaChat.xTalk.data.model;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Document("chatters")
public class Chat {
@Id
private  String chatId;
    @DBRef
    private List<User> userList = new ArrayList<>();
    @CreatedDate
    private LocalDate localDate;
    private String message;
    private String chatName;
}
