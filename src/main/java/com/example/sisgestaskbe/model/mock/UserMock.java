package com.example.sisgestaskbe.model.mock;

import java.util.ArrayList;
import java.util.List;

import com.example.sisgestaskbe.enumeration.Role;
import com.example.sisgestaskbe.model.User;

public class UserMock {
    
    public User newUser() {
        User user1 = new User();
        user1.setNombre("Carlos Pedroza");
        user1.setEmail("kuria21@gmail.com");
        user1.setRol(Role.LIDER_TECNICO);

        return user1;
    }


    public List<User> getAllUsersByRole() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setNombre("Carlos Pedroza");
        user1.setEmail("carlospedroza@gmail.com");
        user1.setRol(Role.LIDER_TECNICO); 

        User user2 = new User();
        user2.setNombre("Juan Perez");
        user2.setEmail("juanperez@gmail.com");
        user2.setRol(Role.DESARROLLADOR);

        User user3 = new User();
        user3.setNombre("Maria Lopez");
        user3.setEmail("marialopez@gmail.com");
        user3.setRol(Role.DESARROLLADOR);

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }
}
