package lk.ijse.dinemore.business.custom;

import lk.ijse.dinemore.business.SuperBO;
import lk.ijse.dinemore.dto.OperatorsDTO;

import java.util.List;

public interface OperatorsBO extends SuperBO {
    public boolean addOperator(OperatorsDTO chef) throws Exception;

    public boolean updateOperator(OperatorsDTO chef) throws Exception;

    public boolean deleteOperator(String operatorId) throws Exception;

    public OperatorsDTO searchoperatpr(String operatorId) throws Exception;

    public List<OperatorsDTO> getAllOperator() throws Exception;
}
