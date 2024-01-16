/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan3_Thread2;

/**
 *
 * @author ngocanh
 */
public class ex5 {
    private final Object monitor = new Object();
    public  void waitForSignal() throws InterruptedException{
        synchronized (monitor) {
            monitor.wait(); // tien trinh se treo cho den khi notify
        }
    }
    public  void NotifySignal(){
        synchronized (monitor) {
            monitor.notify();
            
        }
    }
}
