package leetcode.ArrayAndString;

/**
 * @author bravery
 * @date 2019/8/30 8:44
 */
public class Solution485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int temp=0;
        for (int i=0,j=-1;i<nums.length;i++){
            if (nums[i]==1){
               temp++;
            }else {
                res=temp>res ? temp:res;
               temp=0;
            }
        }
        return res=temp>res ? temp:res;
    }

    public static void main(String[] args) {
        int[] a={0,1,0,1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(a);
        System.out.println(maxConsecutiveOnes);
    }
}
