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
     * 直接插入排序
     */
    public static int[] straightInsertSort(int[] nums) {
        int length = nums.length;
        int i, j;
        for (i = 2; i < length; i++) {
            if (nums[i] < nums[i - 1]) {
                nums[0] = nums[i];//设置哨兵,保存变量
                //在有序表中查找该元素应该插入的位置
                for (j = i - 1; nums[j] > nums[0]; j--) {
                    nums[j + 1] = nums[j];//记录后移
                }
                nums[j + 1] = nums[0];
            }

        }

        return nums;
    }

    /**
     * 优化插入排序,在有序表那边使用折半查找插入位置
     */
    public static int[] easySelectSort2(int[] nums) {
        int length = nums.length;
        int i, j;
        for (i = 2; i < length; i++) {
            if (nums[i] < nums[i - 1]) {
                nums[0] = nums[i];//设置哨兵,保存变量
                //在有序表中查找该元素应该插入的位置
                //TODO 修改这个条件,折半查找;
                for (j = i - 1; nums[j] > nums[0]; j--) {
                    nums[j + 1] = nums[j];//记录后移
                }
                nums[j + 1] = nums[0];
            }

        }
        return nums;
    }


    public static void main(String[] args) {
//        int[] nums = new int[]{0, 62, 88, 58, 47, 35, 51, 73, 99, 37, 93};
        int[] nums = new int[]{0, 5, 3, 4, 6, 2};
        int[] result = straightInsertSort(nums);
        String string = Arrays.toString(result);
        System.out.println(string);
    }


}
