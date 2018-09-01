package org.lanqiao.dao;
import org.lanqiao.entity.User;
import java.util.ArrayList;
import java.util.List;
/**
 * @描述：interface UserDao
 */
public interface UserDao {
    /**
     * 刘志辉
     * 获取用户头像
     */
    public User  getUserImage(User u);

    /**
     * 修改用户信息（更新单列）（王咸林，段）
     * @param u
     * @param
     * @return
     */
    public int updateUserInfo(User u);


    /**
     * 删除用户信息（王咸林）
     * @param
     * @return
     */
    public int deleteUserInfo(User u);

    /**
     * 增加用户,在注册那里做就ok（王咸林）
     * @param u
     * @return
     */
    public int insertUesrInfo(User u);

    /**
     * 显示所有用户	信息（分页）（王咸林）
     * @param
     * @param
     * @return
     */
    public List<User> showAllUserInfo(int pageNum,int pageSize);

//    /**
//     * 查询用户信息(模糊查询)（王咸林），根据用户名获得用户头像地址（段），修改密码前的查询判断（段）
//     * @param u
//     * @return
//     */
//    public User findUser(User u);


    /**
     * 登录验证
     * @param
     * @return
     */
    public User checkLockUser(User u);


        /**
     * 查询数据库的总条数
     * @param
     * @return
     */
    public int CountUser();






}
