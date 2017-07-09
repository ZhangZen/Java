/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadBasicTheory;

/**
 *
 * @author Zhang
 */
public class Demo {

    public static void main(String[] args) {
        // Nếu viết riêng lẻ 2 vòng for thì chúng sẽ chạy lần lượt
        /*
            for (int i = 0; i < 1000; i += 2) {
                System.out.println("Chan: " + i);
            }
            for (int i = 1; i < 1000; i += 2) {
                System.out.println("Le: " + i);
            }
         */
        //==> Sử dụng thread sẽ chạy song song
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i += 2) {
                    System.out.println("Chan: " + i);
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 1000; i += 2) {
                    System.out.println("Le: " + i);
                }
            }
        });
        threadA.start();
        threadB.start();
        // ngoai ra, Java 8 hỗ trợ lambda expression, nên sử dụng để code ngắn gọn trong sáng và hiệu năng cao hơn
        Thread thread1 = new Thread(() -> {
            //... code trong này
        });
    }
}
