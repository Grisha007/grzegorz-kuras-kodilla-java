package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatsCalculatorTestSuite {
    @Test
    public void testFirstCalculateAdvStatistics(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("User 0");
        users.add("User 1");
        users.add("User 2");
        users.add("User 3");
        users.add("User 4");
        users.add("User 5");
        users.add("User 6");
        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.commentsCount()).thenReturn(783);
        when(statisticMock.postsCount()).thenReturn(0);

        ForumStatsCalculator calculator = new ForumStatsCalculator(statisticMock);

        //When
        calculator.calculateAdvStatistics();

        //Then
        Assert.assertEquals(7, calculator.getUsersQuantity());
        Assert.assertEquals(0, calculator.getPostsQuantity());
        Assert.assertEquals(783, calculator.getCommentsQuantity());
        Assert.assertEquals(0/7, calculator.getAveragePostsOnUser(), 0.01);
        Assert.assertEquals(783/7, calculator.getAverageCommentsOnUser(), 0.01);
        Assert.assertEquals(0, calculator.getAverageCommentsOnPost(), 0.01); //783/0 = 0
    }

    @Test
    public void testSecondCalculateAdvStatistics(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("User 0");
        users.add("User 1");
        users.add("User 2");
        users.add("User 3");
        users.add("User 4");
        users.add("User 5");
        users.add("User 6");
        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.commentsCount()).thenReturn(783);
        when(statisticMock.postsCount()).thenReturn(1000);

        ForumStatsCalculator calculator = new ForumStatsCalculator(statisticMock);

        //When
        calculator.calculateAdvStatistics();

        //Then
        Assert.assertEquals(7, calculator.getUsersQuantity());
        Assert.assertEquals(1000, calculator.getPostsQuantity());
        Assert.assertEquals(783, calculator.getCommentsQuantity());
        Assert.assertEquals(1000/7, calculator.getAveragePostsOnUser(), 0.01);
        Assert.assertEquals(783/7, calculator.getAverageCommentsOnUser(), 0.01);
        Assert.assertEquals(783/1000, calculator.getAverageCommentsOnPost(), 0.01);
    }

    @Test
    public void testThirdCalculateAdvStatistics(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("User 0");
        users.add("User 1");
        users.add("User 2");
        users.add("User 3");
        users.add("User 4");
        users.add("User 5");
        users.add("User 6");
        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.postsCount()).thenReturn(1000);

        ForumStatsCalculator calculator = new ForumStatsCalculator(statisticMock);

        //When
        calculator.calculateAdvStatistics();

        //Then
        Assert.assertEquals(7, calculator.getUsersQuantity());
        Assert.assertEquals(1000, calculator.getPostsQuantity());
        Assert.assertEquals(0, calculator.getCommentsQuantity());
        Assert.assertEquals(1000/7, calculator.getAveragePostsOnUser(), 0.01);
        Assert.assertEquals(0/7, calculator.getAverageCommentsOnUser(), 0.01);
        Assert.assertEquals(0/1000, calculator.getAverageCommentsOnPost(), 0.01);
    }

    @Test
    public void testFourthCalculateAdvStatistics(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("User 0");
        users.add("User 1");
        users.add("User 2");
        users.add("User 3");
        users.add("User 4");
        users.add("User 5");
        users.add("User 6");
        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.commentsCount()).thenReturn(500);
        when(statisticMock.postsCount()).thenReturn(1000);

        ForumStatsCalculator calculator = new ForumStatsCalculator(statisticMock);

        //When
        calculator.calculateAdvStatistics();

        //Then
        Assert.assertEquals(7, calculator.getUsersQuantity());
        Assert.assertEquals(1000, calculator.getPostsQuantity());
        Assert.assertEquals(500, calculator.getCommentsQuantity());
        Assert.assertEquals(1000/7, calculator.getAveragePostsOnUser(), 0.01);
        Assert.assertEquals(500/7, calculator.getAverageCommentsOnUser(), 0.01);
        Assert.assertEquals(500/1000, calculator.getAverageCommentsOnPost(), 0.01);
    }

    @Test
    public void testFifthCalculateAdvStatistics(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("User 0");
        users.add("User 1");
        users.add("User 2");
        users.add("User 3");
        users.add("User 4");
        users.add("User 5");
        users.add("User 6");
        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.commentsCount()).thenReturn(5000);
        when(statisticMock.postsCount()).thenReturn(1000);

        ForumStatsCalculator calculator = new ForumStatsCalculator(statisticMock);

        //When
        calculator.calculateAdvStatistics();

        //Then
        Assert.assertEquals(7, calculator.getUsersQuantity());
        Assert.assertEquals(1000, calculator.getPostsQuantity());
        Assert.assertEquals(5000, calculator.getCommentsQuantity());
        Assert.assertEquals(1000/7, calculator.getAveragePostsOnUser(), 0.01);
        Assert.assertEquals(5000/7, calculator.getAverageCommentsOnUser(), 0.01);
        Assert.assertEquals(5000/1000, calculator.getAverageCommentsOnPost(), 0.01);
    }

    @Test
    public void testSixthCalculateAdvStatistics(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();

        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.commentsCount()).thenReturn(5000);
        when(statisticMock.postsCount()).thenReturn(1000);

        ForumStatsCalculator calculator = new ForumStatsCalculator(statisticMock);

        //When
        calculator.calculateAdvStatistics();

        //Then
        Assert.assertEquals(0, calculator.getUsersQuantity());
        Assert.assertEquals(1000, calculator.getPostsQuantity());
        Assert.assertEquals(5000, calculator.getCommentsQuantity());
        Assert.assertEquals(0, calculator.getAveragePostsOnUser(), 0.01); //1000/0 = 0
        Assert.assertEquals(0, calculator.getAverageCommentsOnUser(), 0.01); //5000/0 = 0
        Assert.assertEquals(5000/1000, calculator.getAverageCommentsOnPost(), 0.01);
    }

    @Test
    public void testSeventhCalculateAdvStatistics(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        for(int n = 0; n < 100; n++){
            users.add("User " + n);
        }
        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.commentsCount()).thenReturn(5000);
        when(statisticMock.postsCount()).thenReturn(1000);

        ForumStatsCalculator calculator = new ForumStatsCalculator(statisticMock);

        //When
        calculator.calculateAdvStatistics();

        //Then
        Assert.assertEquals(100, calculator.getUsersQuantity());
        Assert.assertEquals(1000, calculator.getPostsQuantity());
        Assert.assertEquals(5000, calculator.getCommentsQuantity());
        Assert.assertEquals(1000/100, calculator.getAveragePostsOnUser(), 0.01);
        Assert.assertEquals(5000/100, calculator.getAverageCommentsOnUser(), 0.01);
        Assert.assertEquals(5000/1000, calculator.getAverageCommentsOnPost(), 0.01);
    }
}
