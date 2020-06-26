package leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Bravery
 * @create: 2019-08-22 20:32
 **/


public class Solution205 {
    public static boolean isIsomorphic0(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int[] s1 = new int[s.length()];
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        int[] s2 = new int[t.length()];
        int j = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashMap.containsKey(c)) {
                s1[i] = hashMap.get(c);
            } else {
                hashMap.put(c, j);
                s1[i] = j;
                j++;
            }
        }
        j = 1;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (hashMap2.containsKey(c)) {
                s2[i] = hashMap2.get(c);
            } else {
                hashMap2.put(c, j);
                s2[i] = j;
                j++;
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char t1 = t.charAt(i);
            if (hashMap.containsKey(c1)) {
                if (hashMap.get(c1) != t1) return false;
            } else {
                if (hashMap.containsValue(t1)) return false;
                hashMap.put(c1, t1);
            }
        }
        return true;
    }

    public static boolean isIsomorphic1(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        if(s.length()!=t.length())return false;

        for(int i = 0;i<s.length();i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if(map.containsKey(ss)){
                if(map.get(ss)!=tt)return false;
            }else{
                if(map.containsValue(tt))return false;
                map.put(ss,tt);
            }

        }
        return true;
    }



    public static void main(String[] args) {
        String str1 = "egg";
        String str2 = "add";
        boolean isomorphic = isIsomorphic1(str1, str2);
        System.out.println(isomorphic);

    }
}
