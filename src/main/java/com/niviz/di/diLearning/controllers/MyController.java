package com.niviz.di.diLearning.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayhello(){
        System.out.println("Hello All!");
        return "Hey folks!!";
    }
}
