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
public class MonHoc {

    public String ten;
    public int soTinChi;

    public void nhapThongTin() {
        System.out.print("Nhap ten mon hoc: ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.print("Nhap so tin chi cua mon hoc: ");
        this.soTinChi = new Scanner(System.in).nextInt();
    }

    public void inThongTin() {
        System.out.println("Mon hoc " + this.ten + ", so tin chi: " + this.soTinChi);
    }
}
