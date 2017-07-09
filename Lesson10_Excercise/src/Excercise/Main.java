/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author Zhang
 */
public class Main {

    private int choice = 0;
    private ArrayList<Sach> dsSach = new ArrayList<>();
    private boolean coSach = false;
    private float tongTien = 0;

    private void menu() {
        while (true) {
            System.out.println("\t\tCHƯƠNG TRÌNH QUANRN LÍ SÁCH THƯ VIỆN");
            System.out.println("\t1. Thêm sách vào kho.");
            System.out.println("\t2. Hiện danh sách Sách có trong kho.");
            System.out.println("\t3. Sắp xếp danh sách Sách theo mã.");
            System.out.println("\t4. Sắp xếp danh sách Sách theo giá tiền.");
            System.out.println("\t5. Tính tổng số tiền các cuốn sách có mã lớn hớn hoặc bằng 100.");
            System.out.println("\t6. Thoát chương trình.");
            System.out.println("-----------------------------------------");
            System.out.print("Chọn chức năng: ");
            do {
                int temp = new Scanner(System.in).nextInt();
                if (temp > 0 && temp < 6) {
                    choice = temp;
                    break;
                }
                System.out.print("Chức năng chọn sai, yêu cầu chọn lại: ");
            } while (true);
            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin cho sách muốn thêm: ");
                    Sach sach = new Sach();
                    sach.nhapThongTin();
                    dsSach.add(sach);
                    coSach = true;
                    System.out.println("Thêm mới sách thành công!");
                    sach.inThongTin();
                    break;
                case 2:
                    if (coSach) {
                        System.out.println("Danh sách các cuốn sách có trong kho: ");
                        dsSach.forEach(System.out::println);
                    } else {
                        System.out.println("Bạn cần thêm sách vào kho, hiện tại kho đang rỗng");
                    }
                    break;
                case 3:
                    if (coSach) {
                        Collections.sort(dsSach, (Sach o1, Sach o2) -> {
                            return Integer.compare(o1.getMaSach(), o2.getMaSach());
                        });
                        System.out.println("Danh sách các cuốn sách được sắp xếp theo mã: ");
                        dsSach.forEach(System.out::println);
                    } else {
                        System.out.println("Kho sách đang rỗng, không thể thực hiện chức năng sắp xếp.");
                    }
                    break;
                case 4:
                    if (coSach) {
                        Collections.sort(dsSach, (Sach o1, Sach o2) -> {
                            return Float.compare(o1.getGiaTien(), o2.getGiaTien());
                        });
                        System.out.println("Danh sách các cuốn sách được sắp xếp theo giá tiền: ");
                        dsSach.forEach(System.out::println);
                    } else {
                        System.out.println("Kho sách đang rỗng, không thể thực hiện chức năng sắp xếp.");
                    }
                    break;
                case 5:
                    dsSach.stream().filter((Sach t) -> t.getMaSach() >= 100).forEach((Sach t) -> {
                        tongTien += t.getGiaTien();
                    });
                    System.out.println("Tổng tiền = " + tongTien);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Main().menu();
    }
}
