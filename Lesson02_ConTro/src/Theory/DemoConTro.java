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
public class DemoConTro {

    public static void main(String[] args) {
        // Trong java object như 1 con trỏ
        MonHoc mh1 = new MonHoc();
        mh1.ten = "Toan";
        mh1.soTinChi = 4;
        MonHoc mh2 = new MonHoc();
        mh2 = mh1;// cho mh2 trỏ vào vùng nhớ của mh1
        System.out.println("mh1.ten = " + mh1.ten);
        System.out.println("mh1.soTinChi = " + mh1.soTinChi);
        System.out.println("------------------------------");
        System.out.println("mh2.ten = " + mh2.ten);
        System.out.println("mh2.soTinChi = " + mh2.soTinChi);
        // do mh1 va mh2 cùng quản lí 1 vùng nhớ nên khi thay đổi mh1 thì mh2 cũng thay dổi theo
        mh2.soTinChi = 3;
        System.out.println("mh1.soTinChi = " + mh1.soTinChi);
        System.out.println("mh2.soTinChi = " + mh2.soTinChi);
        //----------------------------
        /*
            THAM CHIẾU VÀ THAM TRỊ
            - Tham chiếu là truyền vào địa chỉ của 1 ô nhớ làm đối số đầu vào cho hàm
            - Tham trị là truyền vào giá trị của 1 ô nhớ làm đối số đầu vào cho hàm (thường là các kiểu dữ liệu nguyên thủy: int, float, ...)
         */
        tangTinChi(mh1.soTinChi);// số tín chỉ vẫn giữ nguyên do giá trị của ô nhớ được truyền vào chứ không phải địa chỉ (cả ô nhớ) được truyền vào trong hàm đó
        tangTinChi(mh2.soTinChi);// số tín chỉ vẫn giữ nguyên do giá trị của ô nhớ được truyền vào chứ không phải địa chỉ (cả ô nhớ) được truyền vào trong hàm đó
        tangTinhChi(mh2);// số tín chỉ sẽ thay đổi vì truyền con trỏ vào trong hàm (truyền địa chỉ của ô nhớ vào trong hàm)
        System.out.println("mh1.soTinChi = " + mh1.soTinChi);
        System.out.println("mh1.soTinChi = " + mh2.soTinChi);
    }

    public static void tangTinChi(int tinChi) {// tham trị
        tinChi++;
    }

    public static void tangTinhChi(MonHoc monHoc) {// tham chiếu
        monHoc.soTinChi++;
    }
}
