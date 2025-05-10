package com.loose.coupling.ioc.implementation;

public class UserManager {

    private UserDataProvider userDataProvider;


    public UserManager(UserDataProvider userDataProvider){
      this.userDataProvider = userDataProvider;
    }


    public String getUserName(){
        return userDataProvider.getUserName();

    }
    public int getUserId(){
        return userDataProvider.getUserId();

    }
}
