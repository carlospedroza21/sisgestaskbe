package com.example.sisgestaskbe.model;

import com.example.sisgestaskbe.enumeration.TaskState;

public class Task {
    private Integer id;
    private String name;
    private User user;
    private TaskState state;


    public Task() {
    }

    public Task(Integer id, String name, User user, TaskState state) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.state = state;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TaskState getState() {
        return state;
    }

    public void setState(TaskState state) {
        this.state = state;
    }

}
