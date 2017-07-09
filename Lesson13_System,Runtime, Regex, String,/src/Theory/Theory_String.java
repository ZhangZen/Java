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
public class Theory_String {

    public static void main1(String[] args) {
        /*
          String là 1 class trong java giúp làm việc và xử lí chuỗi
            - Nhưng String có 2 yếu điểm đó chính là hiệu năng không cao và gây lãng phí bộ nhớ hơn là StringBuilder và StringBuffer
            - Lí do chính là String luôn tạo vùng nhớ mới cho mỗi thao tác (khởi tạo, sử dụng hàm nối, cắt, ...) 
                Còn StringBuilder và StringBuffer thì ngược lại, chúng sẽ tối ưu hóa và nâng cao hiệu năng khi ta làm việc với chuối
            - Điểm khác biệt giữa StringBuilder và StringBuffer đó chính là các hàm của StringBuffer được đồng bộ luồng (sychronized)
                    tức là chỉ 1 luồng được hoạt động trong hàm của StringBuffer
                    còn StringBuilder sẽ cho phép nhiều luồng cùng sử dụng hàm
         */
        //------------------------------------------------------
        // khởi tạo 1 chuỗi thông thường
        String string = new String();// Cách 1
        String string1 = "abc";// Cách 2
        String string2 = new String(string1.getBytes());//Cách 3
        String string3 = new String(new StringBuffer("q3"));// Cách 4
        String string4 = new String(new StringBuilder("akjdfvb"));// Cách 5
        //Và còn nhiều cách khác
        //---------------------------------------------------
        //Dùng thử các hàm của String
        String a = "123";
        String b = "abc";
        String concat = a.concat(b);// nối 2 chuỗi lại thành 1 chuỗi mới, nhưng bản chất không phải là nối chuỗi này vào chuỗi kia
        // mà String sẽ tạo ra 1 vùng nhớ mới, đưa chuỗi a vào, sau đó đưa chuỗi b vào sau và cho chuỗi a trỏ vào vùng nhớ mới đó ==> Lãng phí bộ nhớ,
        //vì vậy người ta hạn chế dùng các hàm của class String mà thường dùng của StringBuffer và StringBulder
        System.out.println("Chuỗi sau khi nối: " + concat);
        System.out.println(a.charAt(2));// trả về kí tự tại vị trí mong muốn, nó sẽ bắn ra exception nếu vị trí vượt quá độ dài chuỗi hoặc vị trí là âm
        // Vì vậy, nếu chuẩn ta phải đưa vào try-catch
//        try {
//            System.out.println("Kí tự tại vị trí số 2 trong chuỗi '" + b + "' là: " + b.charAt(2));
//            System.out.println("Kí tự tại vị trí số 6 trong chuỗi '" + b + "' là: " + b.charAt(6));
//            System.out.println("Kí tự tại vị trí số -1 trong chuỗi '" + b + "' là: " + b.charAt(-1));
//        } catch (Exception e) {
//            System.out.println("Vị trí mong muốn không hợp lệ!!!");
//        }
        System.out.println(a.compareTo(b));// so sánh 2 chuỗi: lớn hơn trả về dương, nhỏ hơn trả về âm, bằng nhau trả về 0
        System.out.println(a.compareToIgnoreCase(b));// so sánh 2 chuỗi bỏ qua kí tự in hoa: Java sẽ chuyển 2 chuỗi về 2 chuỗi chỉ có kí tự in hoa (hoặc thường) để so sánh
        System.out.println(a.contains("2"));// kiểm tra xem chuỗi a có chứa chuỗi "2" hay không: đúng trả về true và ngược lại
        System.out.println(a.endsWith("23"));// kiểm tra xem chuỗi a có kết thúc bằng chuỗi "23" hay không, đúng trả về true và ngược lại
        System.out.println(a.equals(b));// kiểm tra xem a có bằng b hay không, đúng trả về true và ngược lại
        System.out.println(a.equalsIgnoreCase(b));// kiểm tra xem a có bằng b hay không, quá trình kiểm tra bó qua sự sai khác về chữ hoa và chữ thường của cùng 1 kí tự trong 2 chuỗi, đúng trả về true và ngược lại
        System.out.println(a.isEmpty());// kiểm tra xem chuỗi a có rỗng không, đúng trả về true và ngược lại
        System.out.println(a.length());// độ dài xâu a
        System.out.println(a.indexOf('a'));// trả về vị trí của kí tự 'a' trong xâu a, nếu không có sẽ trả về -1
        System.out.println(a.indexOf("3"));// trả về vị trí của xâu 3 trong xâu a, nếu không có sẽ trả về -1
        System.out.println(a.indexOf("12", 2));// trả về vị trí bắt đầu của xâu "12" trong chuỗi a bắt đầu kiểm tra từ vị trí số 2
        System.out.println(a.lastIndexOf("45554"));// trả về vị trí cuối cùng của chuỗi "45554" trong chuỗi a, nếu không có sẽ trả về -1
        String temp = "afbaedb adfb 3434 dfbad";
        String[] split = temp.split(" ");// cắt chuỗi temp thành 1 mảng các chuỗi split với điều kiện gặp kí tự " " thì cắt thành chuỗi mới
        for (String string5 : split) {
            System.out.println(string5);
        }
        char[] toCharArray = a.toCharArray();// trả về mảng các kí tự có trong xâu a
        for (char c : toCharArray) {
            System.out.println(c);
        }
        System.out.println(a.toLowerCase());// chuyển tất cả các kí tự của a thành chữ thường
        System.out.println(a.toUpperCase());// chuyển tất cả các kí tự của a thành chữ hoa
        String demo = "                rrrrrrrrrrrrrrrr              1      ";
        System.out.println(demo.trim());// loại bỏ tất cả các dấu cách thừa ở đầu và cuối chuỗi demo
        // Ngoài ra String còn rất nhiều hàm khác, nên tìm hiểu và học cách sử dụng
    }

    public static void main2(String[] args) {
        /*
            STRINGBUFFER
                - Dựa trên cơ chế bộ đệm để xử lí và làm việc với chuỗi
                - Các hàm của StringBuffer được đồng bộ cho luồng (tại 1 thời điểm chỉ có duy nhất 1 luồng được sử dụng hàm của StrinBuffer)
         */
        // khởi tạo StringBuffer
        StringBuffer buffer = new StringBuffer();// Cách 1
        StringBuffer buffer1 = new StringBuffer("nvvdfjhbvf");// Cách 2
        StringBuffer buffer2 = new StringBuffer(4);// Cách 3, chuỗi buffer này chứa tối đa 4 kí tự
        StringBuffer sb = new StringBuffer("Nguyen Van A");// thường dùng cách này
        sb.append("123");// nối "123" vào sb, hàm này của StringBuffer không tạo ra vùng nhớ thừa, vì vậy không gây lãng phí bộ nhớ
        System.out.println(sb.capacity());// trả về dung lượng của sb
        System.out.println(sb.charAt(4));// trả về kí tự ở vị trí mong muốn, cùng ủy thác IndexOutOfBoundException, nên để trong try-catch
        System.out.println(sb.delete(0, 6));// xóa 1 chuỗi bắt đầu từ vị trí số 0 tới vị trí số 6 trong sb
        System.out.println(sb.deleteCharAt(0));// xóa 1 kí tự tại vị trí nhất định, bắn ra IndexOutOfBoundException
        System.out.println(sb.indexOf("34"));
        System.out.println(sb.insert(3, "Chuỗi được chèn thêm vào"));
        System.out.println(sb.lastIndexOf("23"));
        System.out.println(sb.length());
        System.out.println(sb.reverse());// đảo ngược sb
        //.....
    }

    public static void main(String[] args) {
        /*
            STRINGBUILDER
                - Dựa trên cơ chế bộ đệm để xử lí và làm việc với chuỗi
                - Các hàm của StringBuilder không được đồng bộ cho luồng (tại 1 thời điểm cho phép nhiều luồng được sử dụng hàm của StrinBuffer)
         */
        // khởi tạo
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder("3134");
        StringBuilder builder2 = new StringBuilder(5);// dung lượng tối đa là 5
        StringBuilder sb = new StringBuilder("Lap trinh huong doi tuong");
        System.out.println(sb.append(" voi Java"));// nối chuỗi
        //.....
        //Các hàm của StringBuilder cũng giống như StringBuffer
    }
}
