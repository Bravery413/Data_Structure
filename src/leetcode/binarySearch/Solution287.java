package leetcode.binarySearch;

/**
 * @author bravery
 * @date 2019/8/26 9:22
 */

/**
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n）
 * 可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 * <p>
 * 解法:
 * 1 Arrays.sort(),然后找相邻坐标
 * 2 set 每次进去前判断key
 * 3 快慢指针 循环检测 单链表是否存在环
 */
public class Solution287 {
    public int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            //这里是关键
            hare = nums[nums[hare]];
        } while (tortoise != hare);
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;
    }
}
