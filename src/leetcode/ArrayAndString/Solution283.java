package leetcode.ArrayAndString;

/**
 * @author bravery
 * @date 2019/8/30 11:41
 */
public class Solution283 {
    //TODO 去看 状态不好就别写了
    //一个指针用来遍历数组，一个指针用来指向0元素（或跟随遍历指针）。
    // 遇到非0元素则交换，最终会将所有非0元素交换到最前，而0元素在最后。
    public static void moveZeroes(int[] nums) {
        int k = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != 0){
                swapArrays(nums,i,k++);
            }
        }
    }
    private static void swapArrays(int[] nums,int first,int second){
        if(first == second){
            return;
        }
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    //这样也可以
    public void moveZeroes0(int[] nums) {
        //i:插入位置下标 ; j:查找位置下标
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        //将后面的位置补0
        for(int p = i; p < nums.length; p++){
            nums[p] = 0;
        }
    }


    public static void main(String[] args) {
        int[] a={1,2,3,0,4};
        moveZeroes(a);
    }
}
