package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatsCalculator {
    private Statistics statistics;
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private int averagePostsOnUser;
    private int averageCommentsOnUser;
    private int averageCommentsOnPost;

    public ForumStatsCalculator(Statistics statistics){
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(){
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        averagePostsOnUser = (postsQuantity / usersQuantity);
        averageCommentsOnUser = (commentsQuantity / usersQuantity);
        averageCommentsOnPost = (commentsQuantity / postsQuantity);
    }

    public int getUsersQuantity(){
        return usersQuantity;
    }

    public int getPostsQuantity(int postsQuantity){
        return postsQuantity;
    }

    public int getCommentsQuantity(int commentsQuantity){
        return commentsQuantity;
    }

    public int getAveragePostsOnUser(){
        return averagePostsOnUser;
    }

    public int getAverageCommentsOnUser(){
        return averageCommentsOnUser;
    }

    public int getAverageCommentsOnPost(){
        return averageCommentsOnPost;
    }
}
