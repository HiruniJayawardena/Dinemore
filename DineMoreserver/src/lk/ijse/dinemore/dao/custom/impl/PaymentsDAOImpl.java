package lk.ijse.dinemore.dao.custom.impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import lk.ijse.dinemore.dao.custom.PaymentDAO;
import lk.ijse.dinemore.entity.Payement;

import java.util.ArrayList;

public class PaymentsDAOImpl implements PaymentDAO {
    @Override
    public boolean save(Payement enttity) throws Exception {
        return false;
    }

    @Override
    public boolean update(Payement entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(ID id) throws Exception {
        return false;
    }

    @Override
    public Payement search(ID id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Payement> getAll() throws Exception {
        return null;
    }
}
