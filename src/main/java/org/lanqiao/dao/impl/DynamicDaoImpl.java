package org.lanqiao.dao.impl;

import org.lanqiao.dao.BaseDao;
import org.lanqiao.dao.DynamicDao;
import org.lanqiao.entity.Dynamic;

import java.util.List;

public class DynamicDaoImpl extends BaseDao<Dynamic> implements DynamicDao {

    @Override
    public int addDynamic(Dynamic d) {
        return executeUpdate("insert into Dynamic (d_image,d_xinde,u_id,c_id) values (?,?,?,?)",new Object[]{d.getD_image(),d.getD_xinde(),d.getU_id(),d.getC_id()});
    }

    @Override
    public int updateDynamic(Dynamic d) {
        return executeUpdate("update Dynamic set d_xinde=? where d_id=?",new Object[]{d.getD_xinde(),d.getD_id()});
    }

    @Override
    public List<Dynamic> showDynamic(int pageNum, int pageSize) {
        return executeQuery("select * from Dynamic limit ?,?",new Object[]{(pageNum-1)*pageSize,pageSize});
    }

    @Override
    public int deleteDynamic(Dynamic d) {
        return executeUpdate("delete from Dynamic where d_id=?",new Object[]{d.getD_id()});
    }

    @Override
    public int getDynamicCount() {
        return getCount("select count(*) from Dynamic");
    }

}
