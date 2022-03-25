package dao.db;

import dao.UserDAO;
import models.Group;
import models.Subscription;
import models.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DB {
    private static List<User> users;
    private static List<Group> groups;
    private static List<Subscription> subscriptions;

    private static UserDAO userDAO = new UserDAO();

    private static void loadUsers() {
        // цикл чтения файла users.txt
    }

    private static void loadGroups() {
        // цикл чтения файла groups.txt
    }

    private static void loadSubscriptions() {
        subscriptions = new LinkedList<>();
        try {
            Scanner sc = new Scanner(new File("subcriptions.txt"));
            while(sc.hasNextLine()) {
                String s = sc.nextLine();
                String [] ids = s.split(" ");
                long id1 = Long.parseLong(ids[0]);
                long id2 = Long.parseLong(ids[2]);

                User user1 = userDAO.getUserById(id1);
                User user2 = userDAO.getUserById(id2);

                subscriptions.add(new Subscription(user1, user2));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

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

    public static List<Subscription> getSubscriptions() {
        if (subscriptions == null) {
            loadSubscriptions();
        }
        return subscriptions;
    }

}
