package leetcode.hash;

import java.util.HashSet;

/**
 * @author bravery
 * @date 2019/8/21 14:32
 */
public class Solution349 {
    public int[] intersection0(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> resSet = new HashSet<>();
        for (int n : nums1) {
            if (!set1.contains(n)) {
                set1.add(n);
            }
        }
        for (int n : nums2) {
            if (!set2.contains(n)) {
                set2.add(n);
            }
        }
        for (int n : nums1) {
            if (set2.contains(n) && set1.contains(n)) {
                resSet.add(n);
            }
        }
        for (int n : nums2) {
            if (set2.contains(n) && set1.contains(n)) {
                resSet.add(n);
            }
        }
        int size = resSet.size();
        int[] res=new int[size];
        int i=0;
        for (int r:resSet){
            res[i]=r;
            i++;
        }
        return res;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
                set1.add(n);
        }
        for (int n : nums2) {
                set2.add(n);
        }
        set1.retainAll(set2);
        int[] res=new int[set1.size()];
        int i=0;
        for (int r:set1){
            res[i]=r;
            i++;
        }
        return res;
    }
}
