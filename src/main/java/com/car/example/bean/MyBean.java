package com.car.example.bean;


public class   MyBean {
    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public void showMessage(){
        System.out.println("YOUR message is :: "+message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
