package org.lanqiao.dao;

import org.lanqiao.entity.Dynamic;

import java.util.List;

/**
 * @作者：dhc
 * @创建时间：21:21 2018/8/27
 * @描述：DynaimicDao接口
 */
public interface DynamicDao {
    /**
     * 发表动态（刘志辉）
     * @param d
     * @return
     */
    //public int addDynamic(Dynamic d);

    /**
     * 根据用户名查询作品所有信息(段)
     * @param username
     * @return
     */
    //public List<Dynamic> findDynamic(String username);

   // public int updateDynamic(Dynamic d);//点赞，要先判断，根据文本内	容

    /**
     * 显示所有得动态（分页）
     * @param  pageNum，pageSize
     * @return List<Dynamic>
     */
    public List<Dynamic> showDynamic(int pageNum, int pageSize);

    /**
     * 统计动态的总数量（王咸林）
     * @param
     * @return
     */
    public int getDynamicCount();

}
