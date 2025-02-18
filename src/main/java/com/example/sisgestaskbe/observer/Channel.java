package com.example.sisgestaskbe.observer;

import com.example.sisgestaskbe.model.Task;

public interface Channel {
    
    public void updateTask(Task newTask);
}
