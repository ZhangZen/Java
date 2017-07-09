/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory_BinaryIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
public class DataInputStream_DataOutputStream {

    private static final String tenFile = "DemoDataIOStream.dat";

    public static void main(String[] args) {

    }

    private static void docFile() {
//        DataInputStream dataInputStream=null;
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(tenFile))) {
            int read = dataInputStream.read();
//            dataInputStream.readInt();
//            dataInputStream.readFloat(); 
//              .....
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataInputStream_DataOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataInputStream_DataOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
//        finally {
//            try {
//                dataInputStream.close();
//            } catch (IOException ex) {
//                Logger.getLogger(DataInputStream_DataOutputStream.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }

    private static void ghiFile() {
//        DataOutputStream dataOutputStream=null;
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(tenFile))) {
            dataOutputStream.write(100);
            dataOutputStream.writeChar(100);
            dataOutputStream.writeChars("vasdf");
            dataOutputStream.writeFloat(3.45f);
            dataOutputStream.writeInt(222);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataInputStream_DataOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DataInputStream_DataOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
//        finally {
//            try {
//                dataOutputStream.close();
//            } catch (IOException ex) {
//                Logger.getLogger(DataInputStream_DataOutputStream.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }

}
