package com.baba.notification.NotificationPrioritization.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class dbCheck {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    public void checkConnection() throws Exception{
        System.out.println("Database Connected:"+dataSource.getConnection());
    }
}
