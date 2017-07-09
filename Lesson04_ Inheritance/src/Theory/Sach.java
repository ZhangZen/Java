/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

import java.util.Scanner;

/**
 *
 * @author Zhang
 */
public class Sach {

    private int ma;
    private String ten;
    private String tacGia;

    public Sach() {
        System.out.println("Đang khởi tạo object sách...");
    }

    public Sach(int ma, String ten, String tacGia) {
        this.ma = ma;
        this.ten = ten;
        this.tacGia = tacGia;
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

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void nhapThongTin() {
        System.out.print("Nhap ma sach: ");
        ma = new Scanner(System.in).nextInt();
        System.out.print("Nhap ten sach: ");
        ten = new Scanner(System.in).nextLine();
        System.out.print("Nhap tac gia sach: ");
        tacGia = new Scanner(System.in).nextLine();
    }

    public void inThongTin() {
        System.out.println("Sach{" + "ma=" + ma + ", ten=" + ten + ", tacGia=" + tacGia + "}");
    }

}
