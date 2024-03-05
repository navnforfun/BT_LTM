/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan7_Udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author ngocanh
 */
public class e2_recieved {
    public static void main(String[] args) {
        try {
            // tao doi tuong
            DatagramSocket socket = new DatagramSocket(12345);
            // tao mang byte
            byte[] nhan = new byte[1024];
            DatagramPacket packet = new DatagramPacket(nhan, nhan.length);
            //nhan goi du lieu
            socket.receive(packet);
            String receiveData = new String (packet.getData(),0,packet.getLength());
            System.out.println(receiveData);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
