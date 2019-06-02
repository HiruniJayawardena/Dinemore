package lk.ijse.dinemore.business.custom;

import lk.ijse.dinemore.dto.OrdersDTO;

import java.util.List;

public interface OrdersBO {
    public boolean addOrders(OrdersDTO orders) throws Exception;

    public boolean updateOrders(OrdersDTO orders) throws Exception;

    public boolean deleteOrdes(String orderId) throws Exception;

    public OrdersDTO searchOrders(String orderId) throws Exception;

    public List<OrdersDTO> getAllOrders() throws Exception;
}
