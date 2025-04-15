package com.niviz.di.diLearning.controllers;

import com.niviz.di.diLearning.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    @Autowired
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayhello(){
        return greetingService.sayGreeting();
    }
}
