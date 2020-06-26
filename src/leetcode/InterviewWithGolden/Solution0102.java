package leetcode.InterviewWithGolden;

/**
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 * 说明：(一样是位图法,只是和上个区别是不是判断存不存在,需要判断个数)
 * 0 <= len(s1) <= 100
 * 0 <= len(s2) <= 100
 */
public class Solution0102 {
    public static boolean CheckPermutation(String s1, String s2) {
        int[] bucket = new int[128];
        for (char c : s1.toCharArray()) {
            bucket[c] += 1;
        }
        for (char c : s2.toCharArray()) {
            if (bucket[c] < 1) return false;
            bucket[c] -= 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bad";
        System.out.println(CheckPermutation(s1, s2));
    }
}
