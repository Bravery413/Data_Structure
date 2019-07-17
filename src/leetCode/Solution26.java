package leetCode;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4]
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 */
class Solution26 {
    //使用hashset使数组去重
    public static int removeDuplicates0(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            nums[i] = 0;
        }
        Iterator<Integer> it = set.iterator();
        int j = 0;
        while (it.hasNext()) {
            Integer next = it.next();
            nums[j] = next;
            j++;
        }
        return nums.length;
    }

    //官方解法
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    /**
     * 总结
     * 时间复杂度O(n),没有占用其他空间
     * 快指针和慢指针的使用
     * 新的思路
     */
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 3, 3, 5, 7};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }
}
