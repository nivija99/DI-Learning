package com.niviz.di.diLearning.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
