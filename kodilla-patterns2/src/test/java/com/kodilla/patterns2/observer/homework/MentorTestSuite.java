package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {
    @Test
    public void testUpdate(){
        //Given
        StudentTask javaDeveloperBootcamp = new JavaDeveloperStudentTask();
        StudentTask webDeveloperBootcamp = new WebDeveloperStudentTask();
        Mentor janKowalski = new Mentor("Jan Kowalski");
        Mentor adamNowak = new Mentor("Adam Nowak");
        javaDeveloperBootcamp.registerObserver(janKowalski);
        webDeveloperBootcamp.registerObserver(janKowalski);
        javaDeveloperBootcamp.registerObserver(adamNowak);
        //When
        javaDeveloperBootcamp.addTask("Task 1 - task solution");
        webDeveloperBootcamp.addTask("Task 2 - task solution");
        javaDeveloperBootcamp.addTask("Task 3 - task solution");
        webDeveloperBootcamp.addTask("Task 4 - task solution");
        javaDeveloperBootcamp.addTask("Task 5 - task solution");
        //Then
        assertEquals(5, janKowalski.getUpdateCount());
        assertEquals(3, adamNowak.getUpdateCount());
    }
}
