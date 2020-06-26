package leetcode.hash;

import java.util.HashSet;

/**
 * @author bravery
 * @date 2019/8/23 9:50
 */
public class Solution219 {
    /**
     * 思路:
     * 标签：哈希
     * 维护一个哈希表，里面始终最多包含 k 个元素，当出现重复值时则说明在 k 距离内存在重复元素
     * 每次遍历一个元素则将其加入哈希表中，如果哈希表的大小大于 k，则移除最前面的数字
     * 时间复杂度：O(n)O(n)，nn 为数组长度
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (set.contains(num)) return true;
            set.add(num);
            if (set.size() >= k) {
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
