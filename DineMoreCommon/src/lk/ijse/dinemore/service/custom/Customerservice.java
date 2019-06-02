package lk.ijse.dinemore.service.custom;


import lk.ijse.dinemore.dto.CustomerDTO;
import lk.ijse.dinemore.service.SuperService;

import java.util.List;

public interface Customerservice extends SuperService {
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception;

    public boolean deleteCustomer(CustomerDTO customerDTO) throws Exception;

    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception;

    public CustomerDTO findByIdCustomer(String customerId) throws Exception;

    public List<CustomerDTO> findAllCustomer() throws Exception;
}
