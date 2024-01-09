package Tuan1_Network;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class bai3 {

    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> netInterface
                    = NetworkInterface.getNetworkInterfaces();
            while (netInterface.hasMoreElements()) {
                NetworkInterface networkInterface
                        = netInterface.nextElement();
                Enumeration<InetAddress> inetAddress
                        = networkInterface.getInetAddresses();
                while (inetAddress.hasMoreElements())
                {
                    InetAddress address = inetAddress.nextElement();
                    System.out.println("Interface:" + networkInterface.getName() + "; Dia chi IP: " + address.getHostAddress());
                }
            }
        } catch (Exception e) {
            System.out.println("Loi");
            e.printStackTrace();
        }

    }

}
