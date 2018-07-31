package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum(){
        usersList.add(new ForumUser(78945, "Username01", 'M', LocalDate.of(1987,6,15), 152));
        usersList.add(new ForumUser(45621, "Username02", 'F', LocalDate.of(1997,5,10), 0));
        usersList.add(new ForumUser(23658, "Username03", 'M', LocalDate.of(1995,2,11), 116));
        usersList.add(new ForumUser(74359, "Username04", 'F', LocalDate.of(2007,5,20), 75));
        usersList.add(new ForumUser(15874, "Username05", 'F', LocalDate.of(1998,10,25), 0));
        usersList.add(new ForumUser(13492, "Username06", 'M', LocalDate.of(2002,9,16), 15));
        usersList.add(new ForumUser(52873, "Username07", 'M', LocalDate.of(1982,4,7), 128));
    }

    public List<ForumUser> getUsersList(){

        return new ArrayList<>(usersList);
    }
}
