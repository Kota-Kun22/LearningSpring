package com.example.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("autowireByType.xml");
        //here applicationContext is creating a spring Container using XML

        Car car = (Car) context.getBean("myCar");
        car.displayDetails();
    }
}
