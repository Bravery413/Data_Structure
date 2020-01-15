package offer;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * 题目描述
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 */
public class Question12 {
    private static LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

    //Insert one char from stringstream
    public static void Insert(char ch) {
        if (map.containsKey(ch)) {
            map.put(ch, -1);
        } else {
            map.put(ch, 1);
        }

    }

    //return the first appearence once char in current stringstream
    public static char FirstAppearingOnce() {
        Iterator<Character> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Character cur = iterator.next();
            if (map.get(cur) == 1) {
                return cur;
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        String str = "google";
        char[] chars = str.toCharArray();
        for (char c : chars) {
            Insert(c);
        }
        char c = FirstAppearingOnce();
        System.out.println(c);
    }
}
