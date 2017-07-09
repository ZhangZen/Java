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
public class ClassA {

    private String tenA;

    public ClassA() {
    }

    public ClassA(String tenA) {
        this.tenA = tenA;
    }

    public String getTenA() {
        return tenA;
    }

    public void setTenA(String tenA) {
        this.tenA = tenA;
    }

    // Muon truyen thuoc tinh cua class A vao class B thi phai thuc hien doan code duoi day
    private ClassB b;

    public ClassB getB() {
        return b;
    }

    public void setB(ClassB b) {
        this.b = b;
    }

    public void truyenThuocTinhCuaAVaoB() {
        b.setTenB(tenA);
    }

    public class ClassC {// inner class
        // trong inner class khai bao thuoc tinh, phuong thuc mot cach binh thuong

        public void inTenCuaATrongC() {
            System.out.println(tenA);
        }
    }

}
