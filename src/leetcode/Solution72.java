package leetcode;

/**
 * @author: Bravery
 * @create: 2020-10-11 23:24
 **/


public class Solution72 {
    public int minDistance(String word1, String word2) {
        if (word1 == null && word2 == null) {
            return 0;
        } else if (word1 == null) {
            return word2.length();
        } else if (word2 == null) {
            return word1.length();
        }
        int l1 = word1.length();
        int l2 = word2.length();
        int[][] dp = new int[l1 + 1][l2 + 1];
        for (int i = 0; i <= l1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= l2; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < l1; i++) {
            for (int j = 1; j < l2; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]);
                }
            }
        }
        return dp[l1][l2];
    }
}
