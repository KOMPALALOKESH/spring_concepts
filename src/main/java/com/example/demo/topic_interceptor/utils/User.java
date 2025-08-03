package com.example.demo.topic_interceptor.utils;

import com.example.demo.topic_interceptor.interceptor.MyCustomAnnotation;
import org.springframework.stereotype.Component;

@Component
public class User {

    @MyCustomAnnotation(name = "user_name")
    public String getUser(int id) {
        System.out.println("getting details..." + id);
//        String result = "1234";
//        return result;
        return "result " + id;
    }

}
