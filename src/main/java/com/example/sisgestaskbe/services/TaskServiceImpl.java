package com.example.sisgestaskbe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sisgestaskbe.enumeration.TaskState;
import com.example.sisgestaskbe.model.Task;
import com.example.sisgestaskbe.observer.LtChannel;
import com.example.sisgestaskbe.observer.SisgesTask;
import com.example.sisgestaskbe.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getTasksByStatus(String status) {
        return taskRepository.findByStatus(status);
    }

    @Override
    public List<Task> getTasksByUser(int userId) {
        return taskRepository.findByUserId(userId);
    }

    @Override
    public Task newTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task modifyTask(Task task) {

        LtChannel observer  = new LtChannel();
        SisgesTask observable = new SisgesTask();

        observable.addObserver(observer);
        observable.setChanges(task);

        return taskRepository.update(task);
    }
}