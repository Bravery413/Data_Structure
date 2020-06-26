package leetcode.everyday.june;

import java.util.Arrays;

/**
 * @author 潘勇
 * @date 2020/6/26 10:29
 * 16. 最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，
 * 使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * 示例：
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 * 提示：
 * 3 <= nums.length <= 10^3
 * -10^3 <= nums[i] <= 10^3
 * -10^4 <= target <= 10^4
 */


public class Solution0624 {
    /**
     * 手写:
     * 1.先排序,
     * 2.双指针
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left,right;
        int dis = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            right = nums.length - 1;
            left = i + 1;
            while (left < right) {
                int cur = val + nums[left] + nums[right];
                int curDis =  Math.abs(target - cur);
                if (dis >curDis) {
                    dis = curDis;
                    res = cur;
                }
                if (cur == target) {
                    return res;
                } else if (cur < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] qus = {1,2,4,8,16,32,64,128};
        System.out.println(threeSumClosest(qus, 82));
    }
}
