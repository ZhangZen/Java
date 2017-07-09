/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory_FileClass;

import java.io.File;

/**
 *
 * @author Zhang
 */
public class ClassFile {

    public static void main(String[] args) {
        File f = new File("D://");
        File[] listRoots = File.listRoots();// lấy về các partition trong máy
        for (int i = 0; i < listRoots.length; i++) {
            System.out.println(listRoots[i].getPath());// hoặc là chỉ cần listRoots[i] là được
        }
        System.out.println("--------------------------------------");
        File[] listFiles = f.listFiles();//lấy về tất cả các file có trong thư mục mình gọi (là ổ D)
        for (int i = 0; i < listFiles.length; i++) {
            System.out.println(listFiles[i].toString());
        }
        System.out.println("--------------------------------------");
        System.out.println(f.isDirectory());// trả về true nếu file được đọc đại diện cho 1 thư mục
        System.out.println("--------------------------------------");
        // Còn nhiều hàm trong class File nên tìm hiểu và dùng thử
    }
}
