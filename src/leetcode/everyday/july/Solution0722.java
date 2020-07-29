package leetcode.everyday.july;

/**
 * @author 潘勇
 * @date 2020/7/22 20:45
 */


public class Solution0722 {
    public int minArray(int[] numbers) {
        int res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (res > numbers[i]) {
                res = numbers[i];
            }
        }
        return res;
    }
}
