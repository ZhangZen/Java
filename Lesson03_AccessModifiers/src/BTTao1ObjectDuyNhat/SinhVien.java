/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTTao1ObjectDuyNhat;

/**
 *
 * @author Zhang
 */
public class SinhVien {

    private int ma;
    private String ten;
    private String lop;

    // để constructor là private => ngăn không cho tạo obect từ bên ngoài
    private SinhVien() {
    }

    // tạo object SinhVien(là private) ngay trong class này và để là static
    private static SinhVien sinhVien;

    // hàm dưới đây sẽ có tác dụng chỉ tạo 1 object sinhVien duy nhất
    public static SinhVien getObjectSinhVien() {
        if (sinhVien == null) {
            sinhVien = new SinhVien();
        }
        return sinhVien;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

}
