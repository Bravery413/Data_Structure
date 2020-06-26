package leetcode.everyday.march;

/**
 * 面试题 17.16. 按摩师
 * 同打家劫舍,动态规划
 */
public class Solution0324 {
    public static int massage(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int last = nums[0];
        int pre = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int count = last + nums[i];
            last = pre;
            if (count > pre) {
                pre = count;
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(massage(nums));
    }
}
