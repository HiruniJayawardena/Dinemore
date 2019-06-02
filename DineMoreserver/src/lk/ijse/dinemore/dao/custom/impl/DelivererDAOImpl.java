package lk.ijse.dinemore.dao.custom.impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import lk.ijse.dinemore.dao.CrudUtil;
import lk.ijse.dinemore.dao.custom.DelivererDAO;
import lk.ijse.dinemore.entity.Deliverer;

import java.util.ArrayList;

public class DelivererDAOImpl implements DelivererDAO {
    @Override
    public boolean save(Deliverer deliverer) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Deliverer VALUES(?,?,?,?,?) ",deliverer.getDelivererId(), deliverer.getDelivererName(), deliverer.getDelivererAddress(), deliverer.getDelivererContactNo(), deliverer.getDelivererSalary())>0;
    }

    @Override
    public boolean update(Deliverer deliverer) throws Exception {
        return false;
    }

    @Override
    public boolean delete(ID id) throws Exception {
        return false;
    }

    @Override
    public Deliverer search(ID id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Deliverer> getAll() throws Exception {
        return null;
    }
}
