package org.lanqiao.dao;
import org.lanqiao.entity.User;
import java.util.ArrayList;
import java.util.List;
/**
 * @描述：UserDao接口
 */
public interface UserDao {
    /**
     * 刘志辉
     * 获取用户头像
     */
    public User  getUserImage(User u);

//    /**
//     * 修改用户信息（更新单列）（王咸林，段）
//     * @param u
//     * @param colName
//     * @return
//     */
//    public int updateUserInfo(User u, String colName);
//
//    /**
//     * 更新个人设置信息（更新多列），记得邮箱
//     * @param colName
//     * @param colValue
//     * @param u
//     * @return
//     */
//    public int updateUserInfo(ArrayList<String> colName, ArrayList<String> colValue, String u);
//
//    /**
//     * 删除用户信息（王咸林）
//     * @param u
//     * @return
//     */
//    public int deleteUserInfo(User u);
//
//    /**
//     * 增加用户,在注册那里做就ok（王咸林）
//     * @param u
//     * @return
//     */
//    public int insertUesrInfo(User u);
//
//    /**
//     * 显示所有用户	信息（分页）（王咸林）
//     * @param pageNumber
//     * @param pagesize
//     * @return
//     */
//    public List<User> showAllUserInfo(String sql);
//
//    /**
//     * 查询用户信息(模糊查询)（王咸林），根据用户名获得用户头像地址（段），修改密码前的查询判断（段）
//     * @param u
//     * @return
//     */
//    public List<User> findUser(User u);




}
