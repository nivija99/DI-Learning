package com.niviz.di.diLearning.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("interService")
public class EnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - English";
    }
}
