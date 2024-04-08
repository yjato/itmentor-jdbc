package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Aboba","Kringe",(byte) 20);
        userService.saveUser("Vasiliy","Ivasyk",(byte) 21);
        userService.saveUser("Nastya","Sabanina",(byte) 20);
        userService.saveUser("Danya","yjato",(byte) 18);
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
