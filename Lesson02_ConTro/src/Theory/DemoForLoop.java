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
public class DemoForLoop {

    public static void main(String[] args) {
        MonHoc[] dsMonHoc = new MonHoc[5]; // khai bao 1 mang gom 5 mon hoc
        // thuc hien them moi mon hoc vao trong mang
        // co 2 cach: dung vong for binh thuong va dung vong for-e
        // cach 1: dung vong for-i (for binh thuong)
//        for (int i = 0; i < dsMonHoc.length; i++) {
//            MonHoc monHoc = new MonHoc();
//            monHoc.nhapThongTin();
//            dsMonHoc[i] = monHoc;
//        }
        // cach 2: for-e
        int i = 0;
        for (MonHoc monHoc : dsMonHoc) {
            monHoc = new MonHoc();
            monHoc.nhapThongTin();
            dsMonHoc[i] = monHoc;
            i++;
            // khong them duoc vao mang neu khong co bien i
        }
        for (MonHoc monHoc : dsMonHoc) {// vong for nay thuc chat giong vong for binh thuong, nhung no chi la dang rut gon
            // duyệt mỗi monHoc( la 1 object MonHoc) trong dsMonHoc để thực hiện một số tác vụ nào đó trong vòng for
            monHoc.inThongTin();// ví dụ như là tác vụ in thông tin sinh viên
        }
    }
}
