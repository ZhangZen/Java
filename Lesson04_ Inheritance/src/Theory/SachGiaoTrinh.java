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
public class SachGiaoTrinh extends Sach {

    private int namHoc;

    public int getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(int namHoc) {
        this.namHoc = namHoc;
    }

    public SachGiaoTrinh() {
        System.out.println("Đang khởi tạo object sách giáo trình...");
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); //To change body of generated methods, choose Tools | Templates.
    }

    public void nhapNamHoc() {
        System.out.println("Nhập năm học cho sách giáo trình: ....");
    }

    @Override
    public void nhapThongTin() {
        //super.nhapThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("nhap thong tin....");
    }
    
    

}
