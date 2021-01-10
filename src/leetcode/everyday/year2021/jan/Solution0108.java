package leetcode.everyday.year2021.jan;

import java.util.Arrays;

/**
 * @author 潘勇
 * @date 2021/1/8 8:38
 */

/**
 * 189. 旋转数组
 * 方法1：新的数组放置 (i+k)%len
 * 方法2：环状替代，每个数字放到最后的位置
 * 方法3：数组翻转： 三次
 * 1234567
 * 一：7654321[0,len-1]
 * 二：5674321[0,k-1]
 * 三：5671234[k,len-1]
 */
public class Solution0108 {
    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
//        rotate(new int[]{-1}, 2);
    }


    /**
     * 翻转:0ms 100%
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        revert(nums, 0, len - 1);
        revert(nums, 0, k - 1);
        revert(nums, k, len - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void revert(int[] nums, int start, int end) {
        int temp;
        //可以改成 while(start<end)
        int times = (end - start + 1) / 2;
        for (int i = 0; i < times; i++) {
            temp = nums[start + i];
            nums[start + i] = nums[end - i];
            nums[end - i] = temp;

        }
    }


    public static void rotate0(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int[] help = new int[len * 2];
        for (int i = 0; i < len; i++) {
            help[i] = nums[i];
        }
        for (int i = len; i < len * 2; i++) {
            help[i] = nums[i - len];
        }
        for (int i = len - k, j = 0; i < len * 2 - k; i++, j++) {
            nums[j] = help[i];
        }
        System.out.println(Arrays.toString(nums));
    }


}
