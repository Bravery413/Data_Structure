package leetcode.everyday.year2020.june;

/**
 * 爬楼梯
 */
public class Solution0613 {
    /**
     * 递归 超过时间限制
     * @param n
     * @return
     */
    public static int climbStairs1(int n) {
        if (n==1||n==2){
            return n;
        }
        return climbStairs1(n-1)+climbStairs1(n-2);
    }
    public static int climbStairs(int n) {
        if (n==1||n==2){
            return n;
        }
        int a=1;
        int b=2;
        for (int i=3;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;

    }
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }


}
