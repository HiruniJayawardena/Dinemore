package lk.ijse.dinemore.business.custom.impl;

import lk.ijse.dinemore.business.custom.ItemBO;
import lk.ijse.dinemore.dao.DAOFactory;
import lk.ijse.dinemore.dao.custom.ItemDAO;
import lk.ijse.dinemore.dto.ItemDTO;
import lk.ijse.dinemore.entity.Item;

import java.util.List;

public class ItemBOImpl implements ItemBO{
    private ItemDAO itemDAO;

    public ItemBOImpl() {
        this.itemDAO=DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEM);
    }

    @Override
    public boolean addItewm(ItemDTO item) throws Exception {
        return itemDAO.save(new Item(item.getItemCode(), item.getItemName(), item.getPrice()));
    }

    @Override
    public boolean updateItem(Item item) throws Exception {
        return false;
    }

    @Override
    public boolean deleteItem(String itemCode) throws Exception {
        return false;
    }

    @Override
    public ItemDTO searchItem(String itemCode) throws Exception {
        return null;
    }

    @Override
    public List<ItemDTO> getAllItems() throws Exception {
        return null;
    }
}
