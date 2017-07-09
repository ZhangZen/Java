/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theory;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Zhang
 */
public class Theory_Calendar {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();// khởi tạo 1 calendar theo dương lịch
//        Calendar calendar2 = new BuddhistCalendar();// khởi tạo 1 calendar theo âm lịch
        // lấy về thời gian hiện tại
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
//        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
//        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println(calendar.get(Calendar.ERA));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.SHORT_FORMAT));
        //-----------------------------------------------------
        System.out.println("-------------------------------------------");
        // Calendar là 1 class hỗ trợ làm việc với thời gian với các hàm lấy thông số và xử lí
    }
}
