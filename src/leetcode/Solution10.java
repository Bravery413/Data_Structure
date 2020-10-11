package leetcode;

/**
 * @author: Bravery
 * @create: 2020-10-11 18:11
 **/


public class Solution10 {
    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1 || n == 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n] % 1000000007;
    }

    public int numWays1(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1 || n == 2) {
            return n;
        }
        int dp1 = 1;
        int dp2 = 2;
        for (int i = 3; i <= n; i++) {
            int temp = dp2;
            dp2 = (dp1 + dp2) % 1000000007;
            dp1 = temp;
        }
        return dp2 % 1000000007;
    }
}
