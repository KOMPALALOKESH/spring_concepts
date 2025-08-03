package com.example.demo.topic_interceptor.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class MyCustomInterceptor {

    @Pointcut("@annotation(com.example.demo.topic_interceptor.interceptor.MyCustomAnnotation)")
    public void MyCustomAnnotationPointCut() {}

    @Around("MyCustomAnnotationPointCut()")
    public String invoke(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("CI: before actual method..");

        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        if(method.isAnnotationPresent(MyCustomAnnotation.class)) {
            MyCustomAnnotation annotation = method.getAnnotation(MyCustomAnnotation.class);
            System.out.println("CI: name from annotation is: " + annotation.name());
        }

        Object result = joinPoint.proceed();

        System.out.println("CI: after actual method..");
        System.out.println("CI: process finished.");
        return result.toString();
    }
}
