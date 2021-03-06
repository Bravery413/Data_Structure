package leetcode.everyday.year2020.december;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 潘勇
 * @date 2020/12/26 19:27
 */


public class Solution1226 {
    public static void main(String[] args) {
        ArrayList<String> strList=new ArrayList();
        strList.add("1");
        strList.add("23");
        strList.add("0421");
        strList.add("asd");
        //神奇的现象：Integer的数组可以有字符型
        List<Integer> intList = new ArrayList(strList);
//        intList.replaceAll();
        System.out.println(intList);
        //打印报错：无法转型 java.lang.String cannot be cast to java.lang.Integer
//        for (int i:intList){
//            System.out.println(i);
//        }
        System.out.println("----");
        Iterator<String> itr = strList.iterator();
        while (itr.hasNext()){
            String next = itr.next();
            System.out.println(next);
            if (next.equals("1")){
                itr.remove();
            }
        }
        System.out.println(strList);
    }
}
