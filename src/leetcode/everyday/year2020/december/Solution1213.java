package leetcode.everyday.year2020.december;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author: Bravery
 * @create: 2020-12-13 18:53
 **/

/**
 * 217. 存在重复元素
 * 1.hash
 * 2.排序
 */
public class Solution1213 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }
    public static boolean containsDuplicate0(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if (nums[i-1]==nums[i]){
                return true;
            }
        }
        return false;
    }
}
