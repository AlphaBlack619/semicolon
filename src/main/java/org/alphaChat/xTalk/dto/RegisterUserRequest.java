package org.alphaChat.xTalk.dto;

import lombok.Data;

@Data
public class RegisterUserRequest {
    private String name;
    private String password;
}
