package lk.ijse.dinemore.service.impl.custom.impl;

import lk.ijse.dinemore.business.custom.OperatorsBO;
import lk.ijse.dinemore.business.custom.impl.OperatorsBOImpl;
import lk.ijse.dinemore.dto.OperatorsDTO;
import lk.ijse.dinemore.service.custom.OperatorsService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class OperatorsServiceImpl extends UnicastRemoteObject implements OperatorsService {
    private OperatorsBO operatorsBO;

    public OperatorsServiceImpl() throws RemoteException {
        operatorsBO=new OperatorsBOImpl();
    }

    @Override
    public boolean addOperators(OperatorsDTO operatorsDTO) throws Exception {
       return operatorsBO.addOperator(operatorsDTO);
    }

    @Override
    public boolean deleteOperators(OperatorsDTO operatorsDTO) throws Exception {
        return false;
    }

    @Override
    public boolean updateOperators(OperatorsDTO operatorsDTO) throws Exception {
        return false;
    }

    @Override
    public OperatorsDTO findByIdOperators(String operatorId) throws Exception {
        return null;
    }

    @Override
    public List<OperatorsDTO> findAllOperators() throws Exception {
        return null;
    }
}
