package leetcode.everyday.year2020.may;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *示例
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 *
 */
public class Solution0529 {
    /**
     * 分析方法,动态规划,用一个数组保存之前结果,选取最优
     * 可发现只需要最近两个,可以舍弃数组,用两个变量代替
     * @param nums
     * @return
     */
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int first = nums[0];
        int second = Math.max(nums[1], nums[0]);
        int temp;
        for (int i = 2; i < len; i++) {
            temp = second;
            second = Math.max(nums[i] + first, second);
            first = temp;
        }
        return second;
    }

    public static void main(String[] args) {
        int[] qus = {2, 1, 1, 2};
        System.out.println(rob(qus));
    }
}
