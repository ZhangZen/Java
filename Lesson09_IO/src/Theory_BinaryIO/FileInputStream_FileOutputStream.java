/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory_BinaryIO;

import java.io.File;
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
public class FileInputStream_FileOutputStream {

    private static final String tenFile = "DemoFileIOStream.dat";

    public static void main(String[] args) {

    }

    private static void ghileFile() {
//        FileOutputStream fileOutputStream = null;
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File(tenFile))) {
            fileOutputStream.write(100);
//            fileOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInputStream_FileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInputStream_FileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
//        finally {
//            try {
//                fileOutputStream.close();
//            } catch (IOException ex) {
//                Logger.getLogger(FileInputStream_FileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }

    private static void docFile() {
//        FileInputStream fileInputStream=null;
        try (FileInputStream fileInputStream = new FileInputStream(new File(tenFile))) {
            int read = fileInputStream.read();
            if (read == -1) {// cuối file
                return;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInputStream_FileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInputStream_FileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
//        finally {
//            try {
//                fileInputStream.close();
//            } catch (IOException ex) {
//                Logger.getLogger(FileInputStream_FileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }
}
