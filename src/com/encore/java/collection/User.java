package com.encore.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class User {
    String ssn;
    String name;

    public User(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [" +
                "ssn=\"" + ssn + '\"' +
                ", name=\"" + name + '\"' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        User u = (User) o;
        if(this.ssn.equals(u.ssn)){
            result = true;
        }
        return result;

    }

    @Override
    public int hashCode() {
        return Integer.parseInt(ssn);

    }

    public static void main(String[] args) {
        User u1 = new User("123","김푸름");
        User u2 = new User("123","김푸름");

        HashSet<User>users = new HashSet<>();
        users.add(u1);
        users.add(u2);
        System.out.println(users);
        Iterator<User>iter = users.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
