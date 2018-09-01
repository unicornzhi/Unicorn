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
     * 刘志辉
     * 分页查询所有菜谱并根据条件(收藏量，时间)排序
     * @return
     */
    public List<Caipu> findAllCaipuAndSort(String field,int pageNumber,int pageSize );

    /**
     * 获取所有菜谱的记录数，分页用
     * 刘志辉
     */
    public int getAllCaipuCount();

    /**
     * 不确定条件查询数据
     */
    public List<Caipu> findCaipuByfield(Caipu cp);




}
