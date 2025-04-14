package com.niviz.di.diLearning.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Say Hello!!!";
    }
}
