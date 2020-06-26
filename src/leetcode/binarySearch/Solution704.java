package leetcode.binarySearch;

/**
 * @author bravery
 * @date 2019/8/23 18:03
 */

/**
 * 最简单的二分查找
 */
public class Solution704 {
    //自己的二分查找 不规范,菜鸡写法
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid;
        for (int i=0;i<nums.length;i++){
            mid=(left+right)/2;
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }

    /**
     *二分规范:
     * 1.判空 防止NPE
     * 2.mid=left+(right-left)/2
     *
     * 区分语法:
     *
     * 初始条件：left = 0, right = length-1
     * 终止：left > right
     * 向左查找：right = mid-1
     * 向右查找：left = mid+1
     */
    int binarySearch(int[] nums, int target){
        if(nums == null || nums.length == 0)
            return -1;

        int left = 0, right = nums.length - 1;
        while(left <= right){
            // Prevent (left + right) overflow
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){ return mid; }
            else if(nums[mid] < target) { left = mid + 1; }
            else { right = mid - 1; }
        }

        // End Condition: left > right
        return -1;
    }
}
