/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory_BinaryIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class BufferedInputStream_BufferedOutputStream {

    private static final String tenFile = "DemoBufferedIOStream.dat";

    public static void main(String[] args) {

    }

    private static void docFile() {
//        BufferedInputStream bufferedInputStream=null;
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(tenFile))) {
            int read = bufferedInputStream.read();
            //...
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BufferedInputStream_BufferedOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BufferedInputStream_BufferedOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
//        finally {
//            try {
//                bufferedInputStream.close();
//            } catch (IOException ex) {
//                Logger.getLogger(BufferedInputStream_BufferedOutputStream.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }

    private static void ghiFile() {
//        BufferedOutputStream bufferedOutputStream = null;
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(tenFile))) {
            bufferedOutputStream.write(100);
            //...
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BufferedInputStream_BufferedOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BufferedInputStream_BufferedOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
//        finally {
//            try {
//                bufferedOutputStream.close();
//            } catch (IOException ex) {
//                Logger.getLogger(BufferedInputStream_BufferedOutputStream.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }
}
