package leetCode.binarySearch;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author bravery
 * @date 2019/8/26 14:22
 */
public class Solution4 {
    /**
     * 方法一：根据定义，合并、排序以后取中位数（时间复杂度不符合要求）
     * 这应该是最简单直接的做法，即根据定义来做。考虑如下两种情况：
     *
     * 情况 1：如果合并以后的数组的长度是偶数，中位数有 2 个，此时取它们的平均值；
     * 情况 2：如果合并以后的数组的长度是奇数；中位数有 1 个，把这个值返回即可。
     *
     * 说明：这个解法虽然不符合题目要求，但是是常规思路。
     * 并且它的优点也很显著：即在输入数组不是有序数组的时候，
     * 这个算法依然有效，因此如果这一题出现在面试中，向面试官提到这个最简单的思路，
     * 我觉得也是有必要的（一定要把它的这个优点连带说出来）
     *
     * 数组复制API的使用:
     * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
     * 代码解释:
     * 　　Object src : 原数组
     *    int srcPos : 从元数据的起始位置开始
     * 　　Object dest : 目标数组
     * 　　int destPos : 目标数组的开始起始位置
     * 　　int length  : 要copy的数组的长度
     *
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int[] temp=new int[len1+len2];
        System.arraycopy(nums1,0,temp,0,len1);
        System.arraycopy(nums2,0,temp,len1,len2);
        Arrays.sort(temp);

        if ((len1+len2)%2==1){
            return temp[(len1+len2)/2];
        }else {
            return ((double) temp[(len1+len2)/2]+temp[(len1+len2+1)/2])/2;
        }
    }
}
