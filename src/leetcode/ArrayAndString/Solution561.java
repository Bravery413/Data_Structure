package leetcode.ArrayAndString;

import java.util.Arrays;

/**
 * @author bravery
 * @date 2019/8/30 7:46
 */
public class Solution561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for (int i=0;i<nums.length-1;i+=2){
            res+=nums[i];
        }
        return res;
    }
}
