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
public class SinhVien {

    private int maSinhVien;
    private String tenSinhVien;
    private String lop;
    private float diem;
    protected int tuoi;
    public String queQuan;

    public SinhVien() {
    }

    public SinhVien(int maSinhVien, String tenSinhVien, String lop) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.lop = lop;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSinhVien=" + maSinhVien + ", tenSinhVien=" + tenSinhVien + ", lop=" + lop + ", diem=" + diem + ", tuoi=" + tuoi + ", queQuan=" + queQuan + '}';
    }

    public void hienThongTin() {
        System.out.println(this);
    }
}
