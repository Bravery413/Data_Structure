package leetcode.everyday.year2020.otb;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author: Bravery
 * @create: 2020-10-10 17:12
 **/


public class Solution1 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4},6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])&&i!=map.get(nums[i])) {
                return new int[]{i, map.get(nums[i])};
            }
        }
        return null;
    }
}
