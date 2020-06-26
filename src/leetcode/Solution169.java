package leetcode;

import java.util.Arrays;

/**
 * 给定一个大小为 n 的数组，找到其中的众数。
 * 众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 */
public class Solution169 {
    //自己的做法,把每个数都统计了出现次数,效率很低
    //唯一的优化是把当前众数不做遍历
    public static int majorityElement(int[] nums) {
        int times=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==max){
                continue;
            }
            int temp=0;
            for (int j = 0; j < nums.length; j++) {

                if (nums[i]==nums[j]){
                    temp++;
                }
            }
            if (times<temp){
                times=temp;
                max=nums[i];
            }
        }
        return max;
    }
    public static int majorityElement0(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    //如果我们把众数记为 +1+1 ，把其他数记为 -1−1 ，将它们全部加起来，显然和大于 0 ，从结果本身我们可以看出众数比其他数多。
    public static int majorityElement3(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{8,8,7,7,7};
        System.out.println(majorityElement(nums));

    }
    /**
     *总结:
     * 看清楚条件,有时候条件是限制,有时候是优势
     * 因为众数定义为超过数组长度一半以上,可以排序完再选中间的那个一定是众数
     */
}
