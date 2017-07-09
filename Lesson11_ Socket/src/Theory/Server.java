/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6969);// tạo ra Server
            System.out.println("Server chờ đợi Cilent kết nối đến...");
            Socket socket = serverSocket.accept();// server chờ client kết nối tới,
            //chạy đến lệnh này thì server dừng mọi xử lí, khi nào có client kết nối tới thì chạy tiếp và trả về socket của client
            System.out.println("Đã có Client kết nối tới: " + socket.getInetAddress().getHostAddress());
//            System.out.println("Đã có Client kết nối tới: " + socket.getInetAddress().getHostName());
            InputStream inputStream = socket.getInputStream();
            while (true) {
                int read = inputStream.read();
                if (read == -1) {
                    break;
                }
                // hoặc
//                if (inputStream.available() == 0) {
//                    break;
//                }
                System.out.print((char) read);
            }
            //------------------------------------------------
//            //Ngoài ra người ta cũng thường dùng Buffer để đọc & ghi dữ liệu
//            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            while (true) {
//                String readLine = reader.readLine();
//                if (readLine == null) {
//                    break;
//                }
//                System.out.println(readLine);
//            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
