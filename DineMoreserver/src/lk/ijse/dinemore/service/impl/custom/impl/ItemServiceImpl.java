package lk.ijse.dinemore.service.impl.custom.impl;

import lk.ijse.dinemore.business.custom.ItemBO;
import lk.ijse.dinemore.business.custom.impl.ItemBOImpl;
import lk.ijse.dinemore.dto.ItemDTO;
import lk.ijse.dinemore.service.custom.ItemService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ItemServiceImpl extends UnicastRemoteObject implements ItemService {
    private ItemBO itemBO;

    public ItemServiceImpl() throws RemoteException {
        itemBO=new ItemBOImpl();
    }

    @Override
    public boolean addItem(ItemDTO itemDTO) throws Exception {
        return  itemBO.addItewm(itemDTO);
    }

    @Override
    public boolean deleteItem(ItemDTO itemDTO) throws Exception {
        return false;
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) throws Exception {
        return false;
    }

    @Override
    public ItemDTO findByIdItem(String itemCode) throws Exception {
        return null;
    }

    @Override
    public List<ItemDTO> findAllItem() throws Exception {
        return null;
    }
}
