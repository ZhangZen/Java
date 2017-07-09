/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Zhang
 */
public class DemoMyException {

    static int a, b;
    // Giả sử class này xử lí việc tính toán phép nhân 2 số nguyên dương, và cần nhập vào từ bàn phím

    public static void main(String[] args) {
        // Demo throws - ủy thác exception
        try {
            nhapDuLieu();
            System.out.println("Tích 2 số là: " + a * b);
        } catch (InputMismatchException e) {
            System.out.println("Sự cố nhập sai kiểu dữ liệu: " + e.getMessage());
        }
    }

    public static void nhapDuLieu() throws InputMismatchException {// ủy thác cho hàm khác xử lí ngoại lệ
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
    }
    /*
        Sự ủy thác cần được xem xét để thực hiện, chỉ thực hiện ủy thác khi:
        - Hàm có exception chưa cần xử lí đến hoặc nếu xử lí trái với tư tưởng hướng đối tượng
                ví dụ: SinhVien có hàm setTuoi (nhập tuổi) thì cần ủy thác ngoại lệ cho hàm nhapThongTin xử lí
        - Không nên để ủy thác ngoại lệ xuất hiện trong hàm main, do hàm main là hàm để chạy chương trình
             nếu ủy thác tại hàm main thì không có hàm nào sau hàm main để xử lí ngoại lệ này !!!
        - Nên xử lí ngoại lệ nếu gặp, ủy thác không nên ưu tiên trước xử lí trực tiếp
     */
}
