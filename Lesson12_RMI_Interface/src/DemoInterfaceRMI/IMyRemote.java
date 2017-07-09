package DemoInterfaceRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zhang
 */
public interface IMyRemote extends Remote {

    int tinhTong(int a, int b) throws RemoteException;
}
