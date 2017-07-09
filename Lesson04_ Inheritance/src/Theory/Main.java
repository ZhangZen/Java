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

    /*
        INHERITANCE: Là 1 hình thức tái dử dụng code trong java với mục đích tối ưu hóa và hướng đối tượng cụ thể
    * Tác dụng:
        - Giảm thiểu code (tận dụng code)
        - Tối ưu hóa hướng đối tượng
        - Tận dụng tính đa hình
    * Chú ý: 
        - Trong constructor của con phải gọi constructor của cha, nếu không gọi hệ thống sẽ tự gọi constructor rỗng
        - 1 class là final thì không thể cho class khác kế thừa
        - Tất cả các object đều là object, nên có 1 class là tên là Object đại diện cho tất cả object, tất cả các class khác đều phải kế thừa từ Object
     */
    //-------------------------------------------------
    //-------------------------------------------------
    //-------------------------------------------------
    //-------------------------------------------------
    /*
        OVERWRITE
            - là hình thức viết lại hàm của cha trong khi kế thừa với tên và đối số truyền vào giống như hàm của cha
    * Tác dụng: 
        - Lợi dụng code của cha (tái sử dụng và mở rộng)
            Muốn lợi dụng code của cha, ta sử dụng từ khóa super.[tên_hàm_của_cha]
    * Chú ý: Get/Set có thể cài đè nhưng constructor thì không thể do:
        - get/set là hàm bình thường, cài đè để thiết lập 1 số điều kiện cho thuộc tính
        - constructor là 1 hàm đặc biệt, khi kế thừa không thể cài đè constructor của cha, 
                do mỗi class có 1 constructor riêng có dạng 'public [tên_class](đối_số_truyền_vào)'
                nhưng khi khởi tạo object con, thì nó sẽ tự động gọi constructor của cha
     */
    //-------------------------------------------------
    //-------------------------------------------------
    //-------------------------------------------------
    //-------------------------------------------------
    /*
        POLYMORPHISM - ĐA HÌNH
        - Khai báo con-new cha ==> Không được, chỉ có thể khai báo cha - new con ==> đa hình
        - Khi khai báo 1 object, new tên class nào thì chỉ nhìn thấy các hàm của class đó
     */
    public static void main(String[] args) {
        // Cả Sach và SachGiaoTrinh là 2 class bình thường (không phải abstract hay interface)
        SachGiaoTrinh sachGiaoTrinh = new SachGiaoTrinh();// gọi cả constructor của cha và con
        Sach s = new SachGiaoTrinh();// s là kiểu Sach, nhưng có vùng nhớ thuộc kiểu SachGiaoTrinh
        // ==> NHỮNG GÌ CỦA CHUNG THÌ NHÌN THẤY, CỦA RIÊNG THÌ KHÔNG NHÌN THẤY
        // s là object SáchGT (khởi tạo là SachGiaoTrinh) 
        //nhưng vì khai báo là Sách nên nó chỉ nhìn thấy những THUỘC TÍNH của class Sách mà thôi
        // khi chạy hàm:
        //- những hàm nào mà SachGiaoTrinh cài đè (hàm mà Sách cũng có- hàm chung) thì nó sẽ chạy hàm của con
        //- những hàm nào mà chỉ SachGiaoTrinh có mà Sach không có (hàm riêng) thì s sẽ không nhìn thấy
        s.nhapThongTin();// chỉ thấy hàm của Sách Giáo Trình
        // s không có thuộc tính namHoc do nó chỉ nhìn thấy các thuộc tính của class Sách mà thôi
    }
}
