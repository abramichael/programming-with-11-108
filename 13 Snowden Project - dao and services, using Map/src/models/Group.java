package models;

import java.util.List;

public class Group {
    private long id;
    private String name;
    private String city;
    private List<User> members;

    public int getNumberOfMembers() {
        return members.size();
    }

    public int getNumberFromSameCity() {
        int k = 0;
        for (User u : members) {
            if (u.getCity().equals(city)) {
                k++;
            }
        }
        return k;
    }

    public String getName() {
        return name;
    }
}
