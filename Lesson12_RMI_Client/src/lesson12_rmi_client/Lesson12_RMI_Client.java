/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12_rmi_client;

import DemoInterfaceRMI.IMyRemote;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class Lesson12_RMI_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            IMyRemote lookup = (IMyRemote) Naming.lookup("rmi://localhost:1099/tinhToanCoBan");
            System.out.println("Tinh tong tren client: " + lookup.tinhTong(34, 100));
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(Lesson12_RMI_Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
