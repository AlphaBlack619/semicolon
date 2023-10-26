package org.alphaChat.xTalk.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Data
public class Message {
  @Id
  private String messageId;
   private String body;
   private boolean isRead;
   private String chatId;
   private LocalDate localDate = LocalDate.now();
}
