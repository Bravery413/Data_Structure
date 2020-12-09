package leetcode.everyday.december;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 潘勇
 * @date 2020/12/9 8:35
 */

/**
 * 62. 不同路径
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 输入: m = 7, n = 3
 * 输出: 28
 */
public class Solution1209 {
    /**
     * 1.集合表示：
     * int[3][7] :int[row][column]  int[行][列]
     *     ********
     *     ********
     *     ********
     * 2.dp思想记录子结果
     * @param m
     * @param n
     * @return
     */
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];
        Arrays.fill(dp[0], 1);
        for (int j = 0; j < n; j++) {
            dp[j][0] = 1;
        }
        for(int i=1;i<n;i++){
            for (int j=1;j<m;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[n-1][m-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(7,3));

    }

}
