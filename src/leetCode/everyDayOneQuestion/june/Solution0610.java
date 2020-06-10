package leetCode.everyDayOneQuestion.june;

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
        }
        return true;
    }

    /**
     * 不把字符改数字的做法
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if (x < 0||(x>0&&x%10==0)) {
            return false;
        }
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return reverse == x||reverse/10==x;
    }
}
