package lk.ijse.dinemore.business.custom.impl;

import lk.ijse.dinemore.business.custom.DelivererBO;
import lk.ijse.dinemore.dao.DAOFactory;
import lk.ijse.dinemore.dao.custom.DelivererDAO;
import lk.ijse.dinemore.dto.DelivererDTO;
import lk.ijse.dinemore.entity.Deliverer;

import java.util.List;

import static lk.ijse.dinemore.business.BOFactory.BOTypes.DELIVERER;

public class DelivererBOImpl implements DelivererBO {

    private DelivererDAO delivererDAO;

    public DelivererBOImpl() {
        this.delivererDAO=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.DELIVERER);
    }

    @Override
    public boolean addDeliverer(DelivererDTO deliverer) throws Exception {
        return  delivererDAO.save(new Deliverer(deliverer.getDelivererId(), deliverer.getDelivererName(), deliverer.getDelivererAddress(), deliverer.getDelivererContactNo(), deliverer.getDelivererSalary()));
    }

    @Override
    public boolean updateDeliverer(DelivererDTO deliverer) throws Exception {
        return false;
    }

    @Override
    public boolean deleteDeliverer(String delivererId) throws Exception {
        return false;
    }

    @Override
    public DelivererDTO searchdeliverer(String delivererId) throws Exception {
        return null;
    }

    @Override
    public List<DelivererDTO> getAllDeliverers() throws Exception {
        return null;
    }
}
