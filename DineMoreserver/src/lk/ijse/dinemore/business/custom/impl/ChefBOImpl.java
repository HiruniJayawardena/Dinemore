package lk.ijse.dinemore.business.custom.impl;

import lk.ijse.dinemore.business.custom.ChefBO;
import lk.ijse.dinemore.dao.DAOFactory;
import lk.ijse.dinemore.dao.custom.ChefDAO;
import lk.ijse.dinemore.dto.ChefDTO;
import lk.ijse.dinemore.entity.Chef;

import java.util.List;

public class ChefBOImpl implements ChefBO {

    private ChefDAO chefDAO;

    public ChefBOImpl() {
        this.chefDAO=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CHEF);
    }

    @Override
    public boolean addChef(ChefDTO chef) throws Exception {
        System.out.println("BOIMPL"+chef.getChefId());
        return chefDAO.save(new Chef(chef.getChefId(), chef.getChefName(), chef.getChefAddress(), chef.getChefContactNo(), chef.getChefSalary()));
    }

    @Override
    public boolean updateChef(ChefDTO chef) throws Exception {
        return false;
    }

    @Override
    public boolean deleteChef(String chefId) throws Exception {
        return false;
    }

    @Override
    public ChefDTO searhChef(String chefId) throws Exception {
        return null;
    }

    @Override
    public List<ChefDTO> getAllChefs() throws Exception {
        return null;
    }
}
