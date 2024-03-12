package Tuan9_RMI;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngocanh
 */
public class RMIServer {

    public static void main(String[] args) {
        try {
            // Khoi tao may chu 
            LocateRegistry.createRegistry(123);
            // tao doi tuong lop remote
            RemoteInterface obj = new RemoteInterfaceImp();
            // dang ky
            Naming.rebind("//localhost:123/hello", obj);
            System.out.println("Server da san sang");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
