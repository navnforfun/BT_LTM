/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tuan9_RMI.DNU;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author ngocanh
 */
public interface StudentService extends Remote{
    public void addStudent(String name, int age) throws RemoteException;
    public void remoteStudent(String name) throws RemoteException;
    public List<Student> GetAllStudents() throws RemoteException;
}
