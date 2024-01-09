/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan2_Thread;

/**
 *
 * @author ngocanh
 */
public class ex4_TinhTongMang {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numThreads = 2;
        //mang luong
        Thread[] ths = new Thread[numThreads];
        SumCalculator[] cals = new SumCalculator[numThreads];
        for (int i = 0; i < numThreads; i++) {
            cals[i] = new SumCalculator(array, i, numThreads);
            ths[i] = new Thread(cals[i]);
            ths[i].start();
        }
        for (int i = 0; i < numThreads; i++) {
            try {
                ths[i].join();
            } catch (Exception e) {
            }
        }
        int totalSum = 0;
        for (SumCalculator c : cals) {
            totalSum += c.getTong1Phan();
        }
        System.out.println("Tong la: " + totalSum);

    }

}

class SumCalculator implements Runnable {

    private int[] array;
    private int startIndex;
    private int chia;
    private int tong1Phan;

    public SumCalculator(int[] array, int startIndex, int chia) {
        this.array = array;
        this.startIndex = startIndex;
        this.chia = chia;
        this.tong1Phan = 0;
    }

    @Override
    public void run() {
//    tinh tong phan tu dua tren index
        for (int i = startIndex; i < array.length; i += chia) {
            tong1Phan += array[i];

        }

    }

    public int getTong1Phan() {
        return tong1Phan;
    }
}
