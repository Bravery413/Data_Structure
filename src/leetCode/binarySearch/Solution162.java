package leetCode.binarySearch;

/**
 * @author bravery
 * @date 2019/8/26 14:51
 */
public class Solution162 {
    /**
     * 学习思路:
     * 因为没有重复,只需要返回第一个
     * 三种情况:
     * 1 递增 返回最后一个元素
     * 2 递减 返回第一个元素
     * 3 中间 那就找到第i个大于第i+1个就行
     */
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]>nums[i+1]){
                return i;
            }
        }
        return nums.length-1;
    }

    //自己的思路
    public int findPeakElement0(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (i == nums.length - 1 && nums[i] > nums[i - 1]) {
                return i;
            }
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return 0;
    }
}
