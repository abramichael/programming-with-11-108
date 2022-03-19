package dao;

import dao.db.DB;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private final List<User> users;

    public UserDAO() {
        users = DB.getUsers();
    }

    public List<User> getUsersByCity(String city) {
        List<User> result = new ArrayList<>();
        for (User u : users) {
            if (u.getCity().equals(city)) {
                result.add(u);
            }
        }
        return result;
    }

    public List<User> getUsersByLastName(String lastname) {
        List<User> result = DB.getUsers();
        for (User u : users) {
            if (u.getLastname().equals(lastname)) {
                result.add(u);
            }
        }
        return result;
    }

}
