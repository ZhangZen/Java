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
public class Main {

    public static void main(String[] args) {
        // truyen thuoc tinh cua class A vao class B bang cach thong thuong
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        a.setB(b);
        a.setTenA("aaaaaaaaaaaaaaa");
        a.truyenThuocTinhCuaAVaoB();
        System.out.println(b.getTenB());
        //----------------------------------------------
        // Giai phap la su dung Inner Class 
        ClassA.ClassC c = a.new ClassC();
        a.setTenA("Nguyen Van A");
        c.inTenCuaATrongC();

    }

}
/*
    INNER CLASS
        * Định nghĩa: 
            - Inner class là 1 class nằm trong 1 class khác
                        Các thuộc tính và phương thức trong inner class đều giống với class thường, 
                        chú ý truy cập vào thuộc tính trong inner class, 
                        cần phân biệt đâu là thuộc tính của class chính, đâu là thuộc tính của inner class 
                            để truy cập và sử dụng từ khóa THIS cho phù hợp
            - Inner class thực hiện kế thừa (extends, implements) một cách bình thường
        * Tác dụng:
            - Chia sẻ dữ liệu giữa 2 class
            - Hỗ trợ sử dụng interface và class một cách trong sáng hơn (xem package QLSinhVien)
 */
