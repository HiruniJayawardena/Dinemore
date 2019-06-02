package lk.ijse.dinemore.dao;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;

public interface CrudDAO<T, id> extends SuperDAO {

    public boolean save(T enttity) throws Exception;

    public boolean update(T entity) throws Exception;

    public boolean delete(ID id) throws  Exception;

    public T search(ID id) throws Exception;

    public ArrayList<T> getAll() throws Exception;
}
