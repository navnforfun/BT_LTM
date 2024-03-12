/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan9_RMI.DNU;

import Tuan9_RMI.RemoteInterface;
import java.rmi.Naming;
import java.util.List;

/**
 *
 * @author ngocanh
 */
public class RMIClient {

    public static void main(String[] args) {
        try {
            // tim doi tuong 
            StudentService obj = (StudentService) Naming.lookup("//localhost:12/StudentService");
            // goi cac phuong thuc tu xa 

            obj.addStudent("Ngoc Anh", 10);
            obj.addStudent("Mai Long", 23);
            List<Student> students = obj.GetAllStudents();
            for (Student st : students) {
                System.out.println("Name: " + st.getName() + " - Age: " + st.getAge());
            }
            // xoa ket qua
            obj.remoteStudent("Mai Long");
            students = obj.GetAllStudents();
                        System.out.println("Sau khi xoa sinh vien");

            for (Student st : students) {
                System.out.println("Name " + st.getName() + " - Age " + st.getAge());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
