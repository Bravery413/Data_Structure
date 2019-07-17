package leetCode;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
class Solution27 {
    //暴力.时间太长,不能通过
    public static int removeElement0(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                i--;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return nums.length;
    }

    //思路:当遍历到需去除元素时,与最后一个调换位置,并且还需检验调换过来的元素,最后数组长度-1
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 3, 3, 5, 7};
        int[] nums = new int[]{3};
        System.out.println(removeElement(nums, 3));
    }
/**
 * 总结
 * 时间复杂度O(n)
 * 这几个题都很巧妙,
 */
}
