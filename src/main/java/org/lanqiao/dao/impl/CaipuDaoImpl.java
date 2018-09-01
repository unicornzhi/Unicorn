package org.lanqiao.dao.impl;

import org.lanqiao.dao.BaseDao;
import org.lanqiao.dao.CaipuDao;
import org.lanqiao.entity.Caipu;

import java.util.ArrayList;
import java.util.List;

public class CaipuDaoImpl extends BaseDao<Caipu> implements CaipuDao {
    /**
     * 刘志辉
     * 查询所有菜谱并根据条件(收藏量，时间)排序
     * @return
     */
    @Override
    public List<Caipu> findAllCaipuAndSort(String field,int pageNumber,int pageSize) {
        System.out.println("CaipuDaoImpl:"+field+" "+pageNumber+" "+pageSize);
        List<Caipu> list= executeQuery("select c_id,c_name,c_image,c_count,c_createtime from Caipu ORDER BY ? desc LIMIT ?,?",new Object[]{field,(pageNumber-1)*pageSize,pageSize});

        for (Caipu cp: list){
            System.out.println(cp.getC_name());
        }

        return list;
    }
    /**
     * 获取所有菜谱记录数,分页用
     * 刘志辉
     */
    public int getAllCaipuCount(){
         return getRecordCount("select count(*) from Caipu");
    }
    @Override
    public List<Caipu> findCaipuByfield(Caipu cp) {
        String sql="select * from Caipu where 1=1";
        List<Object> list =new ArrayList<Object>();

        if(cp.getC_name()!=null && cp.getC_name()!=""){
            sql+=" and c_name=? ";
            list.add(cp.getC_name());
        }
        if(cp.getU_id()!=0){
            sql+=" and u_id=? ";
            list.add(cp.getU_id());
        }

        return executeQuery(sql,list.toArray());
    }
}
