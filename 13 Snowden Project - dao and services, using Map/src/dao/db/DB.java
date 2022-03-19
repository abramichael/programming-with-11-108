package dao.db;

import models.Group;
import models.User;

import java.util.List;

public class DB {
    private static List<User> users;
    private static List<Group> groups;

    private static void loadUsers() {
        // цикл чтения файла users.txt
    }

    private static void loadGroups() {
        // цикл чтения файла groups.txt
    }

    public static List<User> getUsers() {
        if (users == null) {
            loadUsers();
        }
        return users;
    }

    public static List<Group> getGroups() {
        if (groups == null) {
            loadGroups();
        }
        return groups;
    }
}
