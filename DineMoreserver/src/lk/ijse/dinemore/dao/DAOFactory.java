package lk.ijse.dinemore.dao;

import lk.ijse.dinemore.dao.custom.impl.*;

public class DAOFactory {

    public enum DAOTypes{
        CHEF, CUSTOMER, DELIVERER, ITEM, OPERATORS, ORDERDETAILS, ORDERS, PAYMENT
    }

    private static DAOFactory daoFactory;

    public DAOFactory() {
    }

    public static DAOFactory getInstance(){
        if(daoFactory==null){
            daoFactory=new DAOFactory();
        }
        return daoFactory;
    }

    public <T extends SuperDAO> T getDAO(DAOTypes daoTypes){
        switch(daoTypes){
            case CHEF:
                return(T) new ChefDAOImpl();
            case DELIVERER:
                return (T) new DelivererDAOImpl();
            case ITEM:
                return (T) new ItemDAOImpl();
            case OPERATORS:
                return (T) new OperatorsDAOImpl();
            case CUSTOMER:
                return (T) new CustomerDAOImpl();
                default:
                    return null;
        }
    }
}
