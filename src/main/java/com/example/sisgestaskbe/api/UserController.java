package com.example.sisgestaskbe.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.sisgestaskbe.model.User;
import com.example.sisgestaskbe.services.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    // Obtener lista de usuarios (filtrando por rol)
    @GetMapping("/user/role/{role}")
    public List<User> getAllUsersByRole(@PathVariable String role) {
        return userService.getAllUsersByRole(role);
    }

    // Crear un usuario
    @PostMapping("/user")
    public User newUser(@RequestBody User user) {
        return userService.newUser(user);
    }
}
