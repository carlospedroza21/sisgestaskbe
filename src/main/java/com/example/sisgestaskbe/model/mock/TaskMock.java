package com.example.sisgestaskbe.model.mock;

import java.util.List;

import com.example.sisgestaskbe.enumeration.Role;
import com.example.sisgestaskbe.enumeration.TaskState;
import com.example.sisgestaskbe.model.Task;
import com.example.sisgestaskbe.model.User;

public class TaskMock {
    
    public List<Task> findByStatus() {

        User user2 = new User();
        user2.setId(2);
        user2.setNombre("Juan Perez");
        user2.setEmail("juanperez@gmail.com");
        user2.setRol(Role.DESARROLLADOR);

        User user3 = new User();
        user3.setId(3);
        user3.setNombre("Maria Lopez");
        user3.setEmail("marialopez@gmail.com");
        user3.setRol(Role.DESARROLLADOR);

        List<Task> tasks = List.of(
            new Task(1, "Tarea 1", user2, TaskState.PENDIENTE),
            new Task(2, "Tarea 2", user2, TaskState.EN_PROGRESO),
            new Task(3, "Tarea 3", user3, TaskState.EN_PROGRESO),
            new Task(4, "Tarea 4", user3, TaskState.PENDIENTE),
            new Task(5, "Tarea 5", user3, TaskState.COMPLETADA)
        );

        return tasks;
    }

    public List<Task> findByUserId() {

        User user3 = new User();
        user3.setId(3);
        user3.setNombre("Maria Lopez");
        user3.setEmail("marialopez@gmail.com");
        user3.setRol(Role.DESARROLLADOR);

        List<Task> tasks = List.of(
            new Task(3, "Tarea 3", user3, TaskState.EN_PROGRESO),
            new Task(4, "Tarea 4", user3, TaskState.PENDIENTE),
            new Task(5, "Tarea 5", user3, TaskState.COMPLETADA)
        );

        return tasks;
    }

    public Task save() {
        User user2 = new User();
        user2.setId(2);
        user2.setNombre("Juan Perez");
        user2.setEmail("juanperez@gmail.com");
        user2.setRol(Role.DESARROLLADOR);

        Task task1 = new Task(3, "Tarea 3", user2, TaskState.EN_PROGRESO);

        return task1;
    }

    public Task update() {
        User user2 = new User();
        user2.setId(2);
        user2.setNombre("Juan Perez Modificado" );
        user2.setEmail("juanperez@gmail.com");
        user2.setRol(Role.DESARROLLADOR);

        Task task1 = new Task(3, "Tarea 3", user2, TaskState.COMPLETADA);

        return task1;
    }
}
