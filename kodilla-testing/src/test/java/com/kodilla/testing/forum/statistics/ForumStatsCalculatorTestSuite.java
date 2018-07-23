package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

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

        ForumStatsCalculator calculator = new ForumStatsCalculator(statisticMock);
        //calculator.getUsersQuantity();
        calculator.getPostsQuantity(0);
        calculator.getCommentsQuantity(783);
        calculator.getAveragePostsOnUser();
        calculator.getAverageCommentsOnUser();
        calculator.getAverageCommentsOnPost();

        //When
        int usersQuantityResult = users.size();
        int postQuantityResult = 0;
        int commentsQuantityResult = 783;
        int averagePostsOnUserResult = (0 / users.size());
        int averageCommentsOnUserResult = (783 / users.size());
        int averageCommentsOnPostResult = (783 / 0);

        //Then
        Assert.assertEquals(7, usersQuantityResult);
        Assert.assertEquals(calculator.getPostsQuantity(0), postQuantityResult);
        Assert.assertEquals(calculator.getCommentsQuantity(783), commentsQuantityResult);
        Assert.assertEquals(calculator.getAveragePostsOnUser(), averagePostsOnUserResult);
        Assert.assertEquals(calculator.getAverageCommentsOnUser(), averageCommentsOnUserResult);
        Assert.assertEquals(calculator.getAverageCommentsOnPost(), averageCommentsOnPostResult);
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

        ForumStatsCalculator calculator = new ForumStatsCalculator(statisticMock);
        //calculator.getUsersQuantity();
        calculator.getPostsQuantity(1000);
        calculator.getCommentsQuantity(783);
        calculator.getAveragePostsOnUser();
        calculator.getAverageCommentsOnUser();
        calculator.getAverageCommentsOnPost();

        //When
        int usersQuantityResult = users.size();
        int postQuantityResult = 1000;
        int commentsQuantityResult = 783;
        int averagePostsOnUserResult = (1000 / users.size());
        int averageCommentsOnUserResult = (783 / users.size());
        int averageCommentsOnPostResult = (783 / 1000);

        //Then
        Assert.assertEquals(7, usersQuantityResult);
        Assert.assertEquals(calculator.getPostsQuantity(1000), postQuantityResult);
        Assert.assertEquals(calculator.getCommentsQuantity(783), commentsQuantityResult);
        Assert.assertEquals(calculator.getAveragePostsOnUser(), averagePostsOnUserResult);
        Assert.assertEquals(calculator.getAverageCommentsOnUser(), averageCommentsOnUserResult);
        Assert.assertEquals(calculator.getAverageCommentsOnPost(), averageCommentsOnPostResult);
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

        ForumStatsCalculator calculator = new ForumStatsCalculator(statisticMock);
        //calculator.getUsersQuantity();
        calculator.getPostsQuantity(200);
        calculator.getCommentsQuantity(0);
        calculator.getAveragePostsOnUser();
        calculator.getAverageCommentsOnUser();
        calculator.getAverageCommentsOnPost();

        //When
        int usersQuantityResult = users.size();
        int postQuantityResult = 200;
        int commentsQuantityResult = 0;
        int averagePostsOnUserResult = (200 / users.size());
        int averageCommentsOnUserResult = (0 / users.size());
        int averageCommentsOnPostResult = (0 / 200);

        //Then
        Assert.assertEquals(7, usersQuantityResult);
        Assert.assertEquals(calculator.getPostsQuantity(200), postQuantityResult);
        Assert.assertEquals(calculator.getCommentsQuantity(0), commentsQuantityResult);
        Assert.assertEquals(calculator.getAveragePostsOnUser(), averagePostsOnUserResult);
        Assert.assertEquals(calculator.getAverageCommentsOnUser(), averageCommentsOnUserResult);
        Assert.assertEquals(calculator.getAverageCommentsOnPost(), averageCommentsOnPostResult);
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

        ForumStatsCalculator calculator = new ForumStatsCalculator(statisticMock);
        //calculator.getUsersQuantity();
        calculator.getPostsQuantity(1000);
        calculator.getCommentsQuantity(500);
        calculator.getAveragePostsOnUser();
        calculator.getAverageCommentsOnUser();
        calculator.getAverageCommentsOnPost();

        //When
        int usersQuantityResult = users.size();
        int postQuantityResult = 1000;
        int commentsQuantityResult = 500;
        int averagePostsOnUserResult = (1000 / users.size());
        int averageCommentsOnUserResult = (500 / users.size());
        int averageCommentsOnPostResult = (500 / 1000);

        //Then
        Assert.assertEquals(7, usersQuantityResult);
        Assert.assertEquals(calculator.getPostsQuantity(1000), postQuantityResult);
        Assert.assertEquals(calculator.getCommentsQuantity(500), commentsQuantityResult);
        Assert.assertEquals(calculator.getAveragePostsOnUser(), averagePostsOnUserResult);
        Assert.assertEquals(calculator.getAverageCommentsOnUser(), averageCommentsOnUserResult);
        Assert.assertEquals(calculator.getAverageCommentsOnPost(), averageCommentsOnPostResult);
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

        ForumStatsCalculator calculator = new ForumStatsCalculator(statisticMock);
        //calculator.getUsersQuantity();
        calculator.getPostsQuantity(200);
        calculator.getCommentsQuantity(500);
        calculator.getAveragePostsOnUser();
        calculator.getAverageCommentsOnUser();
        calculator.getAverageCommentsOnPost();

        //When
        int usersQuantityResult = users.size();
        int postQuantityResult = 200;
        int commentsQuantityResult = 500;
        int averagePostsOnUserResult = (200 / users.size());
        int averageCommentsOnUserResult = (500 / users.size());
        int averageCommentsOnPostResult = (500 / 200);

        //Then
        Assert.assertEquals(7, usersQuantityResult);
        Assert.assertEquals(calculator.getPostsQuantity(200), postQuantityResult);
        Assert.assertEquals(calculator.getCommentsQuantity(500), commentsQuantityResult);
        Assert.assertEquals(calculator.getAveragePostsOnUser(), averagePostsOnUserResult);
        Assert.assertEquals(calculator.getAverageCommentsOnUser(), averageCommentsOnUserResult);
        Assert.assertEquals(calculator.getAverageCommentsOnPost(), averageCommentsOnPostResult);
    }

    @Test
    public void testSixthCalculateAdvStatistics(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();

        ForumStatsCalculator calculator = new ForumStatsCalculator(statisticMock);
        //calculator.getUsersQuantity();
        calculator.getPostsQuantity(200);
        calculator.getCommentsQuantity(500);
        calculator.getAveragePostsOnUser();
        calculator.getAverageCommentsOnUser();
        calculator.getAverageCommentsOnPost();

        //When
        int usersQuantityResult = users.size();
        int postQuantityResult = 200;
        int commentsQuantityResult = 500;
        int averagePostsOnUserResult = (200 / users.size());
        int averageCommentsOnUserResult = (500 / users.size());
        int averageCommentsOnPostResult = (500 / 200);

        //Then
        Assert.assertEquals(0, usersQuantityResult);
        Assert.assertEquals(calculator.getPostsQuantity(200), postQuantityResult);
        Assert.assertEquals(calculator.getCommentsQuantity(500), commentsQuantityResult);
        Assert.assertEquals(calculator.getAveragePostsOnUser(), averagePostsOnUserResult);
        Assert.assertEquals(calculator.getAverageCommentsOnUser(), averageCommentsOnUserResult);
        Assert.assertEquals(calculator.getAverageCommentsOnPost(), averageCommentsOnPostResult);
    }

    @Test
    public void testSeventhCalculateAdvStatistics(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<Integer> users = new ArrayList<>();
        for(int n = 0; n < 100; n++){
            users.add(n);
        }

        ForumStatsCalculator calculator = new ForumStatsCalculator(statisticMock);
        //calculator.getUsersQuantity();
        calculator.getPostsQuantity(200);
        calculator.getCommentsQuantity(500);
        calculator.getAveragePostsOnUser();
        calculator.getAverageCommentsOnUser();
        calculator.getAverageCommentsOnPost();

        //When
        int usersQuantityResult = users.size();
        int postQuantityResult = 200;
        int commentsQuantityResult = 500;
        int averagePostsOnUserResult = (200 / users.size());
        int averageCommentsOnUserResult = (500 / users.size());
        int averageCommentsOnPostResult = (500 / 200);

        //Then
        Assert.assertEquals(100, usersQuantityResult);
        Assert.assertEquals(calculator.getPostsQuantity(200), postQuantityResult);
        Assert.assertEquals(calculator.getCommentsQuantity(500), commentsQuantityResult);
        Assert.assertEquals(calculator.getAveragePostsOnUser(), averagePostsOnUserResult);
        Assert.assertEquals(calculator.getAverageCommentsOnUser(), averageCommentsOnUserResult);
        Assert.assertEquals(calculator.getAverageCommentsOnPost(), averageCommentsOnPostResult);
    }
}
