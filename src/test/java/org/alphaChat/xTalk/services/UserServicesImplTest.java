package org.alphaChat.xTalk.services;


import org.alphaChat.xTalk.data.model.User;
import org.alphaChat.xTalk.data.repositories.UserRepository;
import org.alphaChat.xTalk.dto.ChatRequest;
import org.alphaChat.xTalk.dto.RegisterUserRequest;
import org.alphaChat.xTalk.exceptions.UserAlReadyExitException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServicesImplTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServices userServices;
    @BeforeEach
    public void deleteBeforeEachTest(){
        userRepository.deleteAll();
    }

    @Test
    public void testThatUserCanRegister(){
        RegisterUserRequest registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setName("Username");
        registerUserRequest.setPassword("Password");
        userServices.registerWith(registerUserRequest);
        assertThat(userRepository.count(), is(1L));
    }
    @Test
    public void testThatUserIsUnique(){
        RegisterUserRequest registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setName("Username");
        registerUserRequest.setPassword("Password");
        userServices.registerWith(registerUserRequest);

        RegisterUserRequest precious = new RegisterUserRequest();
        precious.setName("Username");
        precious.setPassword("Password");
        assertThrows(UserAlReadyExitException.class, () -> userServices.registerWith(precious));
    }

    @Test
    public void testChatCreate(){
        ChatRequest createChatRequest = new ChatRequest();
        User user = new User();
        user.setEmail("Precious");
        user.setPassword("password");

        RegisterUserRequest registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setName(user.getEmail());
        registerUserRequest.setPassword(user.getPassword());
        userServices.registerWith(registerUserRequest);

        User user1 = new User();
        user1.setEmail("Abike");
        user1.setPassword("password");

        RegisterUserRequest registerUserRequest1 = new RegisterUserRequest();
        registerUserRequest1.setName(user1.getEmail());
        registerUserRequest1.setPassword(user1.getPassword());
        userServices.registerWith(registerUserRequest1);

        createChatRequest.setFirstUser(user);
        createChatRequest.setSecondUser(user1);

        userServices.createChatFor(createChatRequest);
        assertThat(userServices.countChat(), is(1L));
    }


}