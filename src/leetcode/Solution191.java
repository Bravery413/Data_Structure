package leetcode;

public class Solution191 {
    // you need to treat n as an unsigned value
    //减1再与
    public static int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(-15));
    }
}
