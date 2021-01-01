package leetcode.everyday.year2020.december;

/**
 * @author 潘勇
 * @date 2020/12/21 20:02
 */

/**
 * 746. 使用最小花费爬楼梯
 */
public class Solution1221 {

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{0,0,0,1}));
    }


    /**
     * O(1)空间动态规划
     * @param cost
     * @return
     */
    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int a= cost[0];
        int b= cost[1];
        int temp;
        for (int i = 2; i < len; i++) {
            temp = Math.min(a, b)+cost[i];
            a=b;
            b=temp;
        }
        return Math.min(a,b);
    }


    /**
     * O(n)空间的动态规划
     * @param cost
     * @return
     */
    public static int minCostClimbingStairs0(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len+1];

        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i - 2], dp[i - 1])+cost[i];
        }
        return dp[len];
    }


}
