/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan8_TuanTuHoa;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author ngocanh
 */
public class ex3_UDP {

    public static void main(String[] args) {
        try {
            student st = new student("Ngoc Anh", 20);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(st);
            byte[] data = bos.toByteArray();
            // send qua UDP
            InetAddress address = InetAddress.getByName("localhost");
            int port = 123;
            DatagramSocket socket = new DatagramSocket();
            DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
            socket.send(packet);

            System.out.println("Da dui du lieu");

            // nhan du lieu
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
