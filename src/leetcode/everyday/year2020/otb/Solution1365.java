package leetcode.everyday.year2020.otb;

import java.util.Arrays;

/**
 * @author: Bravery
 * @create: 2020-10-27 21:47
 **/


public class Solution1365 {
    /**
     * 位图法:
     * 1.先遍历写进位数组
     * 2.取一个变量计数,从后往前遍历,遇到了就将当前位置值改为计数
     * 3.遍历原数组,构建答案数组,位图数组下标就是答案
     *
     * @param nums
     * @return
     */
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int[] bigMap = new int[101];
        for (int num : nums) {
            bigMap[num] = bigMap[num] + 1;
        }
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            int temp=bigMap[i];
            bigMap[i] =count;
            count+=temp;
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = bigMap[nums[i]];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] qus = {5, 0, 10, 0,10, 6};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(qus)));
    }

}
