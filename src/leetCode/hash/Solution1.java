package leetCode.hash;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author: Bravery
 * @create: 2019-08-22 20:16
 **/


public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            int n=target-nums[i];
            if (map.containsKey(n)&&map.get(n)!=i){
                return new int[]{i,map.get(n)};
            }
        }
        return new int[]{0};
    }
}
