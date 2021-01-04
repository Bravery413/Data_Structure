package leetcode.everyday.year2020;

import java.util.Calendar;

/**
 * @author 潘勇
 * @date 2020/7/7 11:31
 */


public class Test {
    public static void main(String[] args) {
        StringBuilder yearMonth=new StringBuilder();
        Calendar cal = Calendar.getInstance();
        yearMonth.append(cal.get(Calendar.YEAR));
        yearMonth.append("-");
        int month = cal.get(Calendar.MONTH) + 2;
        if (month<10){
            yearMonth.append(0);
        }
        System.out.println(cal.get(Calendar.DATE));
//        yearMonth.append(month);
//        System.out.println(yearMonth.toString());
    }
}
