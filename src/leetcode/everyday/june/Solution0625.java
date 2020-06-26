package leetcode.everyday.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author 潘勇
 * @date 2020/6/26 9:44
 * 139. 单词拆分
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 * 说明：
 * 拆分时可以重复使用字典中的单词。
 * 你可以假设字典中没有重复的单词。
 * 示例 1：
 * 输入: s = "leetcode", wordDict = ["leet", "code"]
 * 输出: true
 * 解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
 * 示例 2：
 * 输入: s = "applepenapple", wordDict = ["apple", "pen"]
 * 输出: true
 * 解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
 *      注意你可以重复使用字典中的单词。
 * 示例 3：
 * 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出: false
 */
public class Solution0625 {
    /**
     * 动态规划: 每个操作保存子过程结果供后面使用
     * 步骤:
     * 1.第一层遍历取全部
     * 2.第二层查有无,有则dp[i]置true
     * 注: dp长度+1,并且dp[0]置true 比如1.flag字典刚好完整的flag2.每次判断第一个字符都需要dp[0]
     * @param s 待拆分字符
     * @param wordDict 单词字典
     * @return 是否可完整拆分
     */
    public static boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> dictSet = new HashSet<>(wordDict);
        //动态规划核心,保留每个子过程的结果,供后面使用
        boolean[] dp = new boolean[s.length() + 1];
        //让第一位默认true
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                //判断当前位必须是true,再做判断
                if (dp[j] && dictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    /**
     * 效率最高,未理解
     *
     * @param s 待拆分字符
     * @param wordDict 单词字典
     * @return 是否可完整拆分
     */
    public static boolean wordBreak1(String s, List<String> wordDict) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return wordBreak(s, 0, wordDict, memo);
    }

    private static boolean wordBreak(String s, int idx, List<String> wordDict, int[] memo) {
        if (idx >= s.length()) {
            return true;
        }
        if (memo[idx] >= 0) {
            return memo[idx] == 1;
        }
        for (int i = 0; i < wordDict.size(); ++i) {
            String w = wordDict.get(i);
            if (equals(s, idx, w) && wordBreak(s, idx + w.length(), wordDict, memo)) {
                memo[idx] = 1;
                return true;
            }
        }

        memo[idx] = 0;
        return false;
    }

    private static boolean equals(String s, int idx, String w) {
        for (int i = 0; i < w.length(); ++i) {
            if (idx + i >= s.length() || s.charAt(idx + i) != w.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>();
        wordDict.add("Leet");
        wordDict.add("Code");
        String abc = "LeetCode";
        System.out.println(wordBreak1(abc, wordDict));
    }
}
