package org.alphaChat.xTalk.dto;

import lombok.Data;
import org.alphaChat.xTalk.data.model.User;

@Data
public class ChatRequest {
    private User firstUser;
    private User secondUser;
}
