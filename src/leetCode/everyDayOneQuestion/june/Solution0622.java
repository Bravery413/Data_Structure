package leetCode.everyDayOneQuestion.june;

import java.util.HashMap;

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
