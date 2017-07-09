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
public class DemoPhepChiaCho0 {

    public static void main(String[] args) {
        /*
            Loi chia cho 0, co 2 cach xu ly:
                1. Su dung vong IF de kiem tra b=0
                2. Dung exception
         */
//        int a, b, c;
//        a = 10;
//        b = 0;
//        // 1. Su dung vong IF kiem tra b
//        if (b == 0) {
//            System.out.println("b=0 !!!. End program.");
//            return;
//        } else {
//            c = a / b;
//            System.out.println("c = " + c);
//        }
        //==> Khong kha thi khi xuat hien nhieu cau lenh phai kiem tra va khong mang tinh chuyen nghiep !!!
        //==> Su dung exception
        System.out.println("-----------------------------------");
        int d = 0, e = 0, g;
//        d = 20;
//        e = 0;
        try {// IDE sẽ thử thực hiện đoạn code trong khối TRY, nếu có sự cố thì nhảy vào CATCH để thực hiện câu lệnh trong catch
            System.out.println("Nhap so thu nhat: ");
            d = new Scanner(System.in).nextInt();
            e = new Scanner(System.in).nextInt();
            g = d / e;
//        } catch (Exception ex) {// có thể viết như thế này nhưng nên bắt đúng ngoại lệ
        } catch (InputMismatchException ex) {// Exception là 1 object đại diện cho sự cố xảy ra
//            ex.printStackTrace(); //==> ít dùng
            System.out.println("Nhap sai kieu du lieu: " + ex.getStackTrace());
        } catch (ArithmeticException ex) {// Có thể sử dụng nhiều exception, vì trong khối catch sẽ xảy ra nhiều ngoại lệ
            // Nhưng exception lớn phải ở sau exception nhỏ
            // Ví dụ như Exception là object lớn nhất sẽ ở sau cùng (sau ArithmeticException, InputMismatchException, ClassCastException, ...)
            // Exception có cây kế thừa phức tạp, nên nhớ một số Exception thường dùng
            // Google để xem cây kế thừa của Exception
            System.out.println("Khong the chia cho 0 duoc: " + ex.getMessage());// hiện thông điệp do ngoại lệ xảy ra gửi đến
        } catch (Exception ee) {// Excepetion là object ngoại lệ lớn nhất cần được đặt sau cùng, nếu đặt trước thì sẽ lỗi
            System.out.println("Xay ra su co gi do ... ");
        }
        // trong java 8, ta có thể sử dụng nhiều catch với cùng lệnh xử lí trong 1 catch, ví dụ
        //catch(InputMismatchException | ArithmeticException e){...}
        System.out.println("---------------------------------------------------");
        try {
            //giả sử có sự cố chia cho 1
            int a, b;
            a = 10;
            b = 1;
            if (b == 1) {
//                Exception exception = new Exception("Xay ra su co chia cho 1");
//                // nếu muốn bắt ngoại lệ trong đây sử dụng catch thì không được
//                // do catch luôn luôn đi kèm với try ==> Sử dụng từ khóa throw đẻ bắn ra exception
//                throw exception;// gọi catch chạy, nó sẽ chạy vào Exception ở dưới mà có kiểu trùng với kiểu mình khai báo object Exception
                // ngoài ra còn 1 cách khác nếu ngoại lệ xảy ra mà Java không hỗ trợ, ta sẽ tự tạo exception của riêng mình (Class SuCoChiaChoMot)
                SuCoChiaChoMot exception = new SuCoChiaChoMot();
                throw exception;
            }
        } catch (InputMismatchException ex) {
            System.out.println("Su so nhap sai kieu du lieu");
        } catch (SuCoChiaChoMot ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Su co...: " + ex.getMessage());
        }
        // Ngoài ra, nếu 1 hàm nào đó không muốn xử lí exception hoặc chưa cần xử lý khi không cần thiết, ta nên throw
        // xem class DemoMyException
        System.out.println("----------------------------------------------");
        //FINALLY ==> Chết vẫn chạy
        /*
            - Finally là từ khóa xuất hiện sau cùng của khối try-catch
            - Nó có nhiệm vụ thực thi những câu lệnh sau khi thực hiện try-catch
            - Điểm đặc biệt của finally chính là kể cả câu lệnh return trong try-catch được thực hiện thì câu lệnh trong finally vẫn được thực hiện
                ==> Ứng dụng trong việc đóng file khi code trong try-catch không chạy nữa,,....
            - Chú ý: +, Finally không nhất thiết phải xuất hiện trong mỗi khối try-catch
                     +, Finally có thể chỉ cần đi riêng với try, tạo thành khối try-finally, khi ấy không cần có catch
         */
        try {
            // Code trong TRY
        } catch (Exception ex) {
            // Sự cố trong CATCH
        } finally {
            // Chết rồi vẫn chạy
        }
    }
}
