package com.mine;

public class User implements Comparable<User> {
    private int points;

    public User(int point) {
        this.points = point;
    }

    @Override
    public int compareTo(User o) {
        return points - o.points;
    }
}
