package leetCode.everyDayOneQuestion.june;

public class Solution0605 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null||matrix.length==0) return new int[0];
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int botton = matrix.length - 1;
        int[] res = new int[matrix[0].length * matrix.length];
        int x = 0;
        while (true) {
            for (int i = left; i <= right; i++) res[x++] = matrix[top][i];
            if (++top > botton) break;
            for (int i = top; i <= botton; i++) res[x++] = matrix[i][right];
            if (left > --right) break;
            for (int i = right; i >= left; i--) res[x++] = matrix[botton][i];
            if (top > --botton) break;
            for (int i = botton; i >= top; i--) res[x++] = matrix[i][left];
            if (++left > right) break;
        }
        return res;
    }
}
