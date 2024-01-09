/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan2_Thread;

/**
 *
 * @author ngocanh
 */
public class ex3_ThreadLife {
    public static void main(String[] args) {
        Thread th1 = new Thread(new DNURunable2());
        th1.start();
        try {
            Thread.sleep(2000);
            System.out.println("Ngu 2000");
        } catch (Exception e) {
            System.out.println(e);
        }
        th1.interrupt();
    }

}

class DNURunable2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Luong dang chay - Trang thai: " + Thread.currentThread().getState());
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Luong bi ngat ngu - Trang thai: " + Thread.currentThread().getState());
        }
        System.out.println("Luong da ket thuc - Trang thai: " + Thread.currentThread().getState());
        
    }
}
