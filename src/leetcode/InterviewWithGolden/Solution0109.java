package leetcode.InterviewWithGolden;

/**
 * 字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成
 * （比如，waterbottle是erbottlewat旋转后的字符串）。
 */
public class Solution0109 {
    /**
     * 巧解:在字符串长度相等的前提下,
     * 只要两个串起来,保证含有旋转过的,即使可以的
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isFlipedString(String s1, String s2) {
        return s1.equals(s2) || (s1.length() == s2.length() && (s1 + s1).contains(s2));
    }

}
