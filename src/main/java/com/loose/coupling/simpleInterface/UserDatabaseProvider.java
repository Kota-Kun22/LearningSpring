package com.loose.coupling.simpleInterface;

public class UserDatabaseProvider  implements UserDataProvider{


    @Override
    public String getUserName() {
        return "Harsh from the User Database Provider";
    }

    @Override
    public int getUserId() {
        return 21032001;
    }
}
