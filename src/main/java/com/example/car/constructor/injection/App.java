package com.example.car.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("applicationConstructorInjection.xml");
        //here applicationContext is creates a spring Container using XML

        Car car = (Car) context.getBean("myCar");
        car.displayDetails();
    }
}
