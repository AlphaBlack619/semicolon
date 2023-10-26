package org.alphaChat.xTalk.services;


import org.alphaChat.xTalk.data.model.User;
import org.alphaChat.xTalk.data.repositories.UserRepository;
import org.alphaChat.xTalk.dto.ChatRequest;
import org.alphaChat.xTalk.dto.RegisterUserRequest;
import org.alphaChat.xTalk.dto.RegisterUserResponse;
import org.alphaChat.xTalk.exceptions.UserAlReadyExitException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.alphaChat.xTalk.utils.Mapper.map;

@Service
public class UserServicesImpl implements UserServices{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ChatServices chatServices;

    @Override
    public RegisterUserResponse registerWith(RegisterUserRequest registerUserRequest) {
        findUser(registerUserRequest);
        return map(userRepository.save(map(registerUserRequest)));
    }

    @Override
    public void createChatFor(ChatRequest createChatRequest) {
        chatServices.createChat(createChatRequest);
    }

    @Override
    public Long countChat() {
        return chatServices.countChat();
    }

    @Override
    public void deleteChatFor(ChatRequest chatRequest) {

    }

    private void findUser(RegisterUserRequest registerUserRequest) {
        Optional<User> user = userRepository.findByEmail((registerUserRequest.getName()));
        if(user.isPresent()) throw new UserAlReadyExitException("Username Already Exist");
    }

}
