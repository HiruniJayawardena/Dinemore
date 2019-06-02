package lk.ijse.dinemore.service.custom;

import lk.ijse.dinemore.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    public boolean addPayment(PaymentDTO paymentDTO) throws Exception;

    public boolean deletePayment(PaymentDTO paymentDTO) throws Exception;

    public boolean updatePayment(PaymentDTO paymentDTO) throws Exception;

    public PaymentDTO findByIdPayment(String paymentId) throws Exception;

    public List<PaymentDTO> findAllPayment() throws Exception;
}
