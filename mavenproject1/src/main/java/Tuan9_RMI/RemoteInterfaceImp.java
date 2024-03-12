package Tuan9_RMI;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ngocanh
 */
public class RemoteInterfaceImp extends UnicastRemoteObject implements RemoteInterface {

    public RemoteInterfaceImp() throws RemoteException {
        super();
    }
    //Ghi de phuong thuc truu tuong
    @Override
    public String sayHello() throws RemoteException {
        return "Hi I am server";
    }

}
