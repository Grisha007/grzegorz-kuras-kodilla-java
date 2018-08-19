package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        int sizeOfToDoList = board.getToDoList().addTaskToList();
        int sizeOfInProgressList = board.getInProgressList().addTaskToList();
        int sizeOfDoneList = board.getDoneList().addTaskToList();
        //Then
        Assert.assertEquals(5, sizeOfToDoList);
        Assert.assertEquals(5, sizeOfInProgressList);
        Assert.assertEquals(5, sizeOfDoneList);
    }
}
