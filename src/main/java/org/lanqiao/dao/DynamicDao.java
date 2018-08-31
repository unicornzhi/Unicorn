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
     * 刘志辉
     * 功能：发表动态
     */
    public  int createDynamic(Dynamic dynamic);

    /**
     * 刘志辉
     * 功能：查询动态所有记录的条数
     */
    public  int getAllDynamicCount();


}
