package com.niviz.di.diLearning.controllers;

import com.niviz.di.diLearning.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class InternationalController {

    private final GreetingService greetingService;

    public InternationalController(@Qualifier("interService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
