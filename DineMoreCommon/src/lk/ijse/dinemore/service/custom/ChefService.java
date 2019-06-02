package lk.ijse.dinemore.service.custom;

import lk.ijse.dinemore.dto.ChefDTO;
import lk.ijse.dinemore.service.SuperService;

import java.util.List;

public interface ChefService extends SuperService {
    public boolean addChef(ChefDTO chefDTO) throws Exception;

    public boolean deleteChef(ChefDTO chefDTO) throws Exception;

    public boolean updateChef(ChefDTO chefDTO) throws Exception;

    public ChefDTO findByIdChef(String id) throws Exception;

    public List<ChefDTO> findAllChef() throws Exception;
}
