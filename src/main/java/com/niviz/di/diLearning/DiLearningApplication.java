package com.niviz.di.diLearning;

import com.niviz.di.diLearning.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiLearningApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiLearningApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayhello();

		System.out.println(greeting);
	}

}
