/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan2_Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ngocanh
 */
public class ex2_Thread2 {
    
    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread(new DNRunable("Luong 1"));
        th1.start();
//        th1.join(); wait th1 is done 
        Thread th2 = new Thread(new DNRunable("Luong 2"));
        th2.start();
    }
}
class DNRunable implements Runnable{
     private String theadName;

    public DNRunable(String theadName) {
        this.theadName = theadName;
    }
     
    @Override
    public void run() {
        System.out.println("Bat dau thuc hien cong viec trong: " + theadName);
        // thuc hien cong viec cua luong 
        for(int i = 0; i<= 5;i++){
            System.out.println(theadName+ " - buoc: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(DNRunable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Ket thuc cong viec: " + theadName);
    }
}