package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }
    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser user1 = new SimpleUser("Username1", "John Smith");
        //When
        String resultUsername = user1.getUsername();
        System.out.println("Testing username: " + resultUsername);
        //Then
        Assert.assertEquals("Username1", resultUsername);
    }
    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser user1 = new SimpleUser("Username1", "John Smith");
        //When
        String resultRealName = user1.getRealName();
        System.out.println("Testing real name: " + resultRealName);
        //Then
        Assert.assertEquals("John Smith", resultRealName);
    }
}
