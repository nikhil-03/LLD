package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String accessTypeADMIN="ADMIN";
        String accessTypeSTANDARD="STANDARD";

        User user=new User(5000,"Nikhil");
        User user2=new User(2000,"Prakash");

        UserControllerImpl userController = new UserControllerImpl();
        UserController userController2=new UserControllerProxy(userController);


        userController2.addUser(user,accessTypeADMIN);
        userController2.addUser(user2,accessTypeADMIN);

        List<User> users=userController2.getAllUsers(accessTypeSTANDARD);
        for(User user1:users)System.out.println(user1.name);

    }
}