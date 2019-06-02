package lk.ijse.dinemore.service.impl.custom.impl;

import lk.ijse.dinemore.business.BOFactory;
import lk.ijse.dinemore.business.SuperBO;
import lk.ijse.dinemore.business.custom.ChefBO;
import lk.ijse.dinemore.business.custom.impl.ChefBOImpl;
import lk.ijse.dinemore.dto.ChefDTO;
import lk.ijse.dinemore.service.custom.ChefService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ChefServiceImpl extends UnicastRemoteObject implements ChefService {

    private ChefBO chefBO;

    public ChefServiceImpl() throws RemoteException {
//        BOFactory.getInstance().getBO(BOFactory.BOTypes.CHEF);
//        chefBO=(ChefBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CHEF);
        chefBO=new ChefBOImpl();
    }

    @Override
    public boolean addChef(ChefDTO chefDTO) throws Exception {
        System.out.println("hiru");
        return chefBO.addChef(chefDTO);


    }

    @Override
    public boolean deleteChef(ChefDTO chefDTO) throws Exception {
        return false;
    }

    @Override
    public boolean updateChef(ChefDTO chefDTO) throws Exception {
        return false;
    }

    @Override
    public ChefDTO findByIdChef(String id) throws Exception {
        return null;
    }

    @Override
    public List<ChefDTO> findAllChef() throws Exception {
        return chefBO.getAllChefs();
    }
}
