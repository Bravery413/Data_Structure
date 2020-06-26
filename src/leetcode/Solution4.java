package leetcode;

import java.util.ArrayList;

public class Solution4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        int len = nums1.length < nums2.length ? nums1.length : nums2.length;
        for (int i = 0; i < len; ) {
            for (int j = 0; j < len; j++) {
                if (nums1[i] > nums2[j]) {
                    result.add(nums2[j]);
                    result.add(nums1[i]);
                } else {
                    result.add(nums1[i]);
                    result.add(nums2[j]);
                }
                i++;
            }
        }
        if (nums1.length > nums2.length) {
            for (int i = nums2.length; i < nums1.length; i++) {
                result.add(nums1[i]);
            }
        } else {
            for (int i = nums1.length; i < nums2.length; i++) {
                result.add(nums2[i]);
            }
        }
        System.out.println(result.toString());
        double res=0;
        int size = result.size();
        if (size%2!=0){
            res=result.get(size/2);
        }else {
            res=(result.get(size/2)+result.get(size/2-1))/2;
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] nums1 = new int[]{1, 5, 9, 13};
//        int[] nums2 = new int[]{2, 4, 7, 18,22};
        int[] nums1 = new int[]{1, 5};
        int[] nums2 = new int[]{2, 4, 7, 18,22};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
