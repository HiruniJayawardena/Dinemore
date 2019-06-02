package lk.ijse.dinemore.service.custom;

import lk.ijse.dinemore.dto.OperatorsDTO;
import lk.ijse.dinemore.service.SuperService;

import java.util.List;

public interface OperatorsService extends SuperService {
    public boolean addOperators(OperatorsDTO operatorsDTO) throws Exception;

    public boolean deleteOperators(OperatorsDTO operatorsDTO) throws Exception;

    public boolean updateOperators(OperatorsDTO operatorsDTO) throws Exception;

    public OperatorsDTO findByIdOperators(String operatorId) throws Exception;

    public List<OperatorsDTO> findAllOperators() throws Exception;
}
