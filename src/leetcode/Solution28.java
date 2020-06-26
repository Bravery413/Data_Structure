package leetcode;


/**
 * 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle
 * 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 */


class Solution28 {
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i) != needle.charAt(j)) {
                    break;
                }


            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        strStr(haystack, needle);
    }
/**
 * 总结
 *
 *
 */
}
