package org.alphaChat.xTalk.data.repositories;


import org.alphaChat.xTalk.data.model.Chat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface ChatRepository extends MongoRepository<Chat,String> {

}
