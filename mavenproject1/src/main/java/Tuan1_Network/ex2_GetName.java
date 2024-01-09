/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1_Network;

import java.net.InetAddress;

/**
 *
 * @author ngocanh
 */
public class ex2_GetName {

    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getByName("google.com");
            boolean isKn = inet.isReachable(5000);
            if (isKn) {
                System.out.println("Ipadress:  " + inet.getHostAddress());
            } else {
                System.out.println("Khong ket noi");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
