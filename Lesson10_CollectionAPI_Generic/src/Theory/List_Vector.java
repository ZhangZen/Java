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
public class List_Vector {

    public static synchronized void abc() {// hàm được đồng bộ sẽ chỉ được 1 luồng sử dụng trong 1 thời điểm nhất định
        //...
    }

    public static void main(String[] args) {
        /*
            VECTOR
                - Vector là 1 kiểu Colelction giống ArrayList, điểm khác biệt duy nhất là Vector được đồng bộ (sychronized)
                    được đồng bộ có nghĩa là trong 1 thời điểm chỉ có 1 luồng duy nhất được sử dụng (ví dụ như hàm abc() bên trên)
                - Các thao tác với Vector cũng được sử dụng tương tự ArrayList (xem class List_ArrayList)
         */
    }
}
