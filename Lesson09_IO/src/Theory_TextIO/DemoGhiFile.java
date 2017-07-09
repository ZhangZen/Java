/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory_TextIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class DemoGhiFile {

    /*
        GHI FILE TEXT TRONG JAVA
            - Trong Java, các class hỗ trợ ghi file text thường có đuôi "ER" (PrintWriter, ....)
            - Người ta thường sử dụng PrintWriter để ghi file text trong java
     */
    public static void main(String[] args) {
        //        PrintWriter printWriter = null;// khai báo
//        try {
//            printWriter = new PrintWriter(new File("DemoGhiFile.txt"));// mở file, đường dẫn của file cũng sẽ được mô tả nếu file nằm khác folder của project
//            printWriter.write("Đây là text ghi vào file\r\n");// ghi 1 chuỗi vào file
//            printWriter.write(100); // ghi 1 số vào file
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(DemoGhiFile.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            printWriter.close();// đóng file nên để ở finally để đề phòng sự cố
//        }
        // Code trong Java 8
        try (PrintWriter printWriter = new PrintWriter(new File("DemoGhiFile.txt"))) {
            // mở file, đường dẫn của file cũng sẽ được mô tả nếu file nằm khác folder của project
            printWriter.write("Đây là text ghi vào file\r\n");// ghi 1 chuỗi vào file
            printWriter.write(100 + "\r\n"); // ghi 1 số vào file
//            printWriter.write(100); // nếu ghi ntn thì nó sẽ chuyển sang mã ASCII
            printWriter.write('a' + "\r\n"); // ghi 1 kí tự vào file
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        }// ghi file trong Java 8 không cần finally để đóng file
        System.out.println("ghi file thành công");
        System.out.println("-------------------------------------------");
        // người ta thường sử dụng BufferedWriter để ghi file văn bản do cơ chế của nó là sử dụng bộ đệm nên tốc độ ghi file diễn ra nhanh chóng
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("DemoGhiFile.txt"))) {
            bufferedWriter.write("Đây là text ghi vào file\r\n");
            bufferedWriter.write(100 + "\r\n");
            bufferedWriter.write('a' + "\r\n");
        } catch (IOException ex) {
            Logger.getLogger(DemoGhiFile.class.getName()).log(Level.SEVERE, null, ex);
        }
//        finally {
//            try {
//                bufferedWriter.close();
//            } catch (IOException ex) {
//                Logger.getLogger(DemoGhiFile.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }
}
