/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1_Network;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 *
 * @author ngocanh
 */
public class ex3_ShowIpLocals {
    public static void main(String[] args) {
        
        try {
            Enumeration<NetworkInterface> netInterface = NetworkInterface.getNetworkInterfaces();
            while (netInterface.hasMoreElements()) {
                NetworkInterface networkInterface = netInterface.nextElement();
                Enumeration<InetAddress> inetAddress = networkInterface.getInetAddresses();
                while (inetAddress.hasMoreElements()) {
                    InetAddress address = inetAddress.nextElement();
                    System.out.print("Interface: "+ networkInterface.getName());
                    System.out.println(" - Address: " + address.getHostAddress());
                    
                }
                
            }
        } catch (Exception e) {
        }
    }
}
