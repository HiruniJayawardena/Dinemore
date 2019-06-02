package lk.ijse.dinemore.business.custom.impl;

import lk.ijse.dinemore.business.custom.CustomerBO;
import lk.ijse.dinemore.dao.DAOFactory;
import lk.ijse.dinemore.dao.custom.CustomerDAO;
import lk.ijse.dinemore.dto.CustomerDTO;
import lk.ijse.dinemore.entity.Customer;

import java.util.List;

public class CustomerBOImpl implements CustomerBO {
    private CustomerDAO customerDAO;

    public CustomerBOImpl() {
        this.customerDAO=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    }

    @Override
    public boolean addCustomer(CustomerDTO customer) throws Exception {
       return customerDAO.save(new Customer(customer.getCustomerId(), customer.getCustomerName(), customer.getCustomerNIC(), customer.getCustomerTP(), customer.getHouseNo(), customer.getLandMark(), customer.getTown(), customer.getCardType(), customer.getCardNo(), customer.getExpireDate()));
    }

    @Override
    public boolean updateCustomer(CustomerDTO customer) throws Exception {
        return false;
    }

    @Override
    public boolean deleteCustomer(String customerId) throws Exception {
        return false;
    }

    @Override
    public CustomerDTO searchCustomer(String customerId) throws Exception {
        return null;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() throws Exception {
        return null;
    }
}
