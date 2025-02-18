package com.example.factory;

import com.example.sisgestaskbe.model.Task;

public class TaskPriorityMedium implements TaskPriority {

    public void attentionTask(Task newTask) {
        System.out.println("La tarea: "+ newTask.getName() +"tiene prioridad Media");
    }
}
