package leetcode.tencent;

/**
 * @author: Bravery
 * @create: 2019-09-14 09:06
 **/


public class Solution121 {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i=0;i<prices.length;i++){
            if (minPrice>prices[i]){
                minPrice=prices[i];
            }else if (maxProfit<prices[i]-minPrice){
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
}
