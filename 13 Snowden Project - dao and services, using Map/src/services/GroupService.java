package services;

import dao.GroupDAO;
import dao.UserDAO;
import models.Group;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupService {

    private UserDAO userDAO;
    private GroupDAO groupDAO;

    public GroupService() {
        userDAO = new UserDAO();
        groupDAO = new GroupDAO();
    }

    public Map<String, Double> getAllGroupsPercentageSameCity() {
        Map<String, Double> stat = new HashMap<>();
        List<Group> groups = groupDAO.getAllGroups();
        for (Group g : groups) {
            int k = g.getNumberFromSameCity();
            int n = g.getNumberOfMembers();
            stat.put(g.getName(), (double) k / n);
        }
        return stat;
    }


}
