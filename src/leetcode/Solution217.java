package leetcode;

import java.util.HashSet;

public class Solution217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> se = new HashSet<>();
        for (Integer i : nums) {
            if (se.contains(i))
                return true;
            se.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

}
