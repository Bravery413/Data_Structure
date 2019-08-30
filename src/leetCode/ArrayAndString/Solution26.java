package leetCode.ArrayAndString;

/**
 * @author bravery
 * @date 2019/8/30 11:14
 */
public class Solution26 {
    //TODO 要去弄懂
    public int removeDuplicates(int[] nums) {
        if (nums.length==0)
            return 0;
        int i=0;
        for (int j=1;j<nums.length;j++){
            if (nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

}
