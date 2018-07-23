package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatsCalculator {
    private Statistics statistics;
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;

    public ForumStatsCalculator(Statistics statistics){
        this.statistics = statistics;
    }

    public List<String> calculateAdvStatistics(){
        List<String> users = new ArrayList<>();

        for(String user : statistics){
            users.add(user);
        }
        return users;
    }
}
