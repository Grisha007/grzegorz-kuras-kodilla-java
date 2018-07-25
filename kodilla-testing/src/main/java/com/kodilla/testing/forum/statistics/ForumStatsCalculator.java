package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatsCalculator {
    private Statistics statistics;
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostsOnUser;
    private double averageCommentsOnUser;
    private double averageCommentsOnPost;

    public ForumStatsCalculator(Statistics statistics){
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(){
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if(usersQuantity > 0) {
            averagePostsOnUser = (postsQuantity / usersQuantity);
        }else{
            averagePostsOnUser = 0;
        }
        if(usersQuantity > 0) {
            averageCommentsOnUser = (commentsQuantity / usersQuantity);
        }else{
            averageCommentsOnUser = 0;
        }
        if(postsQuantity > 0) {
            averageCommentsOnPost = (commentsQuantity / postsQuantity);
        }else{
            averageCommentsOnPost = 0;
        }
    }

    public int getUsersQuantity(){
        return usersQuantity;
    }

    public int getPostsQuantity(){
        return postsQuantity;
    }

    public int getCommentsQuantity(){
        return commentsQuantity;
    }

    public double getAveragePostsOnUser(){
        return averagePostsOnUser;
    }

    public double getAverageCommentsOnUser(){
        return averageCommentsOnUser;
    }

    public double getAverageCommentsOnPost(){
        return averageCommentsOnPost;
    }
}
