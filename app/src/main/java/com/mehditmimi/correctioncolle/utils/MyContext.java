package com.mehditmimi.correctioncolle.utils;

import android.app.Application;

import com.mehditmimi.correctioncolle.business.DefaultServices;
import com.mehditmimi.correctioncolle.business.Services;
import com.mehditmimi.correctioncolle.dao.MemoryUserDao;

public class MyContext extends Application {
    private Services services;

    public MyContext(){
        services=new DefaultServices(new MemoryUserDao());
    }
    public Services getServices() {
        return services;
    }
}
