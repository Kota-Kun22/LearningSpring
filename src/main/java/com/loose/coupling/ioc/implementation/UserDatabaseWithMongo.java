package com.loose.coupling.ioc.implementation;

public class UserDatabaseWithMongo  implements UserDataProvider {
    @Override
    public String getUserName() {
        return "Harsh Rastogi is the user with mongo";
    }

    @Override
    public int getUserId() {
        return  73550;
    }
}
