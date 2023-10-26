package org.alphaChat.xTalk.services;

import org.alphaChat.xTalk.data.model.Chat;
import org.alphaChat.xTalk.data.repositories.ChatRepository;
import org.alphaChat.xTalk.dto.ChatRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.alphaChat.xTalk.utils.Mapper.map;

@Service
public class ChatServicesImpl implements ChatServices{
    @Autowired
    private
    ChatRepository chatRepository;


    @Override
    public void createChat(ChatRequest chatRequest) {
        Chat chat = new Chat();
        map(chatRequest, chat);
        chatRepository.save(chat);
    }

    @Override
    public Long countChat() {
        return chatRepository.count();
    }

    @Override
    public void deleteChatFor(ChatRequest chatRequest) {
        chatRequest.getFirstUser();
    }
}
