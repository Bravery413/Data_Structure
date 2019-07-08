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
     * 为什么不属于交换,因为建堆,把堆顶确认的元素再出手,所以是选择排序
     * 因为树节点的原因,必须根节点是1而不是从0开始 i和2i,2i+1的关系,如果是0就不存在了
     */
    public static int[] heapSort(int[] nums){
        int i;
        int length=nums.length-1;
        for (i=length/2;i>0;i--){
            heapAdjust(nums,i,length);
        }
        int temp;
        //复杂度外层for需要n-1次,内层堆调整是完全二叉树的深度log2^n 最后时间复杂度nlogn
        for (i=length;i>1;i--){
            temp=nums[i];
            nums[i]=nums[1];
            nums[1]=temp;
            heapAdjust(nums,1,i-1);
        }
        return nums;
    }
    /**
     *堆调整
     */
    public static void heapAdjust(int[] nums,int i,int max) {
        int temp, j;
        temp = nums[i];
         for (j = i * 2; j <= max; j *= 2) {
            //从最后节点开始比较出较大的叶子节点下标j
            if (j < max && nums[j] < nums[j + 1]) {
                ++j;
            }
            //如果节点大于叶子,跳出来赋值
            if (temp >= nums[j]) {
                break;
            }
            //否则
            nums[i] = nums[j];
            i = j;
        }
        nums[i] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,50, 10, 90, 30, 70, 40, 80, 60, 20};
        int[] results = heapSort(nums);
        String string = Arrays.toString(results);
        System.out.println(string);
//        int[] nums = new int[]{0, 62, 88, 58, 47, 35, 51, 73, 99, 37, 93};
//        int[] nums = new int[]{0, 5, 3, 4, 6, 2};
    }


}
