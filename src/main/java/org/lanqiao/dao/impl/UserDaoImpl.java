package org.lanqiao.dao.impl;
import org.lanqiao.dao.BaseDao;
import org.lanqiao.dao.UserDao;
import org.lanqiao.entity.User;

import java.util.List;
import java.util.concurrent.CountDownLatch;

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

        @Override
    public int updateUserInfo(User u) {
        return executeUpdate("update User set u_name=?,u_password=?,u_sex=?,u_birthday=?" +
                "u_hometown=?,u_nowlive=?,u_job=?,u_email=?,u_image=?,u_phone=?,u_introduce=? where u_id=?",new Object[]{
                        u.getU_name(),u.getU_password(),u.getU_sex(),u.getU_birthday(),u.getU_hometown(),u.getU_nowlive(),
                u.getU_job(),u.getU_email(),u.getU_image(),u.getU_phone(),u.getU_introduce(),u.getU_id()
        });
    }
//    @Override
//    public int updateUserInfo(ArrayList<String> colName, ArrayList<String> colValue, String u) {
//        return 0;
//    }
    @Override
    public int deleteUserInfo(User u) {
        return executeUpdate("delete from User where u_id = ?",new Object[]{u.getU_id()});
    }

    @Override
    public int insertUesrInfo(User user) {
        return executeUpdate("insert into User(u_name,u_phone,u_password) values(?,?,?)",new Object[]{user.getU_name(),user.getU_phone(),user.getU_password()});
    }

    @Override
    public User checkLockUser(User u) {
        List<User> userList = executeQuery("select * from User" +
                " where u_name = ? and u_password = ? and u_phone = ?",new Object[]{u.getU_name(),u.getU_password(),u.getU_phone()});
        if(userList.size()>0){
            return userList.get(0);
        }else{
            return null;
        }
    }

    @Override
    public int CountUser() {
        return getCount("select count(*) from User");
    }

    @Override
    public List<User> showAllUserInfo(int pageNum,int pageSize) {
        return executeQuery("select * from User limit ?,?",new Object[]{(pageNum-1)*pageSize,pageSize});
    }

//    @Override
//    public User findUser(String msg) {
//        List<User> list = executeQuery("select * from User where u_name like '%?%'",new Object[]{msg});
//        return null;
//    }

    public static void main(String[] args) {


    }

}
