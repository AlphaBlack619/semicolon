package org.alphaChat.xTalk.services;

import org.alphaChat.xTalk.data.model.Chat;
import org.alphaChat.xTalk.dto.ChatRequest;
import org.alphaChat.xTalk.dto.RegisterUserRequest;
import org.alphaChat.xTalk.dto.RegisterUserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserServices {

    RegisterUserResponse registerWith(RegisterUserRequest registerUserRequest);
    void  createChatFor(ChatRequest createChatRequest);

    Long countChat();
    void deleteChatFor(ChatRequest chatRequest);
}
