package leetCode;


import java.util.regex.Pattern;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 */


class Solution35 {
    //自己的解法
//    public static int searchInsert(int[] nums, int target) {
//        int i = 0;
//        while (nums[i] < target) {
//            i++;
//            if (i==nums.length){
//                break;
//            }
//        }
//        return i;
//    }
    //抓住顺序表特点,使用二分查找
    public static int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int low, high, mid = 0;
        low = 1;
        high = length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid;
            } else {
                return mid - 1;
            }
        }
        return mid + 1;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int result = searchInsert(nums, 2);
        System.out.println(result);
    }
/**
 * 总结
 *
 *
 */
}
