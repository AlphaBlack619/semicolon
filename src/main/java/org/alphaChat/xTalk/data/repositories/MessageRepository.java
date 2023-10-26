package org.alphaChat.xTalk.data.repositories;


import org.alphaChat.xTalk.data.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface MessageRepository extends MongoRepository<Message, String> {

}
