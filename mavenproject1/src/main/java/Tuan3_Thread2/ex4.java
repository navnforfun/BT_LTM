/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan3_Thread2;

/**
 *
 * @author ngocanh
 */
public class ex4 {

    private final Object lc = new Object();

    public synchronized void phuongThuc1() {

    }

    public synchronized void phuongThuc2() {
        synchronized (lc) {

        }
    }

    public static void main(String[] args) {
        Thread th = new Thread(() -> {
        });
        th.start();
        try {
            th.join(); // cho tien trinh khac hoan thanh 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
