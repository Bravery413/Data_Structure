package leetcode.everyday.july;

/**
 * @author: Bravery
 * @create: 2020-07-31 23:30
 **/


public class Solution0731 {
    public int findMagicIndex(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==i){
                return i;
            }
        }
        return -1;
    }
}
