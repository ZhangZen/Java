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
public class READ_ME {

    public static void main(String[] args) {
        /*
            CƠ CHẾ KẾT NỐI GIỮA SERVER VÀ CLIENT
                - Bước 1: Server sẽ khởi động để lắng nghe và chờ đợi Client kết nối đến
                - Bước 2: Khi client muốn trao đổi dữ liệu tới server (có nhu cầu kết nối), 
                            nó sẽ tạo ra socket chứa dữ liệu, cổng (port) và thông tin của client để kết nối tới server, 
                            khi ấy socket sẽ gửi thông tin trực tiếp từ Client tới Server (chỉ duy nhất lần đầu gửi trực tiếp thế này vì Server chưa sinh ra socket của nó)
                - Bước 3: Khi server nhận được tín hiệu kết nối từ Client, nó sẽ tạo ra 1 socket  tương ứng của nó
                            socket này cũng chứa dữ liệu, cổng (port) và thông tin của Server (socket này về bản chất giống socket trước, nhưng nội dung khác nhau)
                - Bước 4: 2 socket của server và client sẽ thông nhau , việc gửi và nhận dữ liệu sẽ được thực hiện thông qua 2 socket này
                            nếu muốn tiếp nhận dữ liệu server hoặc cilent sẽ đọc về từ socker, ngược lại nếu không muốn thì dữ liệu sẽ được giữ tại socket
         */
    }
}
