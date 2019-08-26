package leetCode.binarySearch;

import java.util.HashMap;

/**
 * @author bravery
 * @date 2019/8/26 9:42
 */
public class Solution167 {
    //指针对撞
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while (true){
            int sum=numbers[left]+numbers[right];
            if (sum==target){
                return new int[]{++left,++right};
            }else if (sum>target){
                right--;
            }else {
                left++;
            }
        }
    }
}
