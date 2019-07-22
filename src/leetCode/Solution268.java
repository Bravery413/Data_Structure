package leetCode;

/**
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * 示例 1:
 * 输入: [3,0,1]
 * 输出: 2
 *
 * 示例 2:
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 */
public class Solution268 {
    //利用结构,缺失的就是全部加起来不够的那个数
    public static int missingNumber(int[] nums) {
        int lenght=nums.length;
        int sum=(lenght*lenght+lenght)/2;
        int array_sum=0;
        for (int i:nums) {
            array_sum+=i;
        }
        int result=sum-array_sum;
        return result;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{3,0,1};
        int result = missingNumber(nums);
        System.out.println(result);
    }
}
