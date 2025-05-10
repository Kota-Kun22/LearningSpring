package com.loose.coupling.ioc.implementation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExamples {
    public static void main(String[] args) {


        ApplicationContext context= new ClassPathXmlApplicationContext("application_IOC_Loose_Coupling_Implementation.xml");



//        UserDataProvider databaseProvider = new UserDatabaseProvider();
//        UserManager userManagerWithDatabase = new UserManager(databaseProvider);
        UserManager userManagerWithDatabase = (UserManager) context.getBean("userManagerWithUserDatabaseProvider");
        System.out.println(userManagerWithDatabase.getUserName());
        System.out.println(userManagerWithDatabase.getUserId());



//        UserDataProvider mongoProvider = new UserDatabaseWithMongo();
//        UserManager userManagerWithMongo = new UserManager(mongoProvider);
        UserManager userManagerWithMongo = (UserManager) context.getBean("userManagerWithMongoDatabase");
        System.out.println(userManagerWithMongo.getUserName());
        System.out.println(userManagerWithMongo.getUserId());
    }
}
