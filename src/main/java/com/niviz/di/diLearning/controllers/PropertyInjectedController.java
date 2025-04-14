package com.niviz.di.diLearning.controllers;

import com.niviz.di.diLearning.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
