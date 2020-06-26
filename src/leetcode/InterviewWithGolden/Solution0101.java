package leetcode.InterviewWithGolden;

/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 * 限制：(提示使用位图法)
 * 0 <= len(s) <= 100
 * 如果你不使用额外的数据结构，会很加分。
 */
public class Solution0101 {
    public static boolean isUnique(String astr) {
        int[] bitMap = new int[128];
        for (char c : astr.toCharArray()) {
            if (bitMap[c] > 0) {
                return false;
            } else {
                bitMap[c] = 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("abc"));
    }
}
