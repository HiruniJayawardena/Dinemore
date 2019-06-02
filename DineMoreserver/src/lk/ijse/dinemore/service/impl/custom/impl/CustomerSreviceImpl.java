package lk.ijse.dinemore.service.impl.custom.impl;

import lk.ijse.dinemore.business.custom.CustomerBO;
import lk.ijse.dinemore.business.custom.impl.CustomerBOImpl;
import lk.ijse.dinemore.dto.CustomerDTO;
import lk.ijse.dinemore.service.custom.Customerservice;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class CustomerSreviceImpl extends UnicastRemoteObject implements Customerservice {
    private CustomerBO customerBO;
    public CustomerSreviceImpl() throws RemoteException {
        customerBO=new CustomerBOImpl();
    }

    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception {
        return customerBO.addCustomer(customerDTO);
    }

    @Override
    public boolean deleteCustomer(CustomerDTO customerDTO) throws Exception {
        return false;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception {
        return false;
    }

    @Override
    public CustomerDTO findByIdCustomer(String customerId) throws Exception {
        return null;
    }

    @Override
    public List<CustomerDTO> findAllCustomer() throws Exception {
        return null;
    }
}
