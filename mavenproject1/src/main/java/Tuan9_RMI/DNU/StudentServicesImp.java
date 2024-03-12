/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan9_RMI.DNU;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngocanh
 */
public class StudentServicesImp extends UnicastRemoteObject implements StudentService {

    private List<Student> studentList;

    public StudentServicesImp() throws RemoteException {
        super();
        studentList = new ArrayList<>();
        
    }

    @Override
    public void addStudent(String name, int age) throws RemoteException {
        studentList.add(new Student(name, age));
    }

    @Override
    public void remoteStudent(String name) throws RemoteException {
        System.out.println("name xoa: "+ name);
        studentList.removeIf(student -> student.getName().equals(name));   
    }

    @Override
    public List<Student> GetAllStudents() throws RemoteException {
        return studentList;
    }

}
