package org.lanqiao.dao.impl;
import org.lanqiao.dao.BaseDao;
import org.lanqiao.dao.UserDao;
import org.lanqiao.entity.User;
import java.util.ArrayList;
import java.util.List;
public class UserDaoImpl extends BaseDao implements UserDao  {

    @Override
    public int updateUserInfo(User u, String colName) {
        return 0;
    }
    @Override
    public int updateUserInfo(ArrayList<String> colName, ArrayList<String> colValue, String u) {
        return 0;
    }
    @Override
    public int deleteUserInfo(User u) {
        return 0;
    }

    @Override
    public int insertUesrInfo(User u) {
        return 0;
    }

    @Override
    public List<User> showAllUserInfo(int pageNumber, int pagesize) {
        return null;
    }

    @Override
    public List<User> findUser(User u) {
        return null;
    }

}
