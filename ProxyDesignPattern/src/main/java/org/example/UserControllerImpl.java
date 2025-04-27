package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserControllerImpl implements UserController{

    List<User> users=new ArrayList<>();

    @Override
    public void addUser(User user,String access) {
        users.add(user);
        System.out.println("User added");
    }

    @Override
    public List<User> getAllUsers(String access) {
        if(users.isEmpty()){
            System.out.println("No user found");
            return null;
        }
        return users;

    }

    @Override
    public void deleteUserByName(String name,String access) {
        for(User user:users){
            if(Objects.equals(user.getName(), name)){
                users.remove(user);
            }
        }
    }
}
