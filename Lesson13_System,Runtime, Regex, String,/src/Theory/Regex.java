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
public class Regex {

    public static void main(String[] args) {
        /*
            Regex (REGULAR EXPRESSION)- BIỂU THỨC CHÍNH QUY
                 - Hỗ trợ kiểm tra khuôn dạng của 1 chuỗi, với những khuôn dạng cơ bản được cung cấp trước
                 - Hầu như các ngôn ngữ đều có regex giống nhau 
         */
        String maSinhVien = "B14DCCN340";
        String maSinhVienSai = "T14DCCN340";
        String mau = "^B\\d{2}((DC)|(LT)|(CC))((CN)|(AT)|(VT)|(MR))\\d{3}";
        if (maSinhVien.matches(mau)) {
            System.out.println("maSinhVien đúng");
        } else {
            System.out.println("????");
        }
        if (!maSinhVienSai.matches(mau)) {
            System.out.println("maSinhVien sai");
        } else {
            System.out.println("????");
        }
        // regex rất khó thiết kế và khó dùng, nên tìm hiểu kĩ và search Google với những regex có sẵn
    }
}
