package leetcode.everyday.may;

/**
 * 验证回文字符串 Ⅱ
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 * 示例 1:
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 */
public class Solution680 {
    /**
     * 验证是否回文
     *
     * @param s
     * @return
     */
    public static boolean validPalindrome1(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            if (chars[left] == chars[right]) {
                left++;
                right--;
            } else {
                int left2 = left;
                int right2 = right - 1;
                left += 1;
                boolean flag1 = true;
                boolean flag2 = true;
                while (left < right) {
                    if (chars[left] != chars[right]) {
                        flag1 = false;
                        break;
                    } else {
                        left++;
                        right--;
                    }

                }
                while (left2 < right2) {
                    if (chars[left2] != chars[right2]) {
                        flag2 = false;
                        break;
                    } else {
                        left2++;
                        right2--;
                    }
                }
                return flag1 || flag2;
            }
        }
        return true;
    }

    /**
     * 优化写法
     *
     * @param s
     * @return
     */
    public static boolean validPalindrome2(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return true;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] == chars[right]) {
                left++;
                right--;
            } else {
                return isTrue(chars, left + 1, right) || isTrue(chars, left, right - 1);
            }
        }
        return true;
    }

    public static boolean isTrue(char[] chars, int left, int right) {
        while (left < right) {
            if (chars[left] == chars[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * 递归写法
     *
     * @param s
     * @return
     */
    public static boolean validPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return true;
        }
        int missCount = 0;
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        return validPalindrome(chars, left, right, missCount);

    }

    public static boolean validPalindrome(char[] chars, int left, int right, int missCount) {
        if (missCount >= 2) {
            return false;
        }
        while (left < right) {
            if (chars[left] == chars[right]) {
                left++;
                right--;
            } else{
                return validPalindrome(chars, left, right -1, ++missCount)||validPalindrome(chars, left + 1, right, ++missCount) ;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbbcc";
        System.out.println(validPalindrome(s));

    }
}
