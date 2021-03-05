package com.mehditmimi.correctioncolle.business;

import com.mehditmimi.correctioncolle.dao.UserDao;
import com.mehditmimi.correctioncolle.models.User;

public class DefaultServices implements Services{
    private UserDao userDao;
    public DefaultServices(UserDao userDao)
    {
        this.userDao=userDao;
    }
    @Override
    public boolean seConnecter(String email, String password) {
        User user=userDao.getUser(email);
        if(user!=null && user.getPassword().equals(password))
            return true;
        return false;
    }
}
