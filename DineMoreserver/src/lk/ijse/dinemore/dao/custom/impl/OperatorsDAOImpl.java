package lk.ijse.dinemore.dao.custom.impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import lk.ijse.dinemore.dao.CrudUtil;
import lk.ijse.dinemore.dao.custom.OperatorsDAO;
import lk.ijse.dinemore.entity.Operators;

import java.util.ArrayList;

public class OperatorsDAOImpl implements OperatorsDAO {

    @Override
    public boolean save(Operators operators) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Operators VALUES(?,?,?,?,?) ", operators.getOperatorId(), operators.getOperatorName(), operators.getOperatorAddress(), operators.getOperatorContactNo(), operators.getOperatorSalary())>0;
    }

    @Override
    public boolean update(Operators entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(ID id) throws Exception {
        return false;
    }

    @Override
    public Operators search(ID id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Operators> getAll() throws Exception {
        return null;
    }
}
