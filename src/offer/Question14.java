package offer;

import java.util.Arrays;

/**
 * 翻转单词顺序列
 */
public class Question14 {
    public static String ReverseSentence(String str) {
        if (str == null || str.length() == 0 || "".equals(str) || str.equals(" ")) {
            return "";
        }
        str = reverse(str);
        String[] strs = str.split(" ");
        if (strs.length == 0) {
            return str;
        }
        String res = "";
        for (String ss : strs) {
            String reverse = reverse(ss);
            res = res + " " + reverse;
            System.out.println(reverse);
        }
        res = res.substring(1, res.length());
        return res;
    }

    public static String reverse(String str) {
        if (str == null || str.length() == 0 || str == "") {
            return "";
        }
        int left = 0;
        int right = str.length() - 1;
        char[] chars = str.toCharArray();
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
//        String str="I am a student";
        String str = " ";
        String s = ReverseSentence(str);
        System.out.println(s);
    }
}
