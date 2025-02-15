package com.example.sisgestaskbe.services;

import java.util.List;

import com.example.sisgestaskbe.model.User;

public interface UserService {
    
    public List<User> getAllUsersByRole(String role);

    public User newUser(User user);
}
