/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Zhang
 */
public class Set_HashSet {

    public static void main(String[] args) {
        /*
            SET
                - Là 1 phần tử của Collection
                - Các phần tử của Set được sắp xếp
                - Các phần tử của Set không được trùng nhau về mặt địa chỉ và hashCode
         */
        Set set = new HashSet();
        set.add(12);
        set.add(12);
        set.add(12);
        set.add(12);
        set.add(12);
        set.add(12);
        set.add(new SinhVien(100, "Nguyen Van A"));
        set.add(new SinhVien(100, "Nguyen Van A"));
        set.add(new SinhVien(100, "Nguyen Van A"));
        set.add(new SinhVien(100, "Nguyen Van A"));
        set.add(new SinhVien(100, "Nguyen Van A"));
        set.forEach(System.out::println);
        /*
            In ra 1 phần tử mang giá trị 12 và 5 object SinhVien có giá trị giống nhau
            - 12 mang giá trị giống nhau và là kiểu nguyên thủy còn 
            - SinhVien là 5 vùng nhớ khác nhau trong bộ nhớ và không phải là kiểu dữ liệu nguyên thủy
         */
        // Ngoài ra SET cũng có các hàm mà Collection có
    }
}
