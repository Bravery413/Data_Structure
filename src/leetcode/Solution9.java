//package leetCode;
//
//import linearList.LinkList;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class Solution9 {
//    public static boolean isPalindrome(int x) {
//        if (x<0)
//            return false;
//        LinkedList<Integer> list = new LinkedList<>();
//        while (x!=0){
//            list.add(x%10);
//            x/=10;
//        }
//        System.out.println(list.toString());
//        while (list.size()>1){
//            if (list.removeFirst()!=list.removeLast()){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        boolean b = isPalindrome(135531);
//        System.out.println(b);
//    }
//}
