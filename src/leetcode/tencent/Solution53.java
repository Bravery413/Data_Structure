package leetcode.tencent;

/**
 * @author: Bravery
 * @create: 2019-09-14 08:58
 **/


public class Solution53 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int n : nums) {
            if (sum >= 0) {
                sum += n;
            } else {
                sum = n;
            }
            res = Math.max(res, sum);
        }
        return res;
    }

}
