/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

/**
 *
 * @author Zhang
 */
public class Main {

    public static void main(String[] args) {
        /* 1 package co nhieu class, va moi class deu co the co ham main cua rien minh
           nhung mot project thi chi duoc phep co 1 main class duy nhat de chay
            muon la 1 main class thi dev phai chi cho IDE biet rang dau la main class
         */

        //-----------------------------------------------
        // tao 1 object
        SinhVien sinhVien;// khai bao
        sinhVien = new SinhVien();// khoi tao
        // 2 dong code tren tuong duong voi viec viet dong sau
        SinhVien sv = new SinhVien();
        // thuc hien gan thong tin cho sinh vien
        sinhVien.ma = 1000;
        sinhVien.ten = "Nguyen Van A";
        sinhVien.lop = "CN1";
        // in thong tin cua sinhVien ra man hinh console
        System.out.println(sinhVien.toString());
        System.out.println(sinhVien);// khong can goi ham tren, neu viet ntn IDE se tu hieu la goi ham toString tu class SinhVien
    }
}
