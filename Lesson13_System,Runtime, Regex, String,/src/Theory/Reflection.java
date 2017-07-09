/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zhang
 */
public class Reflection {

    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien(100, "Nguyen Van A", "D14CN1");
        SinhVien sinhVien2 = null;
        // Giả sử object sinhVien này được lấy về từ mạng và không biết thuộc class nào, có 2 cách để xác định nó
        // cách 1: 
        if (sinhVien instanceof SinhVien) {
            System.out.println(sinhVien + " là 1 object của class SinhVien");// nhưng cách này chỉ có thể kiểm tra xem object đó có phải thuộc 1 kiểu nhất định mình biết trước rồi hay không
        } else {
            System.out.println(sinhVien + "không phải là 1 object của class SinhVien");// nhưng cách này chỉ có thể kiểm tra xem object đó có phải thuộc 1 kiểu nhất định mình biết trước rồi hay không
        }
        //Cách 2: Giúp xác định rõ ràng và minh bạch hơn
        Class sinhVienClass = sinhVien.getClass();
        System.out.println("Class của object " + sinhVien + " là: " + sinhVienClass.getName());
        System.out.println("Class của object " + sinhVien + " là: " + sinhVienClass.getCanonicalName());
        System.out.println("Class của object " + sinhVien + " là: " + sinhVienClass.getSimpleName());
        System.out.println("Class của object " + sinhVien + " là: " + sinhVienClass.getTypeName());
        // muốn biết trong Class SinhVien vừa xác định có những phương thức nào, hàm nào, ta gọi method
        Method[] methods = sinhVienClass.getMethods();// trả về danh sách các hàm trong class SinhVien
        System.out.println("------------------------------------------------------");
        System.out.println("Các hàm có trong class SinhVien: ");
        for (Method method : methods) {
            System.out.println(method.getName());
            // thậm chí có thể gọi hàm chạy ngay trong đây
            if (method.getName().equals("hienThongTin")) {
                try {
                    method.invoke(sinhVien, null);
//                    sinhVien.hienThongTin(); //câu lệnh trên tương đương với việc gọi hàm như thế này
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    Logger.getLogger(Reflection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        // Ngoài ra ta có thể tạo ra object mà không cần dùng các không thường (không cần dùng từ khóa new)
        System.out.println("-------------------------------------------------");
        try {
//            Object sinhVien2 = Class.forName("Theory.SinhVien").newInstance();// trả về 1 object, nhưng ta biết đó sẽ là object SinhVien
            // không tin, kiểm tra thì biết
//            System.out.println(sinhVien2 instanceof SinhVien);
            // vậy nên ta sẽ ép kiểu luôn
            sinhVien2 = (SinhVien) Class.forName("Theory.SinhVien").newInstance();// trả về 1 object, nhưng ta biết đó sẽ là object SinhVien
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(Reflection.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Ta có thể lấy về các biến của Class SinhVien, chỉ lấy những biến public, những biến private,protected, default thì không lấy ra được
        Field[] fields = sinhVienClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println("-------------------------------------------------");

        // muốn lấy ra cả các biến private thì ta dùng DeclaredField
        Field[] declaredFields = sinhVienClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
            // trong đây ta có thể truy cập và thay đổi giá trị của biến private mà không cần thông qua get/set
            if (declaredField.getName().equals("diem")) {
                declaredField.setAccessible(true);// câu lệnh này cho phép truy cập vào biến private
                try {
                    System.out.println("Trước khi thay đổi điểm của sinhVien2:  " + sinhVien2);
                    declaredField.setFloat(sinhVien2, 4.5f);
                    System.out.println("Sau khi thay đổi điểm của sinhVien2: " + sinhVien2);
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(Reflection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
