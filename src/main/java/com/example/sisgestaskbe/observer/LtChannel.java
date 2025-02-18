package com.example.sisgestaskbe.observer;

import com.example.sisgestaskbe.model.Task;

public class LtChannel implements Channel {
    private Task updateTask;

    public void updateTask(Task newTask) {
        this.updateTask = newTask;

        System.out.println("La tarea: " + updateTask.getName() + "que tiene el usuario:" + updateTask.getUser().getNombre() + "cambio de estado a COMPLETADA");
    }
    

    // getter & setter
    public Task getUpdateTask() {
        return updateTask;
    }

    public void setUpdateTask(Task updateTask) {
        this.updateTask = updateTask;
    }
}