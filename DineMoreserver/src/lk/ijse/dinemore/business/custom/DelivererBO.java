package lk.ijse.dinemore.business.custom;

import lk.ijse.dinemore.business.SuperBO;
import lk.ijse.dinemore.dto.DelivererDTO;

import java.util.List;

public interface DelivererBO extends SuperBO {
    public boolean addDeliverer(DelivererDTO deliverer) throws Exception;

    public boolean updateDeliverer(DelivererDTO deliverer) throws Exception;

    public boolean deleteDeliverer(String delivererId) throws Exception;

    public DelivererDTO searchdeliverer(String delivererId) throws Exception;

    public List<DelivererDTO> getAllDeliverers() throws Exception;
}
