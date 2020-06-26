package leetcode.everyday.june;

/**
 * @author 潘勇
 * @date 2020/6/02 9:15
 * 剑指 Offer 64. 求1+2+…+n
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Solution0602 {
    public static int sumNums(int n) {
        return n*(n+1)/2;
    }

    public static void main(String[] args) {
        System.out.println(sumNums(9));
    }
}
