package com.kodilla.patterns2.observer.homework;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Mentor implements ObserverHomework {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentTask studentTask) {
        System.out.println(mentorName + ": New resolved task in course " + studentTask.getName() + "\n"
                + " (total: " + studentTask.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
