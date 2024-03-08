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
public class ex2_client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 123);
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            // doc doi tuong tu inputsteam 
            student st = (student) ois.readObject();
            System.out.println("Da nhan dc student");
            System.out.println("Ten: " + st.getName());
            System.out.println("Tuoi: " + st.getAge());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
