package com.example.demo.topic_conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "db.type", havingValue =  "nosql", matchIfMissing = false)
public class NOSQLConnection {
    
    NOSQLConnection() {
        System.out.println("NOSQL Connection available..");
    }
}
