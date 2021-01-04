package leetcode.everyday.year2020.december;

/**
 * @author: Bravery
 * @create: 2020-12-13 19:11
 **/


public class Solution1212 {
    public int wiggleMaxLength(int[] nums) {
        int[] dp = new int[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            dp[i - 1] = nums[i] - nums[i - 1];
        }
        boolean flag=dp[0]<0?false:true;
        for (int i = 1; i < dp.length; i++) {
            if ((flag&&dp[i]>0)||(flag==false&&dp[i]<0)){
                continue;
            }else {
                
            }
        }
        return 1;
    }


}
