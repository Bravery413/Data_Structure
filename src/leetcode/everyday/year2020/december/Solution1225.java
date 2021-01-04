package leetcode.everyday.year2020.december;

/**
 * @author 潘勇
 * @date 2020/12/26 20:49
 */

import java.util.Arrays;

/**
 * 455. 分发饼干
 */
public class Solution1225 {

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}));
//        System.out.println(findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }


    /**
     * 贪心思想
     * 1.g和s排序
     * 2.g从小到大开始，去s从小到大找到第一个满足的为满足，直到s走完，即为满足数
     *
     * @param g
     * @param s
     * @return
     */
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length; i++,j++) {
            while (j < s.length && g[i] > s[j]) {
                j++;
            }
            if (j <= s.length - 1) {
                res++;
            }
        }
        return res;
    }
}
