package lk.ijse.dinemore.business.custom;

import lk.ijse.dinemore.dto.PaymentDTO;

import java.util.List;

public interface PaymentBO {
    public boolean addPayment(PaymentDTO payment) throws Exception;

    public boolean updatePayment(PaymentDTO payment) throws Exception;

    public boolean deletePayment(String paymentId) throws Exception;

    public PaymentDTO searchPayment(String paymentId) throws Exception;

    public List<PaymentDTO> getAllPaymnets() throws Exception;
}
