package com.example.sisgestaskbe.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.sisgestaskbe.model.Task;
import com.example.sisgestaskbe.services.TaskService;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;
    
    // Obtener lista de tareas por estado
    @GetMapping("/task/status/{status}")
    public List<Task> getTasksByStatus(@PathVariable String status) {
        return taskService.getTasksByStatus(status);
    }

    // Obtener lista de tareas por usuario.
    @GetMapping("/task/user/{userId}")
    public List<Task> getTasksByUser(@PathVariable int userId) {
        return taskService.getTasksByUser(userId);
    }    

    // Crear una nueva tarea
    @PostMapping("/task")
    public Task newTask(@RequestBody Task task) {
        return taskService.newTask(task);
    }

    // Modificar una tarea
    @PutMapping("/task")
    public Task modifyTask(@RequestBody Task task) {
        return taskService.modifyTask(task);
    }
}
