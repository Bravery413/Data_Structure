package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution290 {

    /**
     * 自己的写法
     *
     * @param pattern
     * @param str
     * @return
     */
    public static boolean wordPattern1(String pattern, String str) {
        String[] split = str.split(" ");
        // 判断aba  对应 dog cat dog cat
        if (pattern.length() != split.length) {
            return false;
        }
        HashMap<String, Character> map = new HashMap<>();
        HashSet<String> strings = new HashSet<>();
        HashSet<Character> characters = new HashSet<>();
        //判断 abba 对应 dog cat cat fish情况
        for (int i = 0; i < split.length; i++) {
            strings.add(split[i]);
            characters.add(pattern.charAt(i));
        }
        if (strings.size() != characters.size()) {
            return false;
        }
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            if (!map.containsKey(s)) {
                map.put(s, pattern.charAt(i));
            } else {
                Character c = map.get(s);
                if (!c.equals(pattern.charAt(i)))
                    return false;
            }
        }
        return true;
    }

    /**
     * 优化写法 注意到一个containValue的Api使用
     *
     * @param pattern
     * @param str
     * @return
     */
    public static boolean wordPattern(String pattern, String str) {
        String[] split = str.split(" ");
        // 健壮性:判断aba  对应 dog cat dog cat
        if (pattern.length() != split.length) return false;
        Map<Character, String> hashMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String value = split[i];
            if (hashMap.containsKey(key)) {
                if (!hashMap.get(key).equals(value)) return false;
            } else {
                //判断 abba 对应 dog dog dog dog的情况
                if (hashMap.containsValue(value)) return false;
                hashMap.put(key, value);
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat fish"));
    }
}
