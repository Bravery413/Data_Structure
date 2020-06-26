package leetCode.everyDayOneQuestion.june;

import java.util.Arrays;

/**
 * @author 潘勇
 * @date 2020/6/26 10:29
 */


public class Solution0624 {
    /**
     * 手写:
     * 1.先排序,
     * 2.双指针
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left,right;
        int dis = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            right = nums.length - 1;
            left = i + 1;
            while (left < right) {
                int cur = val + nums[left] + nums[right];
                int curDis =  Math.abs(target - cur);
                if (dis >curDis) {
                    dis = curDis;
                    res = cur;
                }
                if (cur == target) {
                    return res;
                } else if (cur < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] qus = {1,2,4,8,16,32,64,128};
        System.out.println(threeSumClosest(qus, 82));
    }
}
