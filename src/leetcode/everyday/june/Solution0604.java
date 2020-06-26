package leetcode.everyday.june;

import java.util.Arrays;

/**
 * @author 潘勇
 * @date 2020/6/04 9:15
 * 238. 除自身以外数组的乘积
 * 给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，
 * 其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 * 示例:
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 * 提示：题目数据保证数组之中任意元素的全部前缀元素和后缀（甚至是整个数组）的乘积都在 32 位整数范围内。
 * 说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。
 * 进阶：
 * 你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。）
 *
 */
public class Solution0604 {
    /**
     * 总的解法:前缀*后缀等于当前值
     * 1.前缀,后缀数组算出来,然后每个位置相乘得到答案
     * 2.前缀数组直接用answer数组节省
     * 3.后缀数组用一个变量代替
     */
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] pre = new int[len];
        pre[0] = 1;
        for (int i = 1; i < len; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        int last = 1;
        for (int i = len - 2; i >= 0; i--) {
            last *= nums[i + 1];
            pre[i] *= last;
        }
        return pre;
    }

    public static void main(String[] args) {
        int[] qus = {2, 4, 1, 3, 5};
        int[] res = productExceptSelf(qus);
        System.out.println(Arrays.toString(res));
    }
}
