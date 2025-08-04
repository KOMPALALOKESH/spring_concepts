package com.example.demo.topic_conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "db.type", havingValue =  "sql", matchIfMissing = false)
public class SQLConnection {
    
    SQLConnection() {
        System.out.println("SQL Connection available..");
    }
}
