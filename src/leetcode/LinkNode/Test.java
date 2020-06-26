package leetcode.LinkNode;

import java.util.HashMap;

/**
 * @author: Bravery
 * @create: 2019-09-21 19:27
 **/


public class Test {
    private static String getA() {
        return "a";
    }

    private static String change(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'a' && c <= 'z') {
                chars[i] = (char) (c - 32);
            } else if (c >= 'A' && c <= 'Z') {
                chars[i] = (char) (c + 32);
            }
        }
        return new String(chars);
    }

    private void a(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {

        }
    }

    static int func(int x) {
        if (x == 1 || x == 2)
            return x;
        return func(x - 1) + func(x - 2);

    }

    public static void main(String[] args) {
//        String a = "a";
//        final String c = "a";
//        String b = a + "b";
//        String d = c + "b";
//        String e = getA() + "b";
//        String compare = "ab";
//        System.out.println(b == compare);
//        System.out.println(d == compare);
//        System.out.println(e == compare);
//        System.out.println(change("Hello"));
        System.out.println(func(4));

    }
}
