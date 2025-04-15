package com.niviz.di.diLearning;

import com.niviz.di.diLearning.controllers.*;
import com.niviz.di.diLearning.services.ConstructorGreetingServiceImpl;
import com.niviz.di.diLearning.services.SetterGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiLearningApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiLearningApplication.class, args);

		InternationalController internationalController = (InternationalController) ctx.getBean("internationalController");
		System.out.println(internationalController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayhello();

		System.out.println(greeting);

		System.out.println("--------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		setterInjectedController.setGreetingService(new SetterGreetingService());
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
