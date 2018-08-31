package org.lanqiao.dao.impl;
import org.lanqiao.dao.BaseDao;
import org.lanqiao.dao.UserDao;
import org.lanqiao.entity.User;
import java.util.ArrayList;
import java.util.List;
public class UserDaoImpl extends BaseDao<User> implements UserDao  {
    /**
     * 刘志辉
     * 实现获取用户头像
     * @param u
     * @return
     */
    @Override
    public User getUserImage(User u) {
        List<User> listUser=executeQuery("select u_image from User where u_id=?",new Object[]{u.getU_id()});
        return listUser.get(0);
    }





    //    @Override
//    public int updateUserInfo(User u, String colName) {
//        return 0;
//    }
//    @Override
//    public int updateUserInfo(ArrayList<String> colName, ArrayList<String> colValue, String u) {
//        return 0;
//    }
//    @Override
//    public int deleteUserInfo(User u) {
//        return 0;
//    }
//
    @Override
    public int insertUesrInfo(User user) {
        return executeUpdate("insert into User(u_name,u_phone,u_password) values(?,?,?)",new Object[]{user.getU_name(),user.getU_phone(),user.getU_password()});
    }
//
//    @Override
//    public List<User> showAllUserInfo(String sql) {
//        return executeQuery(sql);
//    }
//
//    @Override
//    public List<User> findUser(User u) {
//        return null;
//    }

}
