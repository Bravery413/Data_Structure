package leetcode;

import java.util.HashMap;
import java.util.Set;

/**
 * 在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。
 *
 * 给你一个整数数组 arr，请你从中找出并返回一个幸运数。
 *
 * 如果数组中存在多个幸运数，只需返回 最大 的那个。
 * 如果数组中不含幸运数，则返回 -1 。
 *
 * 提示：(范围-->暗示位图法)
 * 1 <= arr.length <= 500
 * 1 <= arr[i] <= 500
 */
public class Solution1394 {
    /**
     * 用hashMap解决
     *
     * @param arr
     * @return
     */
    public static int findLucky0(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int res = 0;
        Set<Integer> integers = map.keySet();
        for (Integer key : integers) {
            if (map.get(key).equals(key) && key > res) {
                res = key;
            }
        }
        return res == 0 ? -1 : res;
    }

    /**
     * 位图法
     *
     * @param arr
     * @return
     */
    public static int findLucky(int[] arr) {
        int[] bitMap = new int[501];
        for (int i : arr) {
            bitMap[i]++;
        }
        for (int i = bitMap.length - 1; i > 0; i--) {
            if (bitMap[i] == i) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 3};
        System.out.println(findLucky(arr));
    }
}
