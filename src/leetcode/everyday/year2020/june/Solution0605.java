package leetcode.everyday.year2020.june;

/**
 * @author 潘勇
 * @date 2020/6/05 9:15
 * 剑指 Offer 29. 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 */
public class Solution0605 {
//    public int[] spiralOrder(int[][] matrix) {
//        if (matrix == null || matrix.length == 0) {
//            return new int[0];
//        }
//        int left = 0;
//        int right = matrix[0].length - 1;
//        int top = 0;
//        int botton = matrix.length - 1;
//        int[] res = new int[matrix[0].length * matrix.length];
//        int x = 0;
//        while (true) {
//            for (int i = left; i <= right; i++) res[x++] = matrix[top][i];
//            if (++top > botton) break;
//            for (int i = top; i <= botton; i++) res[x++] = matrix[i][right];
//            if (left > --right) break;
//            for (int i = right; i >= left; i--) res[x++] = matrix[botton][i];
//            if (top > --botton) break;
//            for (int i = botton; i >= top; i--) res[x++] = matrix[i][left];
//            if (++left > right) break;
//        }
//        return res;
//    }

    /**
     * 加深理解重写
     *
     * @param matrix 入参矩阵
     * @return 输出数组
     */
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int[] res = new int[matrix[0].length * matrix.length];
        int index = 0;
        while (true) {
            for (int i = left; i <= right; i++) {
                res[index] = matrix[top][i];
                index++;
            }
            if (++top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                res[index] = matrix[i][right];
                index++;
            }
            if (--right < left) {
                break;
            }
            for (int i = right; i >= left; i--) {
                res[index] = matrix[bottom][i];
                index++;
            }
            if (--bottom < top) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                res[index] = matrix[i][left];
                index++;
            }
            if (++left > right) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] qus = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int res:spiralOrder(qus)) {
            System.out.println(res);
        }
    }

}
