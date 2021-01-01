package leetcode.everyday.year2020.july;

/**
 * @author: Bravery
 * @create: 2020-07-17 23:05
 **/


public class Solution0717 {
    public static int searchInsert(int[] nums, int target) {
        return searchInsert(nums, target, 0, nums.length);

    }

    public static int searchInsert(int[] nums, int target, int left, int right) {
        if (left >= right) {
           if (nums[left]>target){
               return left;
           }else {
               return left+1;
           }
        }
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
        return searchInsert(nums, target, left, right);
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        System.out.println(searchInsert(nums,2));
    }
}
