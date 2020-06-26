package leetcode.everyday.june;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author 潘勇
 * @date 2020/6/06 9:15
 * 128. 最长连续序列
 * 给定一个未排序的整数数组，找出最长连续序列的长度。
 * 要求算法的时间复杂度为 O(n)。
 * 示例:
 * 输入: [100, 4, 200, 1, 3, 2]
 * 输出: 4
 * 解释: 最长连续序列是 [1, 2, 3, 4]。它的长度为 4。
 */
public class Solution0606 {
    /**
     * 方法1:
     * 一旦有比自己大的->存在x-1则跳过
     * 有比自己小的则一直往下找
     */
    public int longestConsecutive1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int longest = 1;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curNum = num;
                int curCount = 1;
                while (set.contains(curNum + 1)) {
                    curNum += 1;
                    curCount += 1;
                }
                longest = Math.max(curCount, longest);
            }
        }
        return longest;
    }

    /**
     * 方法2:转为有序子序列
     */
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int curCount=1;
        int longest = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] + 1 == nums[i]) {
                curCount++;
            } else if (nums[i - 1] == nums[i]) {
                continue;
            } else {
                curCount = 1;
            }
            longest = Math.max(curCount, longest);
        }
        return longest;
    }

}
