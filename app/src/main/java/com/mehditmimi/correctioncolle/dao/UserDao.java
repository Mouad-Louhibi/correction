package com.mehditmimi.correctioncolle.dao;

import com.mehditmimi.correctioncolle.models.User;

public interface UserDao {
    public User getUser(String email);

}
