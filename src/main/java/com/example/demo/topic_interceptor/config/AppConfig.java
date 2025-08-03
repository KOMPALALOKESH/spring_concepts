package com.example.demo.topic_interceptor.config;

import com.example.demo.topic_interceptor.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Autowired
    public MyInterceptor myInterceptor;

//    @Bean // if i dont use @Component in MyCustomInterceptor
//    public MyCustomInterceptor myCustomInterceptor() { return myCustomInterceptor(); };

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(myInterceptor);
//                .addPathPatterns("/topic_interceptors/**");
//                .excludePathPatterns("/topic_interceptors/update", "/topic_interceptors/delete");
    }
}
