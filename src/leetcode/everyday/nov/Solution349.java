package leetcode.everyday.nov;

import java.util.HashSet;

/**
 * @author: Bravery
 * @create: 2020-11-02 20:35
 **/


public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        for (int n : nums1) {
            s1.add(n);
        }
        HashSet<Integer> s2 = new HashSet<Integer>();
        for (int n : nums2) {
            if (s1.contains(n)) {
                s2.add(n);
            }
        }
        int[] res=new int[s2.size()];
        int i=0;
        for (int r:s2){
            res[i]=r;
            i++;
        }
        return res;
    }
}
