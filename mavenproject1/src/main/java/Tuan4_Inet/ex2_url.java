/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan4_Inet;

import java.net.URL;

/**
 *
 * @author ngocanh
 */
public class ex2_url {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://dweet.io/dweet/for/my-thing-name?hello=world&foo=bar");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Part: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Tham chieu: " + url.getRef());

        } catch (Exception e) {
        }
    }
}
