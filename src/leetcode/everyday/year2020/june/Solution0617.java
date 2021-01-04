package leetcode.everyday.year2020.june;

/**
 * 最佳观光组合:
 * 给定正整数数组 A，A[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的距离为 j - i。
 * 一对景点（i < j）组成的观光组合的得分为（A[i] + A[j] + i - j）：景点的评分之和减去它们两者之间的距离。
 * 返回一对观光景点能取得的最高分。
 * 示例：
 * 输入：[8,1,5,2,6]
 * 输出：11
 * 解释：i = 0, j = 2, A[i] + A[j] + i - j = 8 + 5 + 0 - 2 = 11
 */
public class Solution0617 {
    /**
     * 暴力超出时间限制
     *
     * @param A
     * @return
     */
    public static int maxScoreSightseeingPair1(int[] A) {
        int res = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int count = A[i] + A[j] + i - j;
                res = Math.max(count, res);
            }
        }
        return res;
    }

    /**
     * 优化:A[i]+A[j}+i-j
     * 其实暴力里面 每一轮A[i]+i是不变的,抽取出来max=max(A[i}+i)
     * result=max(max+A[j]-j)
     *
     * @param A
     * @return
     */
    public static int maxScoreSightseeingPair(int[] A) {
        int res = 0;
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            res = Math.max(res, max + A[i] - i);
            max = Math.max(max, A[i] + i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] qus = {8, 1, 5, 2, 6};
        System.out.println(maxScoreSightseeingPair(qus));
    }
}
