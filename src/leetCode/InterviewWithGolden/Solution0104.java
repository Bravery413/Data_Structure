package leetCode.InterviewWithGolden;

/**
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 *
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 *
 * 回文串不一定是字典当中的单词。
 *
 */
public class Solution0104 {
    /**
     * 考虑到能回文是单数的不超过1,剩下全是双数
     * @param s
     * @return
     */
    public static boolean canPermutePalindrome(String s) {
        int[] bucket = new int[128];
        for (char c : s.toCharArray()) {
            bucket[c]++;
        }
        int times = 0;
        for (int i : bucket) {
            if (i % 2 == 1) times++;
        }
        return times >= 2 ? false : true;
    }

    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("tactcoa"));
    }
}
