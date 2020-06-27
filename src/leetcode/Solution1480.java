package leetcode;

/**
 * @author 潘勇
 * @date 2020/6/27 9:59
 * 1480. 一维数组的动态和
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 * 请返回 nums 的动态和。
 * 示例 1:
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,6,10]
 * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。

 */


public class Solution1480 {
    /**
     *拿一个变量保存之前结果 easy
     */
    public int[] runningSum(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += sum;
            sum = nums[i];
        }
        return nums;
    }
}
