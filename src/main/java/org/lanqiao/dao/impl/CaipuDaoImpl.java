package org.lanqiao.dao.impl;

import org.lanqiao.dao.BaseDao;
import org.lanqiao.dao.CaipuDao;
import org.lanqiao.entity.Caipu;

import java.util.List;

public class CaipuDaoImpl extends BaseDao<Caipu> implements CaipuDao {
    public List<Caipu> searchC_nameQuery(String keyword) {
        return executeQuery( "select c_name from Caipu where c_name like  \"%\"?\"%\" ",new Object[]{keyword});
//        return executeQuery( "select c_name from Caipu where c_name like ?",new Object[]{"%"+keyword+"%"});
    }

//    @Override
    /*public List<Caipu> searchAllInfoQuery(String c_name) {
        return super.executeQuery("select ");
    }*/






        public static void main(String[] args) {
        List<Caipu> re = new CaipuDaoImpl().searchC_nameQuery("鱼");
        System.out.println(re);
    }

















}
