package leetcode.everyday.year2020.june;

/**
 * 9. 回文数
 */
public class Solution0610 {
    /**
     * 前后指针
     *
     * @param x
     * @return
     */
    public boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * 不把字符改数字的做法
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        boolean flag = (x > 0 && x % 10 == 0);
        if (x < 0 || flag) {
            return false;
        }
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return reverse == x || reverse / 10 == x;
    }
}
