package com.example.demo.topic_interceptor.rest;

import com.example.demo.topic_interceptor.exception.MyCustomException;
import com.example.demo.topic_interceptor.utils.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/topic_interceptors")
public class UserController {

    @Autowired
    public User user;

//    @GetMapping
//    public ResponseEntity<String> getUser(@RequestParam(value = "id", defaultValue = "-1") int userId) {
//        if(userId==-1) {
//            throw new MyCustomException("user not found with " + userId);
//        }
//        System.out.println("user fetched successfully with id " + userId);
//        return ResponseEntity.ok("Success: Id found");
//    }

    @GetMapping
    public ResponseEntity<String> getUser(@RequestParam(value = "id", defaultValue = "-1") int userId) {
        String response = user.getUser(userId);
        System.out.println("requested response is " + response);
        return ResponseEntity.ok(response);
    }
}
