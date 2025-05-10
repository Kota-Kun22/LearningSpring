package com.example.autowire.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("autowireByConstructor.xml");
        //here applicationContext is creating a spring Container using XML

        Car car = (Car) context.getBean("myCar");
        car.displayDetails();
    }
}
