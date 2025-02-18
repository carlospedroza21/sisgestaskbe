package com.example.sisgestaskbe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sisgestaskbe.model.User;
import com.example.sisgestaskbe.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    

    public List<User> getAllUsersByRole(String role)  {
        return userRepository.getAllUsersByRole();
    }

    public User newUser(User user) {
        return userRepository.newUser(user);
    }
}
