package leetcode.everyday.june;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 潘勇
 * @date 2020/6/01 9:15
 * 1431. 拥有最多糖果的孩子
 * 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
 * 对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，
 * 此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。
 * 示例 1：
 * 输入：candies = [2,3,5,1,3], extraCandies = 3
 * 输出：[true,true,true,false,true]
 */
public class Solution0601 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int value : candies) {
            if (value > max) {
                max = value;
            }
        }
        ArrayList<Boolean> res = new ArrayList<>();
        for (int candy : candies) {
            res.add(candy + extraCandies >= max);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] qus=new int[]{2,3,5,1,3};
        System.out.println(kidsWithCandies(qus,3));
    }
}
