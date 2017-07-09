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
public class Overload {// nạp chồng

    /*
        OVERLOAD - NẠP CHỒNG
        - Là hình thức viết lại hàm nhưng cho phép trùng tên với điều kiện khác kiểu dữ liệu của đối số tryền vào hàm
        - Áp dụng cho mọi hàm: Constructor, hàm thường, ...
     */
    public void inThongTin() {

    }

    public void inThongTin(int a) {// pverload

    }

    public void inThongTin(String b) {//overload

    }

    public void inThongTin(float c) {//overload

    }

    public void inThongTin(int a, int b) {//overload

    }

    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.inThongTin();
        overload.inThongTin(13);
        overload.inThongTin(13, 21);
        // gọi hàm và sử dụng như bình thường
    }

}
