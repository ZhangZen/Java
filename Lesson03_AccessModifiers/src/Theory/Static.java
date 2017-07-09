/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

import lesson03_modifiers.SinhVien;

/**
 *
 * @author Zhang
 */
public class Static {

    public static void main(String[] args) {
        /*
            "STATIC" KEY WORD
        * Biến static:
            - có thể truy cập từ bất cứ đâu trong cùng pakage (ngoài và khác class)
        * Hàm static:
            - Chỉ dùng biến static cho hàm static, không được dùng biến bình thường
            - Hàm static chỉ được truy cập vào bằng 1 hàm static khác
        * Đoạn code static: 
            - được truy cập 1 LẦN DUY NHẤT khi khai báo và khởi tạo 1 object thuộc 1 class có đoạn code static
            - Chỉ gọi được hàm và biến static
        * Hằng số thường được để dưới dạng "public static final ...."
         */
        // class SinhVien có 1 biến static tenTruong va 1 ham static inThongTinTruong
        SinhVien sinhVien = new SinhVien();
        SinhVien sinhVien2 = new SinhVien();
        sinhVien.tenSinhVien = "Nguyen Van A";
        sinhVien2.tenSinhVien = "Nguyen Van B";
        sinhVien.tenTruong = "PTIT";// neu thay doi bien static thi toan bo object sinhVien deu co bien tenTruong la "PTIT"
        // check to see
        System.out.println(sinhVien2.tenTruong);
        System.out.println("------------------------------------------");
        // nguoc lai neu thay doi tu sinhVien2 thi ket qua cung tuong tu
        sinhVien2.tenTruong = "BCVT";
        System.out.println(sinhVien.tenTruong);
        System.out.println(sinhVien2.tenTruong);
        // vi bien static co the truy cap truc tiep khong can thong qua object cu the nao, vi vay ta co the viet ngay ten class
        System.out.println("------------------------------------------");
        SinhVien.tenTruong = "Học viện công nghệ bưu chính viên thông";// sau nay se dung cach nay
        System.out.println(sinhVien.tenTruong);
        System.out.println(sinhVien2.tenTruong);
        //----------------------------------------------------------------
        SinhVien.inThongTinTruong();// in thong tin truong su dung ham static
        /*
            -----trong class SinhVien co 1 doan code static nhu sau: 
             static {
                System.out.println("Đây là class sinh viên");
            }
         đoạn code này được gọi đến 1 lần duy nhất khi khai báo và khởi tạo object sinhVien bất kì
         */
    }

}
