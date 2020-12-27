package leetcode.everyday.december;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author 潘勇
 * @date 2020/12/27 12:58
 */


public class Solution1227 {
    public boolean isIsomorphic(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if (len1 != len2) {
            return false;
        }
        HashMap<Character, Character> map1 = new HashMap();
        HashMap<Character, Character> map2 = new HashMap();
        for (int i = 0; i < len1; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            boolean checkMap1 = map1.containsKey(sc) && map1.get(sc) == tc;
            boolean checkMap2 = map2.containsKey(tc) && map2.get(tc) == sc;
            if (checkMap1 || checkMap2) {
                return false;
            }
            map1.put(sc, tc);
            map2.put(tc, sc);
        }
        return true;
    }

}
