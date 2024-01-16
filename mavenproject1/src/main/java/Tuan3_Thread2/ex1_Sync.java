/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan3_Thread2;

/**
 *
 * @author ngocanh
 */
public class ex1_Sync {

    public static void main(String[] args) {

    }
    private int count = 0;

    public synchronized void demTang() {
        count++;
    }
}
