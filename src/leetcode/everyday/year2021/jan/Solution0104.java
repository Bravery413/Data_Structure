package leetcode.everyday.year2021.jan;

/**
 * @author 潘勇
 * @date 2021/1/4 8:33
 */


public class Solution0104 {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 1; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
