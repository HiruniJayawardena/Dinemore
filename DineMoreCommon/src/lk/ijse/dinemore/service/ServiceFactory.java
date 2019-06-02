package lk.ijse.dinemore.service;

public interface ServiceFactory extends SuperService {
    public enum ServiceTypes {

        CUSTOMER, ORDER, ITEM, CHEF,DELIVERER, PAYMENT, OPERATOR, QUEUE
    }

    public SuperService getService(ServiceTypes type) throws Exception;

}
