package leetcode.ArrayAndString;

/**
 * @author bravery
 * @date 2019/8/30 9:14
 */
public class Solution209 {
    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int res = Integer.MAX_VALUE;
        for (int i = 0, left = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                res = Math.min(res, i - left + 1);
                sum -= nums[left++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
