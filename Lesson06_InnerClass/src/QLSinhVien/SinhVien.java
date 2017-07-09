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
public class SinhVien {

    private int ma;
    private String ten;

    public SinhVien() {
    }

    public SinhVien(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
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
    private IPrint iPrint;

    public IPrint getiPrint() {
        return iPrint;
    }

    public void setiPrint(IPrint iPrint) {
        this.iPrint = iPrint;
    }

    // muốn thực hiện hàm này thì phải có 1 thuộc tính của IPrint
    /*
        Sau đó phải tạo 1 class implements Interface IPrint, viết lại hàm inThongTin
        Tiếp theo ra ngoài hàm main sẽ tạo 1 object IPrint, 1 object SinhVien 
        Sau đó mới thực hiện được hàm inThongTin của class SinhVien
     */
    public void inThongTin(IPrint iPrint) {
        iPrint.inThongTin(this);
    }

    //==> Giải pháp là sử dụng inner class
    class InAn implements IPrint {

        @Override
        public void inThongTin(Object object) {
            System.out.println(this);
        }
    }
}
