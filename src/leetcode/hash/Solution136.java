package leetcode.hash;

import java.util.HashSet;

/**
 * @author bravery
 * @date 2019/8/21 14:21
 */
public class Solution136 {
    //使用set排空后的性质,时间复杂度n,空间复杂度n
    public int singleNumber0(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum=0;
        for (int n:nums){
            if (!set.contains(n)){
                set.add(n);
            }
            sum+=n;
        }
        int setSum=0;
        for (int s:set){
            setSum+=s;
        }
        return 2*setSum-sum;
    }
    //异或,时间复杂度n 空间复杂度1
    public int singleNumber(int[] nums) {
        int res=0;
        for(int n:nums){
            res=res^n;
        }
        return res;
    }
}
