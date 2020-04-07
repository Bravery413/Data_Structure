package leetCode.InterviewWithGolden;

import java.util.HashMap;
import java.util.Set;

/**
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 * 比如，字符串aabcccccaaa会变为a2b1c5a3。
 * 若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 *
 */
public class Solution0106 {
    /**
     * 理解错误
     *
     * @param S
     * @return
     */
    public static String compressString0(String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : S.toCharArray()) {
            if (map.containsKey(c)) {
                Integer times = map.get(c);
                map.put(c, ++times);
            } else {
                map.put(c, 1);
            }
        }
        StringBuilder builder = new StringBuilder();
        Set<Character> keySet = map.keySet();
        for (char c : keySet) {
            builder.append(c);
            builder.append(map.get(c));
        }
        String res = builder.toString();
        return res.length() < S.length() ? res : S;
    }

    /**
     * 常规做法,
     * 附:
     * 使用S.toCharArray()再for循环比每次使用S.CharAt(i)效率高
     * @param S
     * @return
     */
    public static String compressString1(String S) {
        if (S == null || S.length() < 2) return S;
        StringBuilder builder = new StringBuilder();
        char last = S.charAt(0);
        int times = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != last) {
                builder.append(last);
                builder.append(times);
                last = S.charAt(i);
                times = 1;
            } else {
                times++;
            }
        }
        builder.append(last);
        builder.append(times);
        String res = builder.toString();
        return res.length() < S.length() ? res : S;
    }

    /**
     * 双指针 反而效率慢了1ms
     * @param S
     * @return
     */
    public static String compressString(String S) {

        int before = 0;
        int pre = 1;
        StringBuilder builder = new StringBuilder();
        while (pre < S.length()) {
            if (S.charAt(pre) != S.charAt(before)) {
                builder.append(S.charAt(before)).append(pre - before);
                before = pre;
            }
            pre++;

        }
        builder.append(S.charAt(before)).append(pre - before);
        String res = builder.toString();
        return res.length() < S.length() ? res : S;
    }

    public static void main(String[] args) {
        System.out.println(compressString("aabcccccaaa"));
    }
}
