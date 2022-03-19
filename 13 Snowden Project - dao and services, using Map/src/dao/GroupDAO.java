package dao;

import dao.db.DB;
import models.Group;

import java.util.List;

public class GroupDAO {

    public List<Group> getAllGroups() {
        return DB.getGroups();
    }
}
