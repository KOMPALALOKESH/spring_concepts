package com.example.demo.topic_conditional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DBConnection {

    @Autowired(required = false) // This allows the application to start even if no SQLConnection is present
    private SQLConnection sqlConnection;

    @Autowired(required = false) // This allows the application to start even if no NOSQLConnection is present
    private NOSQLConnection nosqlConnection;

    @PostConstruct // This method will be called after the bean is initialized and all dependencies are injected
    public void init() {
        if (sqlConnection != null) {
            System.out.println("SQL Connection is connected");
        } else if (nosqlConnection != null) {
            System.out.println("NOSQL Connection is connected");
        } else {
            System.out.println("No database connection available");
        }
    }
    
}
