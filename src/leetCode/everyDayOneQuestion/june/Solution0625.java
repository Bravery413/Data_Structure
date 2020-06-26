package leetCode.everyDayOneQuestion.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author 潘勇
 * @date 2020/6/26 9:44
 */


public class Solution0625 {
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
     * @param s
     * @param wordDict
     * @return
     */
    public static boolean wordBreak1(String s, List<String> wordDict) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        boolean res = wordBreak(s, 0, wordDict, memo);
        return res;
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
