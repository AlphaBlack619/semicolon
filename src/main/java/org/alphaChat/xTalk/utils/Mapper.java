package org.alphaChat.xTalk.utils;



import org.alphaChat.xTalk.data.model.Chat;
import org.alphaChat.xTalk.data.model.User;
import org.alphaChat.xTalk.dto.ChatRequest;
import org.alphaChat.xTalk.dto.RegisterUserRequest;
import org.alphaChat.xTalk.dto.RegisterUserResponse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Mapper {
    public static User map(RegisterUserRequest registerUserRequest) {
        User user = new User();
        user.setEmail(registerUserRequest.getName());
        user.setPassword(registerUserRequest.getPassword());
        return user;
    }

    public static RegisterUserResponse map(User user){
        RegisterUserResponse registerUserResponse = new RegisterUserResponse();
        registerUserResponse.setUserName(user.getEmail());
        registerUserResponse.setLocalDate((DateTimeFormatter.ofPattern("EEEE dd/MMM/yyyy HH:mm:ss a").format(LocalDateTime.now())));
        return registerUserResponse;
    }

    public static void map(ChatRequest chatRequest, Chat chat){
        chat.setChatName(chatRequest.getFirstUser() + " " +  chatRequest.getSecondUser());
        List<User> createdUser = new ArrayList<>();
        createdUser.add(chatRequest.getFirstUser());
        createdUser.add(chatRequest.getSecondUser());
        chat.setUserList(createdUser);
    }
}
