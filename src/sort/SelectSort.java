package sort;


import java.util.Arrays;

public class SelectSort {
    /**
     * 简单选择排序
     */
    public static int[] easySelectSort(int[] nums) {
        int length = nums.length;
        int min, temp;
        for (int i = 1; i < length; i++) {
            min = i;
            for (int j = i + 1; j < length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
    /**
     * 堆排序
     */
    //TODO




    public static void main(String[] args) {
//        int[] nums = new int[]{0, 62, 88, 58, 47, 35, 51, 73, 99, 37, 93};
        int[] nums = new int[]{0, 5, 3, 4, 6, 2};
        int[] result = easySelectSort(nums);
        String string = Arrays.toString(result);
        System.out.println(string);
    }


}
