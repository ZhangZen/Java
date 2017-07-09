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
public class PublicPrivateProtectedDefault {
    /*
        Các từ khóa trên được gọi chung là Access Modify ( phổ từ xác định quyền truy cập)
     */
    //--------------------------------------------
    /*
        PUBLIC
        - 1 hàm hay biến là public thì nó có thể được truy cập từ bất kì đâu
        - 1 class là public thì bất kì nơi nào bên ngoài package có thể truy cập vào class đó
        - Class chỉ có 2 dạng là public và không public
        - Trong 1 file .java chỉ có 1 class duy nhất được để dạng public
        - Nếu trong 1 file .java có nhiều class thì khi biên dịch sẽ ra các file .class riêng biệt, khác package thì không thể nhìn thấy các class này
     */
    //--------------------------------------------
    /*
        PRIVATE
        - 1 biến là private thì chỉ nội bộ trong class chứa biến đó mói truy cập trực tiếp được nó
                Nếu class ngoài muốn truy cập thì phải thông qua get/set
     */
    //--------------------------------------------
    /*
        PROTECTED
        - 1 biến là protected thì trong package có thể nhìn thấy, ngoài package không nhìn thấy được
        - protected thường được sử dụng khi mới học kế thừa, nó cho phép kế thừa một cách an toàn
     */
    //--------------------------------------------
    /*
        DEFAULT
        - Trong cùng 1 package thì nhìn thấy, khác package thì không nhìn thấy được
     */
}
