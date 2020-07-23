package leetcode.everyday.july;

/**
 * @author: Bravery
 * @create: 2020-07-23 20:56
 * 64. 最小路径和
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 * 示例:
 *
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 **/


public class Solution0723 {
    /**
     * 动态规划,创建一个状态数组dp[][]
     * 先第一行计算,第一列分别计算
     * 再计算中间的,取较小的
     * 最后dp最右下角的就是答案
     */
    public static int minPathSum(int[][] grid) {
        int row = grid.length;
        int columns = grid[0].length;
        int[][] res = new int[row][columns];
        res[0][0] = grid[0][0];
        for (int i = 1; i < row; i++) {
            res[i][0] = res[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < columns; i++) {
            res[0][i] = res[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < columns; j++) {
                res[i][j] = Math.min(res[i][j - 1], res[i - 1][j]) + grid[i][j];
            }
        }
        return res[row - 1][columns - 1];
    }

    public static void main(String[] args) {
        int[][] qus = {{1, 2, 5}, {3, 2, 1}};
        System.out.println(minPathSum(qus));
    }

}
