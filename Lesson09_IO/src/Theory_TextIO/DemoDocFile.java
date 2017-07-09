/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory_TextIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class DemoDocFile {

    /*
        ĐỌC FILE TEXT TRONG JAVA
        - Sử dụng Scanner (có đuôi "ER" sẽ là đọc/ghi file văn bản trong Java)
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("DemoGhiFile.txt"))) {// Sử dụng java 8
            System.out.println("Các dòng có trong file: ");
            while (scanner.hasNext()) {// lặp đến cuối file
                String nextLine = scanner.nextLine();// đọc cả dòng
                System.out.println(nextLine);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoDocFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-------------------------------------");
//        BufferedReader bufferedReader = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("DemoGhiFile.txt"))) {
            // người ta thường sử dụng BufferedReader vì nó sử dụng cơ chế bộ đệm nên tốc độ đọc file diễn ra nhanh chóng
            System.out.println("Các dòng có trong file: ");
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    System.out.println(readLine);
                } else {
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoDocFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {// dòng catch này dành cho close(), nhưng vì new ở try nên catch này được thêm vào đây và close được đóng ngầm
            Logger.getLogger(DemoDocFile.class.getName()).log(Level.SEVERE, null, ex);
        }
//        finally {
//            try {
//                bufferedReader.close();
//            } catch (IOException ex) {
//                Logger.getLogger(DemoDocFile.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }
}
