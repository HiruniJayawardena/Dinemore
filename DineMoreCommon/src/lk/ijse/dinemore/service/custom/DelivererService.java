package lk.ijse.dinemore.service.custom;

import lk.ijse.dinemore.dto.DelivererDTO;
import lk.ijse.dinemore.service.SuperService;

import java.util.List;

public interface DelivererService extends SuperService {
    public boolean addDeliverer(DelivererDTO delivererDTO) throws Exception;

    public boolean deleteDeliverer(DelivererDTO delivererDTO) throws Exception;

    public boolean updateDeliverer(DelivererDTO delivererDTO) throws Exception;

    public DelivererDTO findByIdDeliverer(String delivererId) throws Exception;

    public List<DelivererDTO> findAllDeliverer() throws Exception;
}
