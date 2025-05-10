package com.tight.coupling;

public class UserDatabase {
    public String getUserDetails(){
        //directly accessing the database here
        return "User Details from the database";
    }
}
