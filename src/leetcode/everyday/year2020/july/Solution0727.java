package leetcode.everyday.year2020.july;

/**
 * @author: Bravery
 * @create: 2020-07-28 21:02
 * 392. 判断子序列
 * 392. 判断子序列
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 *
 * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
 *
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 *
 * 示例 1:
 * s = "abc", t = "ahbgdc"
 *
 * 返回 true.
 *
 * 示例 2:
 * s = "axc", t = "ahbgdc"
 *
 * 返回 false.
 *
 * 后续挑战 :
 *
 * 如果有大量输入的 S，称作S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
 **/


public class Solution0727 {
    public static boolean isSubsequence(String s, String t) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int index1 = 0;
        int index2 = 0;
        while (index2 < t.length()) {
            if (s.charAt(index1) == t.charAt(index2)) {
                index1++;
                if (index1 >= s.length()) {
                    return true;
                }
            }
            index2++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="acb";
        String t="ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
