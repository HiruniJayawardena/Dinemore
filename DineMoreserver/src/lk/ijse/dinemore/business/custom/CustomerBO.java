package lk.ijse.dinemore.business.custom;

import lk.ijse.dinemore.business.SuperBO;
import lk.ijse.dinemore.dto.CustomerDTO;

import java.util.List;

public interface CustomerBO extends SuperBO {
    public boolean addCustomer(CustomerDTO customer) throws Exception;

    public boolean updateCustomer(CustomerDTO customer) throws Exception;

    public boolean deleteCustomer(String customerId) throws Exception;

    public CustomerDTO searchCustomer(String customerId) throws Exception;

    public List<CustomerDTO> getAllCustomers() throws Exception;
}
