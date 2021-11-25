package fr.epsi.b3.model;

import java.util.Comparator;

public class UserScoreComparator implements Comparator<User> {
    public int compare(User user1, User user2) {
        return user1.getScore() - user2.getScore();
    }
}