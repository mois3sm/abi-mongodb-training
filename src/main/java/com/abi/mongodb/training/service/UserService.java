package com.abi.mongodb.training.service;

import com.abi.mongodb.training.models.User;
import com.abi.mongodb.training.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(String id) {
        return userRepository.findById(id).get();
    }

    public String addUser(User user)  {
        user = userRepository.insert(user);
        return user.getId();
    }
}
