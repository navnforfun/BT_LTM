package Tuan9_RMI;


import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author ngocanh
 */
public interface RemoteInterface extends Remote{
    String sayHello() throws RemoteException;
}
