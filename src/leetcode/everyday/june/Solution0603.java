package leetcode.everyday.june;

/**
 * @author 潘勇
 * @date 2020/6/03 9:15
 * 837. 新21点
 * 爱丽丝参与一个大致基于纸牌游戏 “21点” 规则的游戏，描述如下：
 * 爱丽丝以 0 分开始，并在她的得分少于 K 分时抽取数字。 抽取时，她从 [1, W] 的范围中随机获得一个整数作为分数进行累计，
 * 其中 W 是整数。 每次抽取都是独立的，其结果具有相同的概率。
 * 当爱丽丝获得不少于 K 分时，她就停止抽取数字。 爱丽丝的分数不超过 N 的概率是多少？
 */
public class Solution0603 {
    /**
     * 动态规划+逆序求解 (未理解)
     *
     * @param N 得分不超过N
     * @param K 少于K时抽取
     * @param W 从[1,W]随机获取数字作为分数
     * @return 不超过 N 的概率
     */
    public double new21Game1(int N, int K, int W) {
        // 先判断 K - 1 + W 是否在 N 的里面，如果在的话，说明肯定能赢得游戏，返回 1.0，也就是 100%
        if (N - K + 1 >= W) {
            return 1.0;
        }
        double[] dp = new double[K + W];
        // 将能赢得游戏的点数的概率设置为 1
        for (int i = K; i <= N; i++) {
            dp[i] = 1.0;
        }
        // 计算K + W 这几个点数的概率和
        double sumProb = N - K + 1;
        // 从 K - 1 开始计算，
        for (int i = K - 1; i >= 0; i--) {
            // 点数为 i 的赢得游戏的概率为 i + 1 ~ i + W 的概率和除以 W
            dp[i] = sumProb / W;
            sumProb = sumProb - dp[i + W] + dp[i];
        }

        return dp[0];
    }

    /**
     * 解题思路
     * 1.先判断是否能 100% 赢得游戏
     * 如果手上的点数为 K - 1 时，拿到个最大的数字 W 时，也就是 K - 1 + W 的点数还是没有 N 大，说明肯定能赢得游戏的胜利
     *2.然后我们就来考虑一般的情况
     *
     * 我们以 N = 21，K = 17，W = 10 来思考。
     * 因为我们的结果是求手上点数为 0 时，赢得游戏的概率。
     *
     * 所以我们需要从后往前逆向求，比如在这里，我们就需要知道在手上点数为 16 时赢得游戏的概率，从而在往前求手上点数为 15 时的概率，最后求出手上点数为 0 时的赢得游戏的概率。
     *
     * 那我们怎么求点数为 16 时赢得游戏的概率呢？
     *
     * 这里我们知道手上点数为 17 时赢得游戏的概率为 100%，所以 K ~ N 区间的赢得游戏的概率为 100%，超过 N 时赢得游戏概率为 0，那么手上点数为 16 时，赢得游戏的概率就是 手上点数为 17 ~ 17 + 10 - 1 的赢得游戏的概率和除以 W，即用一个表达式为 win[16] = sum(win[17] ~ win[26]) / W。
     *
     * 这里我们可以以 O(1) 的时间复杂度计算 sum(win[i + 1] ~ win[i + W + 1])。
     * 我们用一个sumProb = sum(win[17] ~ win[26])
     * 然后每次计算
     * win[i] = sumProb / W
     * sumProb = sumProb + win[i] - win[i + k]
     * @param N 得分不超过N
     * @param K 少于K时抽取
     * @param W 从[1,W]随机获取数字作为分数
     * @return 不超过 N 的概率
     */
    public double new21Game(int N, int K, int W) {
        if (N >= K + W - 1) {
            return 1.0;
        }
        //从1开始
        double[] dp = new double[K + W];
        for (int i = K; i <= N; i++) {
            dp[i]=1;
        }
        double sum=N-K+1;
        for (int i=K-1;i>=0;i--){
            dp[i]=sum/W;
            sum=dp[i]+sum-dp[i+W];
            //会快1ms
            //sum = sum - dp[i + W] + dp[i];
        }
        return dp[0];
    }


    public static void main(String[] args) {
    }
}
