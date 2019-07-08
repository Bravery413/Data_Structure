package sort;

import org.omg.CORBA.INTERNAL;

import java.util.Arrays;

public class ExchangeSort {
    /**
     * 交换函数
     */
    public static void swap(SwapWrapper swapWrapper) {
        int temp = swapWrapper.a;
        swapWrapper.a = swapWrapper.b;
        swapWrapper.b = temp;
    }

    /**
     * 简单交换排序
     */
    public static int[] easyExchangeSort(int[] nums) {
        int length = nums.length;
        int temp;
        for (int i = 1; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }

    /**
     * 冒泡排序
     *
     * @param nums
     */
    public static int[] bubbleSort(int[] nums) {
        int length = nums.length;
        int temp;
        for (int i = 1; i < length; i++) {
            for (int j = length - 2; j >= i; j--) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    /**
     * 优化冒泡排序
     * 增加排序完成标志flag
     */
    public static int[] bubbleSort2(int[] nums) {
        int length = nums.length;
        int temp;
        boolean flag=true;
        for (int i = 1; i < length&&flag; i++) {
            for (int j = length - 2; j >= i; j--) {
                flag=false;
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag=true;

                }
            }
        }
        return nums;
    }


    public static void main(String[] args) {
//        int[] nums = new int[]{0,1,8,3,};
//        int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums = new int[]{0, 62, 88, 58, 47, 35, 51, 73, 99, 37, 93};
        int[] result = bubbleSort2(nums);
        String string = Arrays.toString(result);
        System.out.println(string);


//        SwapWrapper swapWrapper = new SwapWrapper();
//        swapWrapper.a=3;
//        swapWrapper.b=1;
//        swap(swapWrapper);
//        System.out.println("a:"+swapWrapper.a+"  b:"+swapWrapper.b);


    }

}