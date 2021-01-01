package leetcode.everyday.year2020.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 */
public class Solution0612 {
    /**
     * 排序转化为两数之和
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            List<List<Integer>> lists = twoSum(nums, i);
            for (List list : lists) {
                list.add(nums[i]);
                res.add(list);
            }
        }
        return res;
    }

    public static List<List<Integer>> twoSum(int[] nums, int start) {
        int nowNum = nums[start];
        int left = start + 1;
        int right = nums.length - 1;
        List<List<Integer>> res = new ArrayList<>();
        while (left < right) {
            if (nums[left] + nums[right] + nowNum == 0) {
                List<Integer> ans = new ArrayList<>();
                ans.add(nums[left]);
                ans.add(nums[right]);
                res.add(ans);
                //这个地方为了记录下一组情况
                while (left < right && nums[left] == nums[left + 1]) {
                    left++;
                }
                left++;
                while (left < right && nums[right] == nums[right - 1]) {
                    right--;
                }
                right--;
            } else if (nums[left] + nums[right] + nowNum < 0) {
                //总数不够大,移动左边
                left++;
            } else {
                //总数过大,移动右边
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] qus = {-1, 0, 1, 2, -1, -4,};
        System.out.println(threeSum(qus));
    }
}
