package lk.ijse.dinemore.dao.custom.impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import lk.ijse.dinemore.dao.CrudUtil;
import lk.ijse.dinemore.dao.custom.ItemDAO;
import lk.ijse.dinemore.entity.Item;

import java.util.ArrayList;

public class ItemDAOImpl implements ItemDAO {
    @Override
    public boolean save(Item item) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Item VALUES(?,?,?) ", item.getItemCode(), item.getItemName(), item.getPrice())>0;
    }

    @Override
    public boolean update(Item entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(ID id) throws Exception {
        return false;
    }

    @Override
    public Item search(ID id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Item> getAll() throws Exception {
        return null;
    }
}
