package org.example;

import java.util.List;
import java.util.Objects;

public class UserControllerProxy implements UserController{
    UserControllerImpl userController;

    public UserControllerProxy(UserControllerImpl userController) {
        this.userController = userController;
    }

    @Override
    public void addUser(User user, String access) {
        if(Objects.equals(access, "ADMIN")){
            userController.addUser(user,access);
        }
        else{
            System.out.println("you don't have access");
        }
    }

    @Override
    public List<User> getAllUsers(String access) {
        if(Objects.equals(access, "ADMIN")){
            return userController.getAllUsers(access);
        }
        else{
            System.out.println("you don't have access");
        }

        return List.of();
    }

    @Override
    public void deleteUserByName(String name, String access) {
        if(Objects.equals(access, "ADMIN")){
            userController.deleteUserByName(name,access);
        }
        else{
            System.out.println("you don't have access");
        }
    }
}
