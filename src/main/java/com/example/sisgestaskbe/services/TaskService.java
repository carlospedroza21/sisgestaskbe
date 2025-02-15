package com.example.sisgestaskbe.services;

import java.util.List;

import com.example.sisgestaskbe.model.Task;

public interface TaskService {
    public List<Task> getTasksByStatus(String status);
    public List<Task> getTasksByUser(int userId);
    public Task newTask(Task task);
    public Task modifyTask(Task task);
}
