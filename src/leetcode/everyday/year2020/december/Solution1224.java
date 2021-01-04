package leetcode.everyday.year2020.december;

/**
 * @author 潘勇
 * @date 2020/12/26 21:35
 */


public class Solution1224 {

    public static void main(String[] args) {
        System.out.println(candy(new int[]{1,0,2}));
    }

    public static int candy(int[] ratings) {
        int len = ratings.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = 1;
        right[len - 1] = 1;
        for (int i = 1; i < len; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            } else {
                right[i] = 1;
            }
        }
        int res=0;
        for (int i = 0; i < len; i++) {
            res+=Math.max(left[i],right[i]);

        }
        return res;
    }

}
