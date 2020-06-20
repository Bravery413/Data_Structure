package leetCode.everyDayOneQuestion.june;

/**
 * 正则表达式匹配
 */
public class Solution0620 {
    /**
     * 最后来个归纳：
     * 如果 p.charAt(j) == s.charAt(i) : dp[i][j] = dp[i-1][j-1]；
     * 如果 p.charAt(j) == '.' : dp[i][j] = dp[i-1][j-1]；
     * 如果 p.charAt(j) == '*'：
     * 如果 p.charAt(j-1) != s.charAt(i) : dp[i][j] = dp[i][j-2] //in this case, a* only counts as empty
     * 如果 p.charAt(i-1) == s.charAt(i) or p.charAt(i-1) == '.'：
     * dp[i][j] = dp[i-1][j] //in this case, a* counts as multiple a
     * or dp[i][j] = dp[i][j-1] // in this case, a* counts as single a
     * or dp[i][j] = dp[i][j-2] // in this case, a* counts as empty
     */
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] f = new boolean[m + 1][n + 1];
        f[0][0] = true;
        for (int i = 0; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (p.charAt(j - 1) == '*') {
                    f[i][j] = f[i][j - 2];
                    if (matches(s, p, i, j - 1)) {
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                }
                else {
                    if (matches(s, p, i, j)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
            }
        }
        return f[m][n];
    }

    public boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}
