/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson12_rmi_server;

import DemoInterfaceRMI.IMyRemote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Zhang
 */
public class MyRemote extends UnicastRemoteObject implements IMyRemote {

    public MyRemote() throws RemoteException {

    }

    @Override
    public int tinhTong(int a, int b) throws RemoteException {
        System.out.println("Đang gọi hàm tính tổng...");
        return a + b;
    }

}
