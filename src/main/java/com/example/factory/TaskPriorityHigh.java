package com.example.factory;

import com.example.sisgestaskbe.model.Task;

public class TaskPriorityHigh implements TaskPriority {

    public void attentionTask(Task newTask) {
        System.out.println("La tarea: "+ newTask.getName() +"tiene prioridad Alta");
    }
    
}
