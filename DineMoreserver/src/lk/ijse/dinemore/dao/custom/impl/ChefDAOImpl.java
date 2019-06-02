package lk.ijse.dinemore.dao.custom.impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import lk.ijse.dinemore.dao.CrudUtil;
import lk.ijse.dinemore.dao.custom.ChefDAO;
import lk.ijse.dinemore.entity.Chef;

import java.util.ArrayList;

public class ChefDAOImpl implements ChefDAO {
    @Override
    public boolean save(Chef chef) throws Exception {
        System.out.println("DAO"+chef.getChefId());
        return CrudUtil.executeUpdate("INSERT INTO Chef VALUES(?,?,?,?,?) ",chef.getChefId(),chef.getChefName(), chef.getChefAddress(), chef.getChefContactNo(), chef.getChefSalary())>0;
    }

    @Override
    public boolean update(Chef chef) throws Exception {
        return false;
    }

    @Override
    public boolean delete(ID id) throws Exception {
        return false;
    }

    @Override
    public Chef search(ID id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Chef> getAll() throws Exception {
        return null;
    }
}
