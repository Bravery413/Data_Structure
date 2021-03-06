package leetcode.hash;

import java.util.HashSet;

/**
 * @author bravery
 * @date 2019/8/21 14:17
 */
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        if (set.size() < nums.length) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Thread t = new Thread() {
            public void run() {
                print();
            }
        };
        t.run();
        System.out.print("MT");
    }

    static void print() {
        System.out.print("DP");
    }
}
