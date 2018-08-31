package org.lanqiao.dao;

import org.lanqiao.entity.Caipu;
import org.lanqiao.entity.User;

import java.util.List;

/**
 * @作者：dhc
 * @创建时间：21:02 2018/8/27
 * @描述：CaipuDao接口
 */
public interface CaipuDao {
    /**
     * 导航栏查询(王筱萌）
     * 根据用户名查询菜谱的id、封面和名字，用于菜谱显示。（段）
     * 最近流行，最新创建（刘)
     * @param u
     * @return
     */
    //public List<Caipu> findCaipu(User u);

    /**
     * 增加菜谱(张敏)
     * @param cp
     * @return
     */
   // public int addCaipu(Caipu cp);
    /**
     * 根据用户ID查询收藏菜谱(张敏)
     * @param uid
     * @return
     */
    //public List<Caipu> getCaipuCollectionById(int uid);

    /**
     * 后台显示分页（王咸林）
     * @param pageNum,pageSize
     * @return
     */
    public List<Caipu> showCaipu(int pageNum,int pageSize);

    /**
     * 统计菜谱的总数量（王咸林）
     * @param
     * @return
     */
    public int getCaipuCount();




}
