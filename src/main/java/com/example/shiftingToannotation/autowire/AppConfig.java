package com.example.shiftingToannotation.autowire;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.example.shiftingToannotation.autowire")
public class AppConfig {
    //here we are scanning all the packages and subpackages of com.example.shiftingToannotation package
}
