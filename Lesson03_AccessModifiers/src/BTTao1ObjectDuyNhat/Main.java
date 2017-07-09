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
public class Main {

    public static void main(String[] args) {
        SinhVien sinhVien;
        sinhVien = SinhVien.getObjectSinhVien();// tạo object duy nhất
        // nếu cố tình tạo thêm thì nó cũng vẫn là 1 object do sinhVien là static 
        //          và hàm getObject chỉ tạo ra object mới khi object sinhVien là null
        SinhVien sinhVien1;
        sinhVien1 = SinhVien.getObjectSinhVien();
        sinhVien.setLop("CN1");
        System.out.println(sinhVien1.getLop());
    }
}
