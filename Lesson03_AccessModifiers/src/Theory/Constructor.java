/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

import lesson03_modifiers.SinhVien;

/**
 *
 * @author Zhang
 */
public class Constructor {

    public static void main(String[] args) {
        /*
            CONSTRUCTOR
            - Là 1 hàm đặc biệt của 1 class
            - Constructor không có kiểu trả về
            - Sẽ được gọi khi khởi tạo 1 object
            - Nếu người dùng không viết constructor thì Java sẽ tự động tạo constructor rỗng
                ngược lại, nếu người dùng viết constructor thì IDE sẽ sử dụng constructor mà người dùng viết
            - 1 class có thể có nhiều constructor
        * Tại sao lại có constructor????
            - Constructor sinh ra để trong quá trình khởi tạo object có thể thực hiện 1 số tác vụ chứa trong nội dung của constructor
         */
        SinhVien sinhVien = new SinhVien();
    }
}
