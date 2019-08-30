package leetCode.ArrayAndString;

/**
 * @author bravery
 * @date 2019/8/30 7:58
 */
public class Solution27 {
    //规律方法:通过  n^2 都超了96%
    public static int removeElement0(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                for (int j = i; j < len - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                len--;
                i--;
            }
        }
        return len;
    }

    public static int removeElement(int[] nums, int val) {
        int i=0;
        for (int j=0;j<nums.length;j++){
            if (nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int i = removeElement(nums, 2);
        System.out.println(i);
    }
}
