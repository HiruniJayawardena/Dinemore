package lk.ijse.dinemore.business.custom.impl;

import lk.ijse.dinemore.business.custom.PaymentBO;
import lk.ijse.dinemore.dto.PaymentDTO;

import java.util.List;

public class PaymentsBOImpl implements PaymentBO {
    @Override
    public boolean addPayment(PaymentDTO payment) throws Exception {
        return false;
    }

    @Override
    public boolean updatePayment(PaymentDTO payment) throws Exception {
        return false;
    }

    @Override
    public boolean deletePayment(String paymentId) throws Exception {
        return false;
    }

    @Override
    public PaymentDTO searchPayment(String paymentId) throws Exception {
        return null;
    }

    @Override
    public List<PaymentDTO> getAllPaymnets() throws Exception {
        return null;
    }
}
