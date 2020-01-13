package leetCode.LinkNode;

import org.omg.PortableInterceptor.INACTIVE;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * @author: Bravery
 * @create: 2019-09-21 15:26
 **/


public class Main {
    public static int count = 0;

//    public static void kSum(List<Integer> numbers, int target) {
//        throw Throwable();
//
//    }
    public static int combinationSum4(int[] nums, int target) {

        int[]dp=new int[target+1];
        dp[0]=1;
        for(int i=1;i<=target;i++)
        {
            for(int num:nums)
            {
                if(i>=num)
                {
                    dp[i]+=dp[i-num];
                }
            }
        }
        return dp[target];
    }


//    public static void main(String[] args) {
//       Long[] data={1L,2L,3L,4l,5l,6l,7l,8l,9l,10l};
//       Long[] result=new Long[data.length-5];
//       for ()
//
//    }
}
