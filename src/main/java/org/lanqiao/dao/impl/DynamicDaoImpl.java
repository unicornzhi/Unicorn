package org.lanqiao.dao.impl;

import org.lanqiao.dao.BaseDao;
import org.lanqiao.dao.DynamicDao;
import org.lanqiao.entity.Dynamic;

import java.util.List;

public class DynamicDaoImpl extends BaseDao<Dynamic> implements DynamicDao {

    @Override
    public List<Dynamic> showDynamic(int pageNum, int pageSize) {
        return executeQuery("select * from Dynamic limit ?,?",new Object[]{(pageNum-1)*pageSize,pageSize});
    }

    @Override
    public int getDynamicCount() {
        return getCount("select count(*) from Dynamic");
    }


    public static void main(String[] args) {
        System.out.println(new DynamicDaoImpl().showDynamic(1,3));
    }

}
