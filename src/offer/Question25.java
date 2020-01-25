package offer;

import java.util.Arrays;

/**
 * 调整数组顺序使奇数位于偶数前面
 */
public class Question25 {
    /**
     * 前后指针不能保证相对顺序不变
     * @param array
     */
    public static void reOrderArray(int[] array) {
        if (array.length == 0 || array == null) {
            return;
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            while (array[left] % 2 != 0) {
                left++;
            }
            while (array[right] % 2 == 0) {
                right--;
            }
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }

}
