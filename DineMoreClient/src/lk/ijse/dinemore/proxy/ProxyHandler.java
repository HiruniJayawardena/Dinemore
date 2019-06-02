package lk.ijse.dinemore.proxy;

import lk.ijse.dinemore.service.ServiceFactory;
import lk.ijse.dinemore.service.SuperService;
import lk.ijse.dinemore.service.custom.*;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ProxyHandler implements ServiceFactory {

    private static ProxyHandler proxyHandler;
    private ServiceFactory serviceFactory;
    private ChefService chefService;
    private DelivererService delivererService;
    private OperatorsService operatorsService;
    private ItemService itemService;
    private Customerservice customerservice;
    private OrdersService ordersService;
    private PaymentService paymentService;

    public ProxyHandler() {
        try {
            serviceFactory = (ServiceFactory) Naming.lookup("rmi://localhost:4050/Dinemore");
            chefService = (ChefService) serviceFactory.getService(ServiceTypes.CHEF);
            delivererService= (DelivererService) serviceFactory.getService(ServiceTypes.DELIVERER);
             operatorsService = (OperatorsService) serviceFactory.getService(ServiceTypes.OPERATOR);
            itemService = (ItemService) serviceFactory.getService(ServiceTypes.ITEM);
            customerservice = (Customerservice) serviceFactory.getService(ServiceTypes.CUSTOMER);
            ordersService = (OrdersService) serviceFactory.getService(ServiceTypes.ORDER);
            paymentService = (PaymentService) serviceFactory.getService(ServiceTypes.PAYMENT);

            //queueService=(QueueService) serviceFactory.getService(ServiceTypes.QUEUE);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ProxyHandler getInstance() {
        if (proxyHandler == null) {
            proxyHandler = new ProxyHandler();
        }
        return proxyHandler;
    }

    @Override
    public SuperService getService(ServiceTypes type) throws Exception {
        switch (type) {
            case CHEF:
                return chefService;
            case DELIVERER:
                return delivererService;
            case OPERATOR:
                return operatorsService;
            case  ITEM:
                return  itemService;
            case CUSTOMER:
                return customerservice;
//            case ORDER:
//                return ordersService;
//            case PAYMENT:
//                return  paymentService;

//             case QUEUE:
//                return queueService;
            default:
                return null;
        }
    }
}
