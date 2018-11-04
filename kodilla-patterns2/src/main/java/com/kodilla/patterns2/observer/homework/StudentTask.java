package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTask implements ObservableHomework {
    private final List<ObserverHomework> observersHomework;
    private final List<String> tasks;
    private final String name;

    public StudentTask(String name) {
        observersHomework = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String taskTitle) {
        tasks.add(taskTitle);
        notifyObserver();
    }

    @Override
    public void registerObserver(ObserverHomework observerHomework) {
        observersHomework.add(observerHomework);
    }

    @Override
    public void notifyObserver() {
        for(ObserverHomework observerHomework : observersHomework) {
            observerHomework.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverHomework observerHomework) {
        observersHomework.remove(observerHomework);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
