/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan4_Inet;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ngocanh
 */
public class ex4_url2File {
    public static void main(String[] args) throws IOException {
          try {
            // tao url tu 1 dia chi
            URL url = new URL("https://www.google.com");
            // open url
            URLConnection urlConnection = url.openConnection();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));
            // tao doi tuong ghi
              FileWriter fileWriter = new FileWriter("out.html");
            String line ="";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                // ghi vao file
                fileWriter.write(line+"\n");
                
            }
            reader.close();
            fileWriter.close();

        } catch (MalformedURLException ex) {
            Logger.getLogger(ex3_readData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
