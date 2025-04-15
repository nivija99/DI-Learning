package com.niviz.di.diLearning.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES","default"})
@Service("interService")
public class SpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Halo mundo - Spanish";
    }
}
