/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

import java.util.Stack;

/**
 *
 * @author Zhang
 */
public class List_Vector_STACK {

    public static void main(String[] args) {
        /*
            STACK
                - Là 1 class extends Vector (tất nhiên là các hàm của nó cũng được đồng bộ)
                - Tuân thủ các quy định của 1 stack: Vào trước ra sau (FILO)
         */
        Stack stack = new Stack();// khai báo 1 stack chung chung
        Stack<String> stackString = new Stack<>();// khai báo stack kiểu String
        for (int i = 0; i < 10; i++) {
            stackString.add("Phan tu thu " + i);
        }
        // Stack hỗ trợ các hàm xử lí với ngăn xếp
        stackString.push("Nguyen Van A");// thêm 1 phần tử vào đình ngăn xếp
        System.out.println(stackString.peek());// lấy 1 phần tử ở đỉnh ngăn xếp mà không xóa bỏ
        System.out.println(stackString.pop());// lấy và xóa bỏ phần tử ở đỉnh ngăn xếp
        System.out.println("Stack có rỗng không: " + stackString.empty());// kiểm tra xem stack có rỗng không
        System.out.println(stackString.search("Phan tu thu 5"));// trả về vị trí của object muốn tìm kiếm
        // Ngoài ra các hàm của Vector có thì Stack cũng được hỗ trợ
    }
}
