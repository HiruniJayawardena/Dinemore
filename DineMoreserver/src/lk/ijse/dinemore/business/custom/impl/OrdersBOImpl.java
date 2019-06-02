package lk.ijse.dinemore.business.custom.impl;

import lk.ijse.dinemore.business.custom.OrdersBO;
import lk.ijse.dinemore.dto.OrdersDTO;

import java.util.List;

public class OrdersBOImpl implements OrdersBO {
    @Override
    public boolean addOrders(OrdersDTO orders) throws Exception {
        return false;
    }

    @Override
    public boolean updateOrders(OrdersDTO orders) throws Exception {
        return false;
    }

    @Override
    public boolean deleteOrdes(String orderId) throws Exception {
        return false;
    }

    @Override
    public OrdersDTO searchOrders(String orderId) throws Exception {
        return null;
    }

    @Override
    public List<OrdersDTO> getAllOrders() throws Exception {
        return null;
    }
}
