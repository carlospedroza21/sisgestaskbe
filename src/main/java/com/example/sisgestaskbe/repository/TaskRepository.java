package com.example.sisgestaskbe.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.sisgestaskbe.model.Task;
import com.example.sisgestaskbe.model.mock.TaskMock;

@Repository
public class TaskRepository {
    
    public List<Task> findByStatus(String status) {
        TaskMock taskMock = new TaskMock();
        return taskMock.findByStatus();
    }

    public List<Task> findByUserId(int userId) {
        TaskMock taskMock = new TaskMock();
        return taskMock.findByUserId();
    }

    public Task save(Task task) {
        TaskMock taskMock = new TaskMock();
        return taskMock.save();
    }

    public Task update(Task task) {
        TaskMock taskMock = new TaskMock();
        return taskMock.update();
    }
}
