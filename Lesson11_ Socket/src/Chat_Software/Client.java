/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat_Software;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class Client {

    static BufferedWriter writer = null;
    static BufferedReader reader = null;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6969);
            System.out.println("Connected to server at port " + socket.getLocalPort());
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Thread thread = new Thread(() -> {
                while (true) {
                    try {
                        String readLine = reader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        System.out.println("Server: " + readLine);
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            thread.start();
            while (true) {
                String mes = new Scanner(System.in).nextLine();
                writer.write(mes);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
