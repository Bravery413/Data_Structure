package leetCode.ArrayAndString;

/**
 * @author bravery
 * @date 2019/8/27 14:12
 */
public class Solution724 {
    //只能解出部分
    public int pivotIndex0(int[] nums) {
        if(nums==null||nums.length==0){
            return -1;
        }
        int leftSum = 0, rightSum = 0;
        int left = 0, right = nums.length - 1;
        leftSum += nums[left];
        rightSum += nums[right];
        while (left <= right) {
            //左边重,走右边
            if (leftSum>rightSum){
                right--;
                rightSum+=nums[right];
            //右边重,走左边
            }else if (leftSum<rightSum){
                left++;
                leftSum += nums[left];
            //两头一样重
            }else {
                return nums[left];
            }
        }
        return -1;
    }
    /**
     * sumLeft + sumRight + nums[p] = sumTotal;
     * sumLeft = sumRight
     * 可以得出 sumLeft * 2 + nums[p] = sumTotal;
     */
    public int pivotIndex(int[] nums) {
        if(nums==null||nums.length==0){
            return -1;
        }
        int leftSum = 0;
        int totalSum=0;
        for (int n:nums){
            totalSum+=n;
        }
        for (int i=0;i<nums.length;i++){
            if (leftSum*2+nums[i]==totalSum){
                return i;
            }else {
                leftSum+=nums[i];
            }

        }
        return -1;
    }


}
