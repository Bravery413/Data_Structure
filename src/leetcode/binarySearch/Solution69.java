package leetcode.binarySearch;

/**
 * @author bravery
 * @date 2019/8/26 7:37
 */
public class Solution69 {
    //二分法;
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        //
        // 注意：针对特殊测试用例，例如 2147395599
        // 要把搜索的范围设置成长整型
        // 为了照顾到 0 把左边界设置为 0
        long left = 0;
        // # 为了照顾到 1 把右边界设置为 x // 2 + 1
        long right = x / 2 + 1;
        while (left < right) {
            // 注意：这里一定取右中位数，如果取左中位数，代码会进入死循环
            // long mid = left + (right - left + 1) / 2;
            long mid = (left + right + 1) >>> 1;
            long square = mid * mid;
            if (square > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int) left;
    }

    public int mySqrt1(int x) {
        if (x == 0) {
            return 0;
        }
        long left = 0;
        long right = x / 2;
        long mid;
        while (left < right) {
            mid =(right + left + 1) >>> 1;
            long temp = mid * mid;
            if (temp > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int) left;
    }

    //牛顿法
    public int mySqrt2(int a) {
        long x = a;
        while (x * x > a) {
            x = (x + a / x) / 2;
        }
        return (int) x;
    }



}
