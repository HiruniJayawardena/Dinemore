package lk.ijse.dinemore.business;

import lk.ijse.dinemore.business.custom.impl.ChefBOImpl;
import lk.ijse.dinemore.business.custom.impl.DelivererBOImpl;
import lk.ijse.dinemore.business.custom.impl.ItemBOImpl;
import lk.ijse.dinemore.business.custom.impl.OperatorsBOImpl;

public class BOFactory {
    public enum BOTypes {
        OPERATORS,
//        ORDERS,
//        CUSTOMER,
        DELIVERER,
//        PAYMENT,
        CHEF,
        ITEM
    }

    private static BOFactory boFactory;

    private BOFactory() {

    }

    public static BOFactory getInstance() {
        if (boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;
    }

    public SuperBO getBO(BOTypes type) {
        switch (type) {
         case CHEF:
                return new ChefBOImpl();
            case DELIVERER:
                return new DelivererBOImpl();
            case OPERATORS:
                return new OperatorsBOImpl();
            case ITEM:
                return new ItemBOImpl();
            default:
                return null;
        }
    }
}
