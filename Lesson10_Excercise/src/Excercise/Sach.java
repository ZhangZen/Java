/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise;

import java.util.Scanner;

/**
 *
 * @author Zhang
 */
public class Sach {

    private int maSach;
    private String tenSach;
    private String tacGia;
    private float giaTien;

    public Sach() {
    }

    public Sach(int maSach, String tenSach, String tacGia, float giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.giaTien = giaTien;
    }

    public int getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public float getGiaTien() {
        return giaTien;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", tacGia=" + tacGia + ", giaTien=" + giaTien + '}';
    }

    public void nhapThongTin() {
        System.out.print("Nhập mã sách: ");
        this.maSach = new Scanner(System.in).nextInt();
        System.out.print("Nhập tên cuốn sách: ");
        this.tenSach = new Scanner(System.in).nextLine();
        System.out.print("Nhập tác giả của cuốn sách: ");
        this.tacGia = new Scanner(System.in).nextLine();
        System.out.print("Nhập giá tiền của sách: ");
        this.giaTien = new Scanner(System.in).nextFloat();
    }

    public void inThongTin() {
        toString();
    }
}
