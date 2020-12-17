package leetcode.everyday.december;

import java.util.HashMap;

/**
 * @author 潘勇
 * @date 2020/12/16 8:37
 */

/**
 * 290. 单词规律
 */
public class Solution1216 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat fish"));
    }


    public static boolean wordPattern0(String pattern, String str) {
        String[] split = str.split(" ");
        // 健壮性:判断aba  对应 dog cat dog cat
        if (pattern.length() != split.length) {
            return false;
        }
        HashMap<Character, String> hashMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String value = split[i];
            if (hashMap.containsKey(key)) {
                if (!hashMap.get(key).equals(value)) {
                    return false;
                }
            } else {
                //这个地方很关键 对应abba  dog dog dog dog 判定情况
                if (hashMap.containsValue(value)) {
                    return false;
                }
                hashMap.put(key, value);
            }
        }

        return true;
    }

    /**
     * 双射
     * @param pattern
     * @param s
     * @return
     */
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        String[] split = s.split(" ");
        if (split.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < split.length; i++) {
            char c = pattern.charAt(i);
            String str = split[i];
            map1.put(c, str);
            map2.put(str, c);
        }
        for (int i = 0; i < split.length; i++) {
            char c = pattern.charAt(i);
            String str = split[i];
            if (map1.get(c).equals(str) && map2.get(str).equals(c)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
