package fr.epsi.b3.utils;

import fr.epsi.b3.model.User;

import java.util.Comparator;

public class UserScoreComparator implements Comparator<User> {
    public int compare(User user1, User user2) {
        return  user2.getScore() - user1.getScore();
    }
}
