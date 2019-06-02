package lk.ijse.dinemore.service.impl.custom.impl;

import lk.ijse.dinemore.dto.OrdersDTO;
import lk.ijse.dinemore.service.custom.OrdersService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class OrdersServiceImpl extends UnicastRemoteObject implements OrdersService {
    public OrdersServiceImpl() throws RemoteException {

    }

    @Override
    public boolean addOrder(OrdersDTO ordersDTO) throws Exception {
        return false;
    }

    @Override
    public boolean deleteOrder(OrdersDTO ordersDTO) throws Exception {
        return false;
    }

    @Override
    public boolean updateOrder(OrdersDTO ordersDTO) throws Exception {
        return false;
    }

    @Override
    public OrdersDTO findByIdOrder(String orderId) throws Exception {
        return null;
    }

    @Override
    public List<OrdersDTO> findAllOrder() throws Exception {
        return null;
    }
}
