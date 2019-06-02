package lk.ijse.dinemore.startup;

import lk.ijse.dinemore.service.impl.ServiceFactoryImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerStart {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(4050);
            registry.rebind("Dinemore", ServiceFactoryImpl.getInstance());
            System.out.println("Server has been started successfully...");
        } catch (RemoteException ex) {

        }
    }
}
