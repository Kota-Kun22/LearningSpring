package com.example.shiftingToannotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.example.shiftingToannotation")
public class AppConfig {
    //here we are scanning all the packages and subpackages of com.example.shiftingToannotation package
}
