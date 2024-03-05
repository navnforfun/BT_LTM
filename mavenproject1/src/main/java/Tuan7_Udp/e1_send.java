/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan7_Udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author ngocanh
 */
public class e1_send {

    public static void main(String[] args) {

        try {
            //tao doi tuong
            DatagramSocket socket = new DatagramSocket(); //chuan bi du lieu gui
            byte[] data = "Xin chao cac ban UDPI".getBytes(); //xac dinh may nhan
            InetAddress address = InetAddress.getByName("localhost");
            int port = 12345;
            //tao goi du lieu UDP
            DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
            //gui
            socket.send(packet);
            //dong ket noi
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }
