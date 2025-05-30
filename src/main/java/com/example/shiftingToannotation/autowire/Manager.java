package com.example.shiftingToannotation.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {

    private Employee employee;

    @Autowired()
    public Manager(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "manager{" +
                "employee=" + employee +
                '}';
    }
}
