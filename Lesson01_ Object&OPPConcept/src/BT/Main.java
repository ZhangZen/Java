/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Zhang
 */
public class Main {

    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        sinhVien.ma = 1000;
        sinhVien.ten = "Nguyen Van A";
        sinhVien.lop = "CN1";
        sinhVien.ngaySinh = new ThoiGian();
        sinhVien.ngaySinh.nam = 1996;
        sinhVien.ngaySinh.thang = 1;
        sinhVien.ngaySinh.ngay = 8;
        // lay thoi gian hien tai
        GregorianCalendar calendar = new GregorianCalendar();
        int nam = calendar.get(Calendar.YEAR);
        int thang = calendar.get(Calendar.MONTH);
        int ngay = calendar.get(Calendar.DATE);
        ThoiGian thoiGianHienTai = new ThoiGian();
        thoiGianHienTai.nam = nam;
        thoiGianHienTai.thang = thang;
        thoiGianHienTai.ngay = ngay;
        int tuoiSinhVien = sinhVien.ngaySinh.tinhTuoi(thoiGianHienTai);
        System.out.println("Thong tin sinh vien: ");
        sinhVien.inThongTin();
        System.out.println("Sinh vien " + sinhVien.ten + " co do tuoi la " + tuoiSinhVien);
    }

}
