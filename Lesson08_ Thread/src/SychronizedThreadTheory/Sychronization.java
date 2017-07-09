/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SychronizedThreadTheory;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class Sychronization {

    /*
    Bài toán đặt ra là sinh ngẫu nhiên 2 số nguyên dương nhỏ hơn 1000 bằng 2 thread riêng biệt
    và sử dụng 1 thread khác để tính tổng 2 số được sinh ra đó
     */
    private static Data data = new Data();
    public static int i = 0;

    public static void main(String[] args) {
        data.setFlag(Data.TH_A);// set cờ cho thread A chạy trước
        Thread threadA = new Thread(() -> {
            synchronized (data) {// đánh dấu object data là object có quyền cao nhất điều khiển thread chạy và đồng bộ thread
                // và chỉ có duy nhất 1 thred được sử dụng
//                for (int i = 0; i < 100; i++) {
                while (true) {
                    if (data.getFlag() == Data.TH_A) {// nếu cờ A bật thì A chạy
                        data.setA(new Random().nextInt(1000));
                        System.out.println("a = " + data.getA());
                        try {
                            Thread.sleep(100);// dừng lại 100 mili giây để đợi
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Sychronization.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        data.setFlag(Data.TH_B);// xong thì chuyển cờ cho B chạy
                        data.notifyAll();// và đánh thức các thread đang bị chờ đợi khác
                    } else {
                        try {
                            // nếu không thì phải đợi
                            data.wait();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Sychronization.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (data) {
                synchronized (data) {
//                    for (int i = 0; i < 100; i++) {
                    while (true) {
                        if (data.getFlag() == Data.TH_B) {
                            data.setB(new Random().nextInt(1000));
                            System.out.println("b = " + data.getB());
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Sychronization.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            data.setFlag(Data.TH_C);
                            data.notifyAll();
                        } else {
                            try {
                                data.wait();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Sychronization.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
            }
        });

        Thread threadC = new Thread(() -> {
            synchronized (data) {
                synchronized (data) {
//                    for (int i = 0; i < 100; i++) {
                    while (true) {
                        if (data.getFlag() == Data.TH_C) {
                            data.setSum(data.getA() + data.getB());
                            System.out.println("Sum " + i + " = " + data.getSum());
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Sychronization.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            data.setFlag(Data.TH_A);
                            data.notifyAll();
                            i++;
                        } else {
                            try {
                                data.wait();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Sychronization.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
