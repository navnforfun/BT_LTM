/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan8_TuanTuHoa;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author ngocanh
 */
public class ex3_client_udp {
    public static void main(String[] args) {
        try {
            DatagramSocket socketRecieved = new DatagramSocket(123);

            byte[] recievedData = new byte[1024];
            DatagramPacket recivedPacket = new DatagramPacket(recievedData, recievedData.length);
            socketRecieved.receive(recivedPacket);
            // chuyen mang byte thanh doi tuong;
            ByteArrayInputStream bis = new ByteArrayInputStream(recivedPacket.getData());
            ObjectInputStream ois = new ObjectInputStream(bis);
            student recievedSt = (student) ois.readObject();
            System.out.println("Da nhan dc doi tuong");
            System.out.println("Ten: " + recievedSt.getName());
            System.out.println("Tuoi: " + recievedSt.getAge());
        } catch (Exception e) {
        }
    }
}
