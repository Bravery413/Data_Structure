package leetcode.everyday.june;

import java.util.HashMap;

/**
 * @author 潘勇
 * @date 2020/6/22 21:29
 * 面试题 16.18. 模式匹配
 * 你有两个字符串，即pattern和value。 pattern字符串由字母"a"和"b"组成，用于描述字符串中的模式。
 * 例如，字符串"catcatgocatgo"匹配模式"aabab"（其中"cat"是"a"，"go"是"b"），
 * 该字符串也匹配像"a"、"ab"和"b"这样的模式。但需注意"a"和"b"不能同时表示相同的字符串。
 * 编写一个方法判断value字符串是否匹配pattern字符串。
 * 示例 1：
 * 输入： pattern = "abba", value = "dogcatcatdog"
 * 输出： true
 * 示例 2：
 * 输入： pattern = "abba", value = "dogcatcatfish"
 * 输出： false
 * 示例 3：
 * 输入： pattern = "aaaa", value = "dogcatcatdog"
 * 输出： false
 * 示例 4：
 * 输入： pattern = "abba", value = "dogdogdogdog"
 * 输出： true
 * 解释： "a"="dogdog",b=""，反之也符合规则
 * 提示：
 * 0 <= len(pattern) <= 1000
 * 0 <= len(value) <= 1000
 * 你可以假设pattern只包含字母"a"和"b"，value仅包含小写字母。
 *
 */
public class Solution0622 {
    /**
     * 直接的方法行不通
     * @param pattern
     * @param value
     * @return
     */
    public static boolean patternMatching0(String pattern, String value) {
        int patLen = pattern.length();
        int valLen = value.length();
        if (patLen == 0 && valLen == 0) {
            return true;
        } else if (patLen == 0) {
            return false;
        } else if (valLen == 0) {
            char c1=pattern.charAt(0);
            for (char cs:pattern.toCharArray()){
                if (c1!=cs){
                    return false;
                }
            }
            return true;
        }
        if (patLen == 1) {
            return true;
        }
        if (valLen % patLen != 0) {
            return false;
        }
        int len = valLen / patLen;
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0, j = 0; i < patLen; i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                String s = map.get(c);
                for (int k = 0; k < len; j++, k++) {
                    if (value.charAt(j) != s.charAt(k)) {
                        return false;
                    }
                }
            } else {
                StringBuilder chars = new StringBuilder();
                for (int k = 0; k < len; j++, k++) {
                    chars.append(value.charAt(j));
                }
                map.put(c, chars.toString());
            }
        }
        return true;
    }

    public boolean patternMatching(String pattern, String value) {
        if (value.isEmpty()) {
            return pattern.length() <= 1;
        }
        if (pattern.isEmpty()) {
            return false;
        }
        int countA = 0, countB = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'a') {
                countA++;
            } else {
                countB++;
            }
        }
        int lenA = 0, lenB = 0, len = value.length();
        if (countA == 0 && countB == 0) {
            return value.isEmpty();
        }
        // countA * m + countB * n = len
        if (countA == 0) {
            return value.length() % countB == 0 && matchOnlyOne(value, value.length() / countB);
        } else if (countB == 0) {
            return value.length() % countA == 0 && matchOnlyOne(value, value.length() / countA);
        } else {
            for (; lenA <= len / countA; lenA++) {
                if ((len - countA * lenA) % countB != 0) {
                    continue;
                }
                lenB = (len - countA * lenA) / countB;
                boolean matched = match(pattern, value, lenA, lenB);
                if (matched) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean match(String pattern, String value, int lenA, int lenB) {
        int posA = pattern.indexOf('a'), posB = pattern.indexOf('b');
        String strA = value.substring(posA * lenB, posA * lenB + lenA), strB = value.substring(posB * lenA, posB * lenA + lenB);
        int indexOfValue = 0, indexOfPattern = 0;
        while (indexOfValue < value.length()) {
            char p = pattern.charAt(indexOfPattern++);
            if (p == 'a') {
                for (int j = 0; j < lenA && indexOfValue < value.length(); j++) {
                    if (value.charAt(indexOfValue++) != strA.charAt(j)) {
                        return false;
                    }
                }
            } else {
                for (int j = 0; j < lenB && indexOfValue < value.length(); j++) {
                    if (value.charAt(indexOfValue++) != strB.charAt(j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean matchOnlyOne(String value, int lenX) {
        String sub = value.substring(0, lenX);
        int indexOfValue = 0;
        for (int i = 0; i < value.length() / lenX; i++) {
            for (int j = 0; j < lenX; j++) {
                if (value.charAt(indexOfValue++) != sub.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String value = "dogcatcatdog";
        System.out.println(patternMatching0(pattern, value));
    }
}
