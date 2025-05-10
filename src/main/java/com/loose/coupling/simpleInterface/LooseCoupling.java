package com.loose.coupling.simpleInterface;

public class LooseCoupling {
    public static void main(String[] args) {

        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDatabase = new UserManager(databaseProvider);
        System.out.println(userManagerWithDatabase.getUserName());
        System.out.println(userManagerWithDatabase.getUserId());


        UserDataProvider mongoProvider = new UserDatabaseWithMongo();
        UserManager userManagerWithMongo = new UserManager(mongoProvider);
        System.out.println(userManagerWithMongo.getUserName());
        System.out.println(userManagerWithMongo.getUserId());
    }
}
