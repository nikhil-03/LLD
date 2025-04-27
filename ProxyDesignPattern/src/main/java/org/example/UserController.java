package org.example;

import java.util.List;

public interface UserController {
    void addUser(User user,String access);
    List<User> getAllUsers(String access);
    void deleteUserByName(String name,String access);
}
