package lk.ijse.dinemore.business.custom;

import lk.ijse.dinemore.business.SuperBO;
import lk.ijse.dinemore.dto.ItemDTO;
import lk.ijse.dinemore.entity.Item;

import java.util.List;

public interface ItemBO extends SuperBO {
    public boolean addItewm(ItemDTO item) throws Exception;

    public boolean updateItem(Item item) throws Exception;

    public boolean deleteItem(String itemCode) throws Exception;

    public ItemDTO searchItem(String itemCode) throws Exception;

    public List<ItemDTO> getAllItems() throws Exception;
}
