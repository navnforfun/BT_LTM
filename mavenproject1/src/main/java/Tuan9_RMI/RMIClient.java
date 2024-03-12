package Tuan9_RMI;


import java.rmi.Naming;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngocanh
 */
public class RMIClient {
    public static void main(String[] args) {
        try {
            //tim doi tuong tu may chu
            RemoteInterface obj = (RemoteInterface)Naming.lookup("//localhost:123/hello");
            // goi tu xa 
            System.out.println(obj.sayHello());
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
