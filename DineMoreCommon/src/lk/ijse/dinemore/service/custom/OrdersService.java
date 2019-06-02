package lk.ijse.dinemore.service.custom;

import lk.ijse.dinemore.dto.OrdersDTO;

import java.util.List;

public interface OrdersService {
    public boolean addOrder(OrdersDTO ordersDTO) throws Exception;

    public boolean deleteOrder(OrdersDTO ordersDTO) throws Exception;

    public boolean updateOrder(OrdersDTO ordersDTO) throws Exception;

    public OrdersDTO findByIdOrder(String orderId) throws Exception;

    public List<OrdersDTO> findAllOrder() throws Exception;
}
