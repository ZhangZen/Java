/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class Theory_Runtime {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();// không thể new mà chỉ có thể lấy về nhờ câu lệnh này
        System.out.println("Số CPU: " + runtime.availableProcessors());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.totalMemory());
        try {
            runtime.exec("calc");// khởi động chương trình của Windows, tương đương với gõ "calc" vào Run của Windows
            runtime.exec("mspaint");
        } catch (IOException ex) {
            Logger.getLogger(Theory_Runtime.class.getName()).log(Level.SEVERE, null, ex);
        }
        runtime.gc();// chạy trình dọn rác của java
    }
}
