package services;

import dao.GroupDAO;
import dao.UserDAO;
import models.Group;
import models.User;

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

    /** count percentage of existing friendships
     * by the number of all possible friendships.
     */
    public Group getMostFriendlyGroup() {
        // The comparator by friendships is needed
        List<Group> groups = groupDAO.getAllGroups();
        // We find the max value by this comparator
        Group g = groups.stream()
                .max((g1, g2)
                        -> (this.getFriendshipPercent(g1)
                            - this.getFriendshipPercent(g2)) >= 0 ? 1 : -1)
				.orElseThrow(NoSuchElementException::new);
		return g
    }

    private double getFriendshipPercent(Group g) {
        List<User> members = g.getMembers();
        int count = 0;
        for (int i = 0; i < members.size() - 1; i++) {
            for (int j = i + 1; j < members.size(); j++) {
                if (userService.areFriends(members.get(i), members.get(j))) {
                    count += 1;
                }
            }
        }
        int total = members.size() * (members.size() - 1) / 2;
        return (double) count / total;
    }

    /** Group is friendly if its friendship graph
     * is connected
     * @return list of friendly Groups
     */

    public List<Group> getFriendlyGroup() {

    }


}
