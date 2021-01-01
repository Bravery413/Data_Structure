package leetcode.everyday.year2020.july;

/**
 * @author 潘勇
 * @date 2020/7/20 22:10
 */


public class Solution0720 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left<right){
            if (numbers[left]+numbers[right]==target){
                res[0]=left;
                res[1]=right;
                return res;
            } else if (numbers[left]+numbers[right]>target) {
                right--;
            }else {
                left--;
            }
        }
        return res;
    }
}
