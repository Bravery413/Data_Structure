package leetcode;

/**
 * @author: Bravery
 * @create: 2020-10-11 18:56
 **/


public class Solution64 {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int[][] dp = new int[row][column];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < column; i++) {
            dp[0][i] = grid[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < row; i++) {
            dp[i][0] = grid[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                int smaller = Math.min(dp[i - 1][j], dp[i][j - 1]);
                dp[i][j] =grid[i][j]+smaller;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(dp[i][j]);
            }
        }

        return dp[row-1][column-1];
    }
}
