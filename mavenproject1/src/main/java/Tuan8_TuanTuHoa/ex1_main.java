/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan8_TuanTuHoa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ngocanh
 */
public class ex1_main {

    public static void main(String[] args) {
        // tao doi tuong student
        student s1 = new student("ngoc anh", 20);
        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s1);
            fileOut.close();
            out.close();
            System.out.println("Da ghi toi tung");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // doc doi tuong
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            student stFromFile = (student) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Da doc toi tung ");
            System.out.println("Ten: " + stFromFile.getName());
            System.out.println("Tuoi: " + stFromFile.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
