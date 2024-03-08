/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan8_TuanTuHoa;

import java.io.*;
import java.net.*;

/**
 *
 * @author ngocanh
 */
public class ex2_server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(123);
            System.out.println("Server dang chay");
            while (true) {                
                Socket socket = serverSocket.accept();
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                // tao doi tuong tuan tu hoa
                student st = new student("Ngoc Anh", 21);
                // ghi doi tuong vao outputSteam
                oos.writeObject(st);
                oos.close();
                socket.close();
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
