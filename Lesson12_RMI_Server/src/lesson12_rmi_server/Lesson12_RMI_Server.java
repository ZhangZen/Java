/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12_rmi_server;

import DemoInterfaceRMI.IMyRemote;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class Lesson12_RMI_Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            IMyRemote remote = new MyRemote();
            System.out.println("Demo tinh tong tren server: " + remote.tinhTong(23, 55));
            System.out.println("-------------------------------------------");
            // bước tiếp theo là đưa Remote ra cho Client gọi
            // - MyRemote phải extends UnicastRemoteObject
            // -    tạo registry tại cổng 1099
            LocateRegistry.createRegistry(1099);// cổng 1099 là cổng dành riêng cho RMI
            Naming.bind("tinhToanCoBan", remote);
            System.out.println("Đưa ra cổng thành công!");
        } catch (RemoteException | AlreadyBoundException | MalformedURLException ex) {
            Logger.getLogger(Lesson12_RMI_Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
