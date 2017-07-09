/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author Zhang
 */
public class List_ArayList {

    public static void main(String[] args) {
        /*
        ARRAYLIST
            - ArrayList là 1 class implements interface List
            - Bản chất của ArrayList là 1 List các phần tử (cùng hoặc khác loại) giống như mảng
                nhưng ArrayList linh hoạt hơn mảng: nó không giới hạn các phần tử
                và hỗ trợ các thao tác sắp xếp, tìm kiếm 1 cách hiệu quả và nhanh chóng
         */
        //Demo ArrayLIst chung chung
        List list1 = new ArrayList();// khai báo và khởi tạo 1 list
//        ArrayList list1 = new ArrayList();// hoặc ntn
        //---------------------------------------------
        // thêm phần tử vào List sử dụng hàm ADD
        list1.add(12);// thêm 1 số nguyên vào list
        list1.add(12.5);// thêm 1 số thực vào list
        list1.add('a');// thêm 1 kí tự vào list
        list1.add("anc");// thêm 1 chuỗi vào list
        for (int i = 0; i < 10; i++) {
            list1.add(new SinhVien(i, "Nguyen Van " + i));// thêm 1 object vào list
        }
        //----------------------------------------------
        //Lấy phần tử ra khỏi List
        System.out.println("Các phần tử có trong ArrayList: ");
        //Cách 1: Truyền thống
        System.out.println("Cách 1: Sử dụng hàm GET");
        for (int i = 0; i < list1.size(); i++) {// hàm SIZE để lấy kích thước của list
            System.out.println(list1.get(i));// hàm GET để lấy ra phần tử
        }
        System.out.println("------------------------------------");
        //Cách 2: Sử dụng Iterator
        System.out.println("Cách 2: Sử dụng Iterator");
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("------------------------------------");
        // Cách 3: Sử dụng fore
        System.out.println("Cách 3: Sử dụng fore (Bản chất là cách 1): ");
        for (Object object : list1) {
            System.out.println(object);
        }
        System.out.println("------------------------------------");
        System.out.println("Cách 4: Sử dụng forEach với inner anomyous class: ");
        //Cách 4: Sử dụng forEach với inner anomyous class
        list1.forEach(new Consumer() {
            @Override
            public void accept(Object t) {
                System.out.println(t);
            }
        });
        System.out.println("------------------------------------");
        System.out.println("Cách 5: forEach trong Java 8 với lambda expression(bản chất là cách 4): ");
        list1.forEach(t -> {
            System.out.println(t);
        });
        System.out.println("------------------------------------");
        System.out.println("Cách 6: forEach trong Java 8 với member reference(bản chất là cách 4): ");
        list1.forEach(System.out::println);// 1 dòng!!!!
        System.out.println("------------------------------------");
        //-------------------------------------------------------------
        // ngoài ra còn có thể thêm phần tử vào list một cách linh hoạt bằng 1 số hàm
        list1.add(4, new SinhVien(100, "SinhVienDuocThemVaoGiua"));
        // ngoài ra còn hàm addAll
        list1.clear();// hàm clear sẽ xóa sạch các phần tử của list
        System.out.println("Sau khi gọi hàm clear thì list có rỗng không: " + list1.isEmpty());// kiểm tra xem list có rỗng không
        System.out.println("Vị trí của phần tử mang giá trị '12' trong list: " + list1.indexOf(12));// lấy vị trí của 1 object nhất định trong list, trả về -1 nếu không tồn tại trong list
        // các hàm liên quan đến Iterator sẽ hỗ trợ List làm việc với Iterator
        //------------------------------------------------
        list1.add(new SinhVien(100, "Nguyen Van A"));
        list1.add(new SinhVien(105, "Doan Thi C"));
        list1.add(new SinhVien(110, "Ly Hoai Nam"));
        list1.add(465);
        list1.add(new SinhVien(204, "Do Van Hoc"));
        list1.add(4, "ABVISVBD");
        System.out.println(list1.remove(3));// remove object tại vị trí số 3 trong list, nếu được trả về true, ngược lại trả về false
//        list1.removeAll(list1);// xóa bỏ tất cả các phần tử của list
        System.out.println("------------------------------------");
        Object[] toArray = list1.toArray();// đưa list về mảng
        for (Object toArray1 : toArray) {
            System.out.println(toArray1);
        }
        // sắp xếp list, sử dụng hàm sort (bản chất của hàm sort là quickSort)
//        list1.sort(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1.hashCode() < o2.hashCode()) {// giả sử như so sánh hashCode của 2 object
//                    return -1;
//                } else {
//                    if (o2.hashCode() == o1.hashCode()) {
//                        return 0;
//                    }
//                }
//                return 1;
//            }
//        });
        //---------------------------------
        list1.sort((Object o1, Object o2) -> {// lambda
            if (o1.hashCode() < o2.hashCode()) {// giả sử như so sánh hashCode của 2 object
                return -1;
            } else {
                if (o2.hashCode() == o1.hashCode()) {
                    return 0;
                }
            }
            return 1;
        });
        //---------------------------------
        Collections.sort(list1, (o1, o2) -> {// sử dụng Collections
            if (o1.hashCode() < o2.hashCode()) {// giả sử như so sánh hashCode của 2 object
                return -1;
            } else {
                if (o2.hashCode() == o1.hashCode()) {
                    return 0;
                }
            }
            return 1;
        });
        list1.forEach(System.out::println);
        //---------------------------------
        System.out.println("-------------------------------------");
        Stream stream = list1.stream();// chuyển thành luồng
        stream.filter(new Predicate() {// lọc danh sách sử dụng Predicate
            @Override
            public boolean test(Object t) {
                //....
                return true;
            }
        });
        // thường người ta dùng lambda
        List<SinhVien> dsSinhVien = new ArrayList<>();
        list1.stream().filter((Object t) -> {
            if (t instanceof SinhVien) {
                dsSinhVien.add((SinhVien) t);
            }
            return false;
        });
        dsSinhVien.forEach(t -> {
            System.out.println("Sinh vien: " + t);
        });
        // Người ta thường ứng dụng stream() nhiều trong java 8 với tìm kiếm và lọc, hiệu quả, nhanh chóng và mạnh mẽ
    }

    public static void main1(String[] args) {
        /*
            ARRAYLIST VỚI GENERIC
                Generic sẽ giúp các class của Collection rõ ràng và hiệu quả
         */
        ArrayList<String> listString = new ArrayList<>();// khai báo list chỉ chứa các chuỗi
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();// khai báo list chỉ chứa các object SinhVien
        ArrayList<Integer> listInteger = new ArrayList<>(); // nếu khai báo là ArrayList<int> listInteger = new ArrayList<>(), hoặc ArrayList<double> listInteger = new ArrayList<>() sẽ báo lỗi
        for (int i = 0; i < 10; i++) {
            listSinhVien.add(new SinhVien(i, "Nguyen Van " + i));
        }
//        listSinhVien.add(12);//Nếu cố tình add 1 object kiểu khác kiểu SinhVien thì sẽ gây lỗi
        // tương tự nếu thêm 1 object khác kiểu String vào listString sẽ gây lỗi
        listString.add("Nguyen Van A");
        listString.add("Doan Thi Diem");
        listString.add("Do Quoc Cong");
        listString.add("Ly Hoai Nam");
        // khi có Generic, việc sắp xếp và tìm kiếm sẽ dễ dàng hơn
        listString.sort((String o1, String o2) -> {// so sánh đơn giản
            return o1.compareTo(o2);
        });
        listString.forEach(System.out::println);
        System.out.println("------------------------------");
        listInteger.add(100);
        listInteger.add(205);
        listInteger.add(467);
        listInteger.add(-453);
        listInteger.add(34);
        listInteger.sort((o1, o2) -> {// chú ý khi dùng lambda:
            // khi đối tượng so sánh là kiểu nguyên thủy: int, float, double, ... thì không cần ghi kiểu dữ liệu của o1 và o2
            // khi đối tượng so sánh là kiểu không phải nguyên thủy: String, SinhVien, ... thì ta cần ghi kiểu của object o1 và o2 để Java xác định rõ kiểu để so sánh, nếu không sẽ mắc lỗi runtime
            return o1.compareTo(o2);
        });
        listInteger.forEach(System.out::println);
        System.out.println("------------------------------");
        // và 1 vài thao tác khác sẽ trở nên dễ dàng hơn
    }
}
