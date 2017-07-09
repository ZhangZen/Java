/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class Client {

    public static void main(String[] args) {
        try {
            // tạo socket
            Socket socket = new Socket("localhost", 6969);
            // hoặc dùng 
//            Socket socket=new Socket("127.0.0.1", 6969); đây là IP của riêng máy tính dành cho chính nó
//            Socket socket=new Socket("192.168.1.8", 6969); đây là IP chính của máy
            System.out.println("Đã kết nối tới Server tại cổng: " + socket.getLocalPort());
            String mes = "Hello Server, I'm Cilent";
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(mes.getBytes());
            outputStream.flush();// đẩy tin nhắn đi và xóa bộ đệm
            //-------------------------------------------------------
//            // Ngoài ra, người ta thường dùng Buffer để gửi và nhận
//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//            writer.write(mes);
//            writer.flush();
            System.out.println("Gửi thông điệp thành công");
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
