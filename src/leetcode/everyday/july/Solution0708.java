package leetcode.everyday.july;

import java.util.Arrays;

/**
 * @author: Bravery
 * @create: 2020-07-08 21:01
 * 面试题 16.11. 跳水板
 * 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
 * 返回的长度需要从小到大排列。
 * 示例：
 * 输入：
 * shorter = 1
 * longer = 2
 * k = 3
 * 输出： {3,4,5,6}
 * 提示：
 * 0 < shorter <= longer
 * 0 <= k <= 100000
 **/


public class Solution0708 {
    /**
     * 题目十分简单,只需要枚举试一下就发现
     * 第一次全是短的,然后替换k个长板,K+1种情况
     * 特殊情况是,长短板一样长,结果只有一个,
     * 木板用0块,返回空数组
     *
     * @param shorter
     * @param longer
     * @param k
     * @return
     */
    public static int[] divingBoard(int shorter, int longer, int k) {
        if (k <= 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{k * shorter};
        }
        int[] res = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            res[i] = shorter * (k - i) + longer * (i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = divingBoard(2, 2, 3);
        System.out.println(Arrays.toString(res));
    }
}
