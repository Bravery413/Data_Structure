package offer;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;

/**
 * 第一个只出现一次的字符
 */
public class Question4 {
    /**
     * hashMap解决
     *
     * @param str
     * @return
     */
    public static int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (hashMap.containsKey(c)) {
                Integer count = hashMap.get(c);
                hashMap.put(c, ++count);
            } else {
                hashMap.put(c, 1);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (hashMap.get(chars[i]) == 1) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "abcbcdeca";
        System.out.println(FirstNotRepeatingChar(str));
    }
}
