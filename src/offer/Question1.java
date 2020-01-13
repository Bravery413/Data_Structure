package offer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Question1 {

    /**
     * 哈希表
     *
     * @param array
     * @return
     */
    public static int MoreThanHalfNum_Solution0(int[] array) {
        if (array.length == 1) {
            return 1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : array) {
            if (map.containsKey(n)) {
                Integer count = map.get(n);
                count = ++count;
                if (count > array.length / 2) {
                    return n;
                }
                map.put(n, count);
            } else {
                map.put(n, 1);
            }
        }
        return 0;
    }

    /**
     * 排序
     *
     * @param args
     */
    public static int MoreThanHalfNum_Solution1(int[] array) {
        if (array.length == 1) {
            return 1;
        }
        Arrays.sort(array);
        int target = array[array.length / 2];
        int count = 0;
        for (int n : array) {
            if (target == n) {
                count++;
            }
        }
        if (count >= array.length / 2) {
            return target;
        }
        return 0;
    }

    /**
     * 基于partition函数 O(n)
     *
     * @param array
     * @return
     */
    public static int MoreThanHalfNum_Solution(int[] array) {
        int len = array.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return array[0];
        }
        int begin = 0;
        int end = len - 1;
        int index = partition(array, begin, end);
        while (index != array.length / 2) {
            if (index < len / 2) {
                begin = index + 1;
                index = partition(array, begin + 1, end);
            } else {
                end = index - 1;
                index = partition(array, begin, end);
            }
        }
        int count = 0;
        int key = array[index];
        for (int i = 0; i < len; i++) {
            if (array[i] == key) {
                ++count;
            }
        }
        if (count > len / 2) {
            return key;
        }
        return 0;
    }

    public static int partition(int[] array, int begin, int end) {
        if (begin >= end) {
            return begin;
        }
        int key = array[begin];
        while (begin < end) {
            while (begin < end && array[end] >= key) {
                end--;
            }
            array[begin] = array[end];
            while (begin < end && array[begin] <= key) {
                ++begin;
            }
            array[end] = array[begin];
        }
        array[begin] = key;
        return begin;

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        int result = MoreThanHalfNum_Solution(array);
        System.out.println(result);
    }


}
