package leetcode;

import java.util.HashMap;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */
public class Solution136 {
    // 1. 暴力,略

    // 2. 利用hash
    public static int singleNumber1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer count ;
        for (Integer i : nums) {
            count=map.get(i);
            count = count == null ? 1 : ++count;
            map.put(i, count);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key)==1){
                return key;
            }
        }
        return -1;
    }
    // 3. 异或,时间空间复杂度最低.
    //一个数被同一个数异或两次回到原来的数
    public static int singleNumber(int[] nums) {
        int res=0;
        for (int num:nums){
            res^=num;
            System.out.println(res);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));

    }
    /**
     * 总结:
     * 1. hash思路
     * 2. hash遍历操作
     * 3. Integer可以null int不行
     * 4. ++count和count++
     * 异或:相异得1,相同得0
     * 5. 异或操作^和异或原理:一个数被同一个数异或两次回到原来的数
     */
}
