/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson03_modifiers;

/**
 *
 * @author Zhang
 */
public class SinhVien {

    public String tenSinhVien;
    public static String tenTruong;

    static {
        System.out.println("Đây là class sinh viên");
    }

    public SinhVien() {// constructor mặc định (constructor rỗng)
    }

    public SinhVien(String tenSinhVien) {// constructor- nạp chồng (Overload)
        this.tenSinhVien = tenSinhVien;
    }

    public static void inThongTinTruong() {
        System.out.println(tenTruong);
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public static String getTenTruong() {
        return tenTruong;
    }

    public static void setTenTruong(String tenTruong) {
        SinhVien.tenTruong = tenTruong;
    }

}
