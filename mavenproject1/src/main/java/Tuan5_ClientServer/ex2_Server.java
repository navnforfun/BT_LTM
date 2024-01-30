/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan5_ClientServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

/**
 *
 * @author ngocanh
 */
public class ex2_Server {

    public static void main(String[] args) {
        final int PORT = 12345;
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server dang cho ket noi tu client...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client da ket noi" + clientSocket);
                Thread thread = new Thread(new ClientHandler(clientSocket));
                thread.start();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler implements Runnable {

    private Socket clientSocket;

    public ClientHandler(Socket _clientSocket) {
        this.clientSocket = _clientSocket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            String clientMessage;
            while ((clientMessage = in.readLine()) != null) {
                System.out.println("Client: " + clientMessage);
                out.println("Server nhan duoc:" + clientMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

