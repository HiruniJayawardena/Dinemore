package lk.ijse.dinemore.service.impl;

import lk.ijse.dinemore.service.ServiceFactory;
import lk.ijse.dinemore.service.SuperService;
import lk.ijse.dinemore.service.impl.custom.impl.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory {

    private static ServiceFactory serviceFactory;

    @Override
    public SuperService getService(ServiceTypes type) throws Exception {
        switch (type){
            case CHEF:
                return new ChefServiceImpl();
            case DELIVERER:
                return new DelivererServiceImpl();
            case OPERATOR:
                return new OperatorsServiceImpl();
            case ITEM:
                return new ItemServiceImpl();
            case CUSTOMER:
                return new CustomerSreviceImpl();
            default:
                return null;
        }

    }

    public ServiceFactoryImpl() throws RemoteException {
    }

    public static ServiceFactory getInstance() throws RemoteException {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactoryImpl();
        }
        return serviceFactory;
    }



}
