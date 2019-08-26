package leetCode.binarySearch;

/**
 * @author bravery
 * @date 2019/8/26 10:00
 */
public class Solution153 {
    public int findMin0(int[] nums) {
        int min=Integer.MAX_VALUE;
       for (int n:nums){
           if (n<min)
               min=n;
       }
        return min;
    }
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0, right = nums.length - 1;
        if (nums[right] > nums[0]) {
            return nums[0];
        }
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }
            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
