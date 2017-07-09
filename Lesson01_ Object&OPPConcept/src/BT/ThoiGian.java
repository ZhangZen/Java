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
public class ThoiGian {

    public int ngay;
    public int thang;
    public int nam;

    public void nhapThoiGian() {
        System.out.print("Nhap ngay: ");
        this.ngay = new Scanner(System.in).nextInt();
        System.out.print("Nhap thang: ");
        this.thang = new Scanner(System.in).nextInt();
        System.out.print("Nhap nam: ");
        this.nam = new Scanner(System.in).nextInt();
    }

    public String inThoiGian() {
        return this.ngay + "/" + this.thang + "/" + this.nam;
    }

    public int tinhTuoi(ThoiGian thoiGianHienTai) {
        return thoiGianHienTai.nam - this.nam;
    }
}
