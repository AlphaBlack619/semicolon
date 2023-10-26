package org.alphaChat.xTalk.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RegisterUserResponse {
    private String userName;
    private String password;
    private String localDate;
}
