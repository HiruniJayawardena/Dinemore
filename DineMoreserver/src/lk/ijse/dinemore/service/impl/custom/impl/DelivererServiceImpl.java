package lk.ijse.dinemore.service.impl.custom.impl;

import lk.ijse.dinemore.business.custom.DelivererBO;
import lk.ijse.dinemore.business.custom.impl.DelivererBOImpl;
import lk.ijse.dinemore.dto.DelivererDTO;
import lk.ijse.dinemore.service.custom.DelivererService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class DelivererServiceImpl extends UnicastRemoteObject implements DelivererService {

    private DelivererBO delivererBO;

    public DelivererServiceImpl() throws RemoteException {
        delivererBO=new DelivererBOImpl();
    }

    @Override
    public boolean addDeliverer(DelivererDTO delivererDTO) throws Exception {
       return  delivererBO.addDeliverer(delivererDTO);
    }

    @Override
    public boolean deleteDeliverer(DelivererDTO delivererDTO) throws Exception {
        return false;
    }

    @Override
    public boolean updateDeliverer(DelivererDTO delivererDTO) throws Exception {
        return false;
    }

    @Override
    public DelivererDTO findByIdDeliverer(String delivererId) throws Exception {
        return null;
    }

    @Override
    public List<DelivererDTO> findAllDeliverer() throws Exception {
        return null;
    }
}
