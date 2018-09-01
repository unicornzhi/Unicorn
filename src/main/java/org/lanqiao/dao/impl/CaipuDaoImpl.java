package org.lanqiao.dao.impl;

import org.lanqiao.dao.BaseDao;
import org.lanqiao.dao.CaipuDao;
import org.lanqiao.entity.Caipu;

import java.util.List;

public class CaipuDaoImpl extends BaseDao<Caipu> implements CaipuDao {

    @Override
    public int addCaipu(Caipu cp) {
        return executeUpdate("insert into Caipu (c_name,c_made,c_image,c_step,c_count,c_step_image,u_id,c_introduce) " +
                "values (?,?,?,?,?,?,?,?)",new Object[]{cp.getC_name(),cp.getC_made(),cp.getC_image(),cp.getC_step(),cp.getC_count(),cp.getC_step_image()
        ,cp.getU_id(),cp.getC_introduce()});
    }

    @Override
    public List<Caipu> showCaipu(int pageNum, int pageSize) {
        return executeQuery("select * from Caipu limit ?,?",new Object[]{(pageNum-1)*pageSize,pageSize});
    }

    @Override
    public int getCaipuCount() {
        return getCount("select count(*) from Caipu");
    }

    @Override
    public int deleteCaipu(Caipu c) {
        return executeUpdate("delete from Caipu where c_id=?",new Object[]{c.getC_id()});
    }

}
