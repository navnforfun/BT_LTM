/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan4_Inet;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ngocanh
 */
public class ex1_inet {

    public static void main(String[] args) {
        try {
            InetAddress addByName = InetAddress.getByName("google.com");
            InetAddress addByIp = InetAddress.getByName("192.168.10.37");
            System.out.println("Address by name: " + addByName);
            System.out.println("Address by ip: " + addByIp);
            // su dung getter setter
            // lay ten  may chu 
            InetAddress addByName1 = InetAddress.getByName("facebook.com");

            String hostname = addByName1.getHostName();
            System.out.println("hostname: " + hostname);
            // lay dia chi ip
            String ip = addByName1.getHostAddress();
            System.out.println("Dia chi ip: " + ip);
            //
            InetAddress addByName2 = InetAddress.getByName("facebook.com");
            boolean isIp4 = addByName2 instanceof java.net.Inet4Address;
            System.out.println("Co phai ip 4 khong: " + isIp4);
            boolean isIp6 = addByName2 instanceof java.net.Inet6Address;
            System.out.println("Co phai ip 6 khong: " + isIp6);

        } catch (UnknownHostException ex) {
            Logger.getLogger(ex1_inet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
