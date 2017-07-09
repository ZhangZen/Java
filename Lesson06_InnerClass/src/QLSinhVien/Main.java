/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSinhVien;

/**
 *
 * @author Zhang
 */
public class Main {
    
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        SinhVien.InAn inAn = sinhVien.new InAn();
        inAn.inThongTin(sinhVien);
    }
}
