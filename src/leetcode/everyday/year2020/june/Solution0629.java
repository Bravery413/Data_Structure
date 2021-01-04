package leetcode.everyday.year2020.june;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author: Bravery
 * @create: 2020-07-12 22:45
 * 215. 数组中的第K个最大元素
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * 示例 1:
 *
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 示例 2:
 *
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * 说明:
 *
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 *
 * 通过次数167,280提交次数259,650
 *
 **/


public class Solution0629 {
    /**
     * 直接排序可以解决问题
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest0(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    /**
     * 我们可以使用最小堆来解决，一个个遍历原数组的值，添加到堆中，
     * 如果堆中元素的个数小于等于k的时候，我们就往堆中添加，
     * 添加之后如果堆中元素个数大于k的时候，
     * 我们就把最顶端的元素给移除掉，因为是最小堆，所以移除的就是堆中最小的值
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue();
        for (int n : nums) {
            queue.add(n);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }


}
