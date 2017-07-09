/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

import java.util.Scanner;

/**
 *
 * @author Zhang
 */
public class SinhVien {

    public int ma;
    public String ten;
    public String lop;
    public ThoiGian ngaySinh;

    public void nhapThongTin() {
        System.out.print("Nhap ma sinh vien: ");
        this.ma = new Scanner(System.in).nextInt();
        System.out.print("Nhap ten sinh vien: ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.print("Nhap lop sinh vien: ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.print("Nhap ngay sinh cua sinh vien: ");
        this.ngaySinh = new ThoiGian();
        this.ngaySinh.nhapThoiGian();
    }

    public void inThongTin() {
        System.out.println(this.ma + ", " + this.ten + ", sinh ngay " + this.ngaySinh.inThoiGian() + ", lop " + this.lop);
    }
}
