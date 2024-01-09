/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan2_Thread;

/**
 *
 * @author ngocanh
 */
public class ex1_Thread extends Thread{

    @Override
    public void run() {
        System.out.println("Luong dang chay");
    }
    
    public static void main(String[] args) {
            ex1_Thread th = new ex1_Thread() ;
            th.start();
    }
    
}
