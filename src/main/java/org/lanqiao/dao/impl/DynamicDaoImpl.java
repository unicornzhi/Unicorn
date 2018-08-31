package org.lanqiao.dao.impl;

import org.lanqiao.dao.BaseDao;
import org.lanqiao.dao.DynamicDao;
import org.lanqiao.entity.Dynamic;

import java.util.List;

public class DynamicDaoImpl extends BaseDao<Dynamic> implements DynamicDao {
    /**
     * 刘志辉
     * 发表动态
     * @param dynamic
     * @return
     */
    @Override
    public int createDynamic(Dynamic dynamic){
        return    executeUpdate("insert into Dynamic(d_image,d_xinde,u_id,c_id) VALUES(?,?,?,?)",
                    new Object[]{dynamic.getD_image(),dynamic.getD_xinde(),dynamic.getU_id(),dynamic.getC_id()});
    }
    /**
     * 刘志辉
     * 功能：查询动态所有记录条数
     */
    public int getAllDynamicCount(){
     return  getCount("select count(*) from Dynamic");
    }

}
