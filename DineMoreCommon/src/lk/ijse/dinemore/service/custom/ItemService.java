package lk.ijse.dinemore.service.custom;

import lk.ijse.dinemore.dto.ItemDTO;
import lk.ijse.dinemore.service.SuperService;

import java.util.List;

public interface ItemService extends SuperService {
    public boolean addItem(ItemDTO itemDTO) throws Exception;

    public boolean deleteItem(ItemDTO itemDTO) throws Exception;

    public boolean updateItem(ItemDTO itemDTO) throws Exception;

    public ItemDTO findByIdItem(String itemCode) throws Exception;

    public List<ItemDTO> findAllItem() throws Exception;
}
