package lk.ijse.dinemore.dao.custom.impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import lk.ijse.dinemore.dao.CrudUtil;
import lk.ijse.dinemore.dao.custom.CustomerDAO;
import lk.ijse.dinemore.entity.Customer;

import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean save(Customer customer) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?,?) ", customer.getCustomerId(), customer.getCustomerName(), customer.getCustomerNIC(), customer.getCustomerTP(), customer.getHouseNo(), customer.getLandMark(), customer.getTown(), customer.getCardType(), customer.getCardNo(), customer.getExpireDate())>0;
    }

    @Override
    public boolean update(Customer entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(ID id) throws Exception {
        return false;
    }

    @Override
    public Customer search(ID id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Customer> getAll() throws Exception {
        return null;
    }
}
