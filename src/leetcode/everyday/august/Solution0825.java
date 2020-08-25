package leetcode.everyday.august;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Bravery
 * @create: 2020-08-25 18:19
 * 491. 递增子序列
 * 给定一个整型数组, 你的任务是找到所有该数组的递增子序列，递增子序列的长度至少是2。
 * <p>
 * 示例:
 * <p>
 * 输入: [4, 6, 7, 7]
 * 输出: [[4, 6], [4, 7], [4, 6, 7], [4, 6, 7, 7], [6, 7], [6, 7, 7], [7,7], [4,7,7]]
 * 说明:
 * <p>
 * 给定数组的长度不会超过15。
 * 数组中的整数范围是 [-100,100]。
 * 给定数组中可能包含重复数字，相等的数字应该被视为递增的一种情况。
 **/


public class Solution0825 {
    /**
     * 自己写,理解错题意
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> findSubsequences1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (j >= j - 1) {
                    List<Integer> temp = new ArrayList<>();
                    for (int k = i; k <= j; k++) {
                        temp.add(nums[k]);
                    }
                    res.add(temp);
                }
            }
        }
        return res;
    }

    public static List<Integer> temp = new ArrayList<Integer>();
    public static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public static List<List<Integer>> findSubsequences(int[] nums) {
        dfs(0, Integer.MIN_VALUE, nums);
        return ans;
    }

    public static void dfs(int cur, int last, int[] nums) {
        if (cur == nums.length) {
            if (temp.size() >= 2) {
                ans.add(new ArrayList<Integer>(temp));
            }
            return;
        }
        if (nums[cur] >= last) {
            temp.add(nums[cur]);
            dfs(cur + 1, nums[cur], nums);
            temp.remove(temp.size() - 1);
        }
        if (nums[cur] != last) {
            dfs(cur + 1, last, nums);
        }
    }

    public static void main(String[] args) {
        int[] qus = {4, 6, 7, 7};
        System.out.println(findSubsequences(qus));
    }
}
