package org.alphaChat.xTalk.data.repositories;

import org.alphaChat.xTalk.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User,String> {
    Optional<User> findByEmail(String userName);
}
