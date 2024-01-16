/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan3_Thread2;

/**
 *
 * @author ngocanh
 */
public class ex3_Counter {

    private int count = 0;

    // 1. dong bo hoa
    public synchronized void increment() {
        count++;
    }

    // 2. dong bo hoa
    public synchronized void decrement() {
        count -= 2;
    }

    // 3. Khong dong bo hoa
    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        ex3_Counter counter = new ex3_Counter();
        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }

        });
        Thread decrementThread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }

        });
        incrementThread.start();
        decrementThread.start();
        try {
            incrementThread.join();
            decrementThread.join();
        } catch (Exception e) {
//            System.out.println("");
            e.printStackTrace();
        } finally {
        }
        System.out.println("Count cuoi cung: " + counter.getCount());
    }
}
