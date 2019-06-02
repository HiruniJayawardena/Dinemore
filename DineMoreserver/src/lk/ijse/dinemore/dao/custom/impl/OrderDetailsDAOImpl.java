package lk.ijse.dinemore.dao.custom.impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import lk.ijse.dinemore.dao.custom.OrderDetailsDAO;
import lk.ijse.dinemore.entity.OrderDetails;

import java.util.ArrayList;

public class OrderDetailsDAOImpl implements OrderDetailsDAO {
    @Override
    public boolean save(OrderDetails enttity) throws Exception {
        return false;
    }

    @Override
    public boolean update(OrderDetails entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(ID id) throws Exception {
        return false;
    }

    @Override
    public OrderDetails search(ID id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderDetails> getAll() throws Exception {
        return null;
    }
}
