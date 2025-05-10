package com.example.autowire.type;

public class Car {

    private Specification specification;

    //when we try to autowire ByName then the injection happens with the help of setter
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details: "+  specification.toString());
    }
}
