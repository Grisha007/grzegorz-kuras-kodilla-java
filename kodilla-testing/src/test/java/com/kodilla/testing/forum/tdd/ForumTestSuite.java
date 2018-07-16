package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTest(){
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost(){
        //Given
        ForumUser user1 = new ForumUser("mrsmith123", "John Smith");

        //When
        user1.addPost("mrsmith123", "Hello. This is my first post!");

        //Then
        Assert.assertEquals(1, user1.getPostQuantity());
    }

    @Test
    public void testAddComment(){
        //Given
        ForumUser user1 = new ForumUser("mrsmith123", "John Smith");
        ForumPost post1 = new ForumPost("Hi. This is my first post1", "mrsmith123");

        //When
        user1.addComment(post1, "mrsmith123", "Thank your for all good words.");

        //Then
        Assert.assertEquals(1, user1.getCommentQuantity());
    }

    @Test
    public void testGetPost(){
        //Given
        ForumUser user1 = new ForumUser("mrsmith123", "John Smith");
        ForumPost post1 = new ForumPost("Hi. This is my first post1", "mrsmith123");
        user1.addPost(post1.getAuthor(), post1.getPostBody());

        //When
        ForumPost retrievedPost;
        retrievedPost = user1.getPost(0);

        //Then
        Assert.assertEquals(post1, retrievedPost);
    }

    @Test
    public void testGetComment(){
        //Given
        ForumUser user1 = new ForumUser("mrsmith123", "John Smith");
        ForumPost post1 = new ForumPost("Hi. This is my first post1", "mrsmith123");
        ForumComment comment1 = new ForumComment(post1, "Thanks for comments!", "mrsmith123");

        user1.addComment(post1, comment1.getAuthor(), comment1.getCommentBody());

        //When
        ForumComment retrievedComment;
        retrievedComment = user1.getComment(0);

        //Then
        Assert.assertEquals(comment1, retrievedComment);
    }

    @Test
    public void testRemovePostNotExisting(){
        //Given
        ForumUser user1 = new ForumUser("mrsmith123", "John Smith");
        ForumPost post1 = new ForumPost("Hi. This is my first post1", "mrsmith123");

        //When
        boolean result = user1.removePost(post1);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting(){
        //Given
        ForumUser user1 = new ForumUser("mrsmith123", "John Smith");
        ForumPost post1 = new ForumPost("Hi. This is my first post1", "mrsmith123");
        ForumComment comment1 = new ForumComment(post1, "Thanks for comments!", "mrsmith123");

        //When
        boolean result = user1.removeComment(comment1);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost(){
        //Given
        ForumUser user1 = new ForumUser("mrsmith123", "John Smith");
        ForumPost post1 = new ForumPost("Hi. This is my first post1", "mrsmith123");

        user1.addPost(post1.getAuthor(), post1.getPostBody());

        //When
        boolean result = user1.removePost(post1);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, user1.getPostQuantity());
    }

    @Test
    public void testRemoveComment(){
        //Given
        ForumUser user1 = new ForumUser("mrsmith123", "John Smith");
        ForumPost post1 = new ForumPost("Hi. This is my first post1", "mrsmith123");
        ForumComment comment1 = new ForumComment(post1, "Thanks for comments!", "mrsmith123");

        user1.addComment(post1, comment1.getAuthor(), comment1.getCommentBody());

        //When
        boolean result = user1.removeComment(comment1);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, user1.getCommentQuantity());
    }
}
