package leetcode.everyday.year2020.june;

/**
 * @author 潘勇
 * @date 2020/6/28 14:30
 * 209. 长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组，
 * 并返回其长度。如果不存在符合条件的连续子数组，返回 0。
 * 示例: 
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 * 进阶:
 * 如果你已经完成了O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 */


public class Solution0628 {
    /**
     * 使用双指针:
     * 1.一旦大于等于,则判断赋值minLen,并且让last++
     * 2.如果不够,pre++
     * 感觉代码不够优雅,而且应该还有更好的实现方法
     */
    public static int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int minLen = Integer.MAX_VALUE;
        int last = 0, pre = 0;
        int sum = 0;
        boolean flag = true;
        boolean haveAnsFlag = false;
        while (pre < nums.length) {
            if (flag) {
                sum += nums[pre];
            }
            if (sum >= s) {
                minLen = Math.min(minLen, pre - last + 1);
                sum -= nums[last];
                last++;
                flag = false;
                haveAnsFlag = true;
            } else {
                pre++;
                flag = true;
            }
        }
        return haveAnsFlag ? minLen : 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, nums));
    }
}
