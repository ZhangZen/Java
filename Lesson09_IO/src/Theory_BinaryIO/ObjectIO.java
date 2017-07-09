/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory_BinaryIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class ObjectIO {

    private static final String tenFile = "DemoObjectIO.dat";

    public static void main(String[] args) {

    }

    private static void ghiObject(Object object) {
//        ObjectOutputStream objectOutputStream=null;
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(tenFile))) {
            objectOutputStream.writeObject(object);
        } catch (IOException ex) {
            Logger.getLogger(ObjectIO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        finally {
//            try {
//                objectOutputStream.close();
//            } catch (IOException ex) {
//                Logger.getLogger(ObjectIO.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }

    private static Object docFile() {
//        ObjectInputStream objectInputStream=null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(tenFile))) {
            Object readObject = objectInputStream.readObject();
            return readObject;
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ObjectIO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        finally {
//            try {
//                objectInputStream.close();
//            } catch (IOException ex) {
//                Logger.getLogger(ObjectIO.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }

//        finally {
//            try {
//                objectInputStream.close();
//            } catch (IOException ex) {
//                Logger.getLogger(ObjectIO.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        return null;
    }
}
