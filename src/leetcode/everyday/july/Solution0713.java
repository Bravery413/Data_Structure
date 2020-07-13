package leetcode.everyday.july;

import java.util.*;

/**
 * @author: Bravery
 * @create: 2020-07-13 22:10
 * 350. 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 * 示例 2:
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 *  
 *
 * 说明：
 *
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶：
 *
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 *
 **/


public class Solution0713 {
    /**
     * 使用HashMap 记录长的数组出现的数及其次数
     * 遍历短的,找对应,如果找到,hashMap的值-1
     * 这里的ArrayList可以使用index和 Arrays.copyOfRange(res, 0, index) 代替
     * 并且这里使用短的去做HashMap会优化效率
     * <p>
     * 还可以使用排序+双指针解决
     * 排序,相等则记录,两个指针都往后移动
     * 如果不相等,移动比较小的那个指针,得出答案
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect0(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] longer = nums1.length >= nums2.length ? nums1 : nums2;
        int[] shorter = nums1.length < nums2.length ? nums1 : nums2;
        for (int n : shorter) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int n : longer) {
            if (map.containsKey(n)) {
                res.add(n);
                Integer count = map.get(n);
                if (count > 1) {
                    map.put(n, count - 1);
                } else {
                    map.remove(n);
                }
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }


    /**
     * 1ms的做法
     */
    private static final int MAGIC = 1000;

    public static int[] intersect(int[] nums1, int[] nums2) {
        int j = 0;
        int freq[] = new int[MAGIC];
        for (int i = 0; i < nums1.length; i++) {
            freq[Math.abs(nums1[i] % MAGIC)]++;
        }

        int res[] = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            if (freq[Math.abs(nums2[i] % MAGIC)]-- > 0) {
                res[j++] = nums2[i];
            }
        }
        return Arrays.copyOf(res, j);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersect = intersect(nums1, nums2);
        System.out.println(Arrays.toString(intersect));
    }
}
