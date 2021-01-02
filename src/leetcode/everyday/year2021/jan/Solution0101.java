package leetcode.everyday.year2021.jan;

/**
 * @author: Bravery
 * @create: 2021-01-01 23:20
 **/


public class Solution0101 {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int res = 0;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 1) {
                i++;
            } else {
                if (i == len - 1) {
                    res++;
                    return res >= n;
                } else if (i < len - 1 && flowerbed[i + 1] == 0) {
                    res++;
                    i++;
                }
            }
        }
        return res >= n;
    }
}
