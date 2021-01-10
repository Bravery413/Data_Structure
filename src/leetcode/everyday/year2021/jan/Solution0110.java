package leetcode.everyday.year2021.jan;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Bravery
 * @create: 2021-01-10 10:14
 **/


public class Solution0110 {

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Integer left = 0, right = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 == nums[i]) {
                right++;
            } else {
                if (left == right) {
                    res.add(String.valueOf(nums[left]));
                } else {
                    res.add((nums[left]) + "->" + (nums[right]));
                }
                left = i;
                right = i;

            }
        }
        if (left == right) {
            res.add(String.valueOf(nums[left]));
        } else {
            res.add((nums[left]) + "->" + (nums[right]));
        }
        return res;

    }


}
