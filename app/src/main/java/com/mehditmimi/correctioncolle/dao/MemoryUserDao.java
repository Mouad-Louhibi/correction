package com.mehditmimi.correctioncolle.dao;

import com.mehditmimi.correctioncolle.models.User;

import java.util.ArrayList;
import java.util.List;

public class MemoryUserDao implements UserDao{
    private List<User> users;

    public MemoryUserDao()
    {
        users=new ArrayList<>();
        users.add(new User("mehditmimi@live.fr","324234234"));
        users.add(new User("alae@gmail.com","wer324"));
    }

    @Override
    public User getUser(String email) {
        for (User u : users)
            if(u.getEmail().equals(email))
                return u;
        return null;
    }
}
