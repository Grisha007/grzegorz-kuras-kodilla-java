package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList();
    }

//    public int addTaskToList() {
//        for(int n = 0; n < 5; n++) {
//            tasks.add("Task " + n);
//        }
//        System.out.println(tasks);
//        return tasks.size();
//    }

    public void addTask(String string) {
        tasks.add(string);
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                '}';
    }
}
