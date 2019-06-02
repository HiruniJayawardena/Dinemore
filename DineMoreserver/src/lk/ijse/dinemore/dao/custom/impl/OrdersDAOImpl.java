package lk.ijse.dinemore.dao.custom.impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import lk.ijse.dinemore.dao.custom.OrdersDAO;
import lk.ijse.dinemore.entity.Orders;

import java.util.ArrayList;

public class OrdersDAOImpl implements OrdersDAO {
    @Override
    public boolean save(Orders enttity) throws Exception {
        return false;
    }

    @Override
    public boolean update(Orders entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(ID id) throws Exception {
        return false;
    }

    @Override
    public Orders search(ID id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Orders> getAll() throws Exception {
        return null;
    }
}
