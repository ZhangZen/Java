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
public class SinhVien {

    public int ma;
    public String ten;
    public String lop;

    public SinhVien() {
    }

    public SinhVien(int ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", ten=" + ten + ", lop=" + lop + '}';
    }

    public void nhapThongTin() {
        System.out.print("Nhap ma sinh vien: ");
        this.ma = new Scanner(System.in).nextInt();
        System.out.print("Nhap ten sinh vien: ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.print("Nhap lop sinh vien dang theo hoc: ");
        this.lop = new Scanner(System.in).nextLine();
        /*
            Ve tu khoa THIS
            - Tu khoa THIS dung de truy cap toi cac thuoc tinh thuoc chinh class do
            - Ngoai ra, THIS con dung de phan biet bien va thuoc tinh (thuoc 1 class nao do) co cung ten, 
                    THIS se truy cap vao thuoc tinh cua class, 
                    con bien co ten giong thuoc tinh do se truy cap duoc ma khong can dung tu khoa THIS
         */
        int ma = 1234;
        System.out.println(ma);// in ra ma 1234
        System.out.println(this.ma);// in ra ma sinh vien cua sinh vien nay
    }

}
