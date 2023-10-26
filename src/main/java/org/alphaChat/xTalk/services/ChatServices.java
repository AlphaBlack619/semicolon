package org.alphaChat.xTalk.services;

import org.alphaChat.xTalk.dto.ChatRequest;
import org.springframework.stereotype.Service;

@Service
public interface ChatServices {
    void createChat(ChatRequest chatRequest);
    Long countChat();
    void deleteChatFor(ChatRequest chatRequest);
}
