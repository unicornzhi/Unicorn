package org.lanqiao.dao;

import java.util.Collection;

/**
 * @作者：dhc
 * @创建时间：21:05 2018/8/27
 * @描述：CollectionDao接口
 */
public interface CollectionDao {
    /**
     *用户添加菜谱到收藏表（获取到菜谱的ID）（张敏）
     * @param c
     * @return
     */
    public int addCollection(Collection c);
}
