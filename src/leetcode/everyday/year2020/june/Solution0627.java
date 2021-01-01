package leetcode.everyday.year2020.june;

import java.util.HashSet;

/**
 * @author 潘勇
 * @date 2020/6/27 9:11
 * 41. 缺失的第一个正数
 * 给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数。
 * 示例 1:
 * 输入: [1,2,0]
 * 输出: 3
 * 示例 2:
 * 输入: [3,4,-1,1]
 * 输出: 2
 * 示例 3:
 * 输入: [7,8,9,11,12]
 * 输出: 1
 * 提示：
 * 你的算法的时间复杂度应为O(n)，并且只能使用常数级别的额外空间。
 */


public class Solution0627 {
    /**
     * 位图法超出时间限制
     */
    public int firstMissingPositive0(int[] nums) {

        boolean[] bitMap = new boolean[Integer.MAX_VALUE];
        for (int n : nums) {
            bitMap[n] = true;
        }

        for (int i = 0; i < bitMap.length; i++) {
            if (bitMap[i]) {
                return i;
            }
        }
        return 1;
    }

    /**
     * hash:通过但是不符合要求
     */
    public int firstMissingPositive1(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n : nums) {
            hashSet.add(n);
        }
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!hashSet.contains(i)) {
                return i;
            }
        }
        return 1;
    }


    /**
     * 置换
     * 用输入数组作为容器,才可能达到时空复杂度
     * 解题关键在于当数组长度为len,答案一定是[1,len+1]
     * 那么可以值等于下标-1,然后再遍历解决
     */
    public int firstMissingPositive3(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    /**
     * 此解比较不容易理解
     */
    public static int firstMissingPositive2(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] <= 0) {
                nums[i] = len + 1;
            }
        }
        for (int i = 0; i < len; i++) {
            int n = Math.abs(nums[i]);
            if (n <= len) {
                nums[n - 1] = -Math.abs(nums[n - 1]);
            }
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return len + 1;
    }

    public static void main(String[] args) {
        int[] qus = {3, 4, -1, 1};
        System.out.println(firstMissingPositive2(qus));
    }

}
