package leetCode.ArrayAndString;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author bravery
 * @date 2019/8/28 7:33
 */
public class Solution747 {
    //找出最大和第二大的数
    public int dominantIndex0(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int i = 0;
        for (int n : nums) {
            if (n>secMax){
                secMax=n;
            }
            if (n > max) {
                secMax = max;
                max = n;
                map.put(max, i);
            }

            i++;
        }
        if (max >= 2 * secMax) {
            return map.get(max);
        } else {
            return -1;
        }
    }

}
