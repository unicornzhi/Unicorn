package org.lanqiao.dao.impl;

import org.lanqiao.dao.BaseDao;
import org.lanqiao.dao.CaipuDao;
import org.lanqiao.entity.Caipu;

import java.util.List;

public class CaipuDaoImpl extends BaseDao<Caipu> implements CaipuDao {

    @Override
    public List<Caipu> showCaipu(int pageNum, int pageSize) {
        return executeQuery("select * from Caipu limit ?,?",new Object[]{(pageNum-1)*pageSize,pageSize});
    }

    @Override
    public int getCaipuCount() {
        return getCount("select count(*) from Caipu");
    }

    public static void main(String[] args) {
        System.out.println(new CaipuDaoImpl().showCaipu(1,10));
        System.out.println(new CaipuDaoImpl().getCaipuCount());
    }

}
