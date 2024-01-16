/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan3_Thread2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author ngocanh
 */
public class ex2_Lock {

    private int count = 0;
    private Lock lc = new ReentrantLock(); // tao khoa

    public void demTang() {
        lc.lock();
        try {
            count++;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            lc.unlock();
        }
    }
}
