package com.example.sisgestaskbe.observer;

import java.util.ArrayList;
import java.util.List;

import com.example.sisgestaskbe.enumeration.TaskState;
import com.example.sisgestaskbe.model.Task;

public class SisgesTask {
    private Task updateTask;
    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel){
        channels.add(channel);
    }

    public void removeObserver(Channel channel){
        channels.remove(channel);
    }

    public void setChanges(Task newTask){
        this.updateTask = newTask;

        if(newTask.getState() != TaskState.COMPLETADA) {
            return;
        }

        for(Channel ch: this.channels){
            ch.updateTask(this.updateTask);
        }
    }
}
