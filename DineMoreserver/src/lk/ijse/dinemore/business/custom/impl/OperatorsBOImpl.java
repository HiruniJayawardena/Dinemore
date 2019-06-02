package lk.ijse.dinemore.business.custom.impl;

import lk.ijse.dinemore.business.custom.OperatorsBO;
import lk.ijse.dinemore.dao.DAOFactory;
import lk.ijse.dinemore.dao.custom.OperatorsDAO;
import lk.ijse.dinemore.dto.OperatorsDTO;
import lk.ijse.dinemore.entity.Chef;
import lk.ijse.dinemore.entity.Operators;

import java.util.List;

public class OperatorsBOImpl implements OperatorsBO {

    private OperatorsDAO operatorsDAO;

    public OperatorsBOImpl() {
        this.operatorsDAO=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.OPERATORS);
    }

    @Override
    public boolean addOperator(OperatorsDTO operators) throws Exception {
        return operatorsDAO.save(new Operators(operators.getOperatorId(), operators.getOperatorName(), operators.getOperatorAddress(), operators.getOperatorContactNo(),operators.getOperatorSalary()));
    }

    @Override
    public boolean updateOperator(OperatorsDTO operators) throws Exception {
        return false;
    }

    @Override
    public boolean deleteOperator(String operatorId) throws Exception {
        return false;
    }

    @Override
    public OperatorsDTO searchoperatpr(String operatorId) throws Exception {
        return null;
    }

    @Override
    public List<OperatorsDTO> getAllOperator() throws Exception {
        return null;
    }
}
