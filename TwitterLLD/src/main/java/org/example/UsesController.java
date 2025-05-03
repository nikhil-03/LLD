package org.example;

import java.util.List;

public class UsesController {
    List<User> userList;

    public UsesController(List<User> userList) {
        this.userList = userList;
    }
    public void addUser(User user){
        userList.add(user);
    }
    public void removeUser(int userId){
        userList.remove(userId);
    }
    public List<User> getAllUser(){
        return userList;
    }
}
