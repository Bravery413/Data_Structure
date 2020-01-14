package offer;

import java.util.Arrays;

/**
 * 左旋转字符串
 */
public class Question9 {
    public static String LeftRotateString(String str, int n) {
        if (str.length() < n) {
            return "";
        }
        String pre = str.substring(0, n);
        String reversePre = reverse(pre);
        String next = str.substring(n, str.length());
        String reverseNext = reverse(next);
        String reverse = reversePre + reverseNext;
        return reverse(reverse);
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        int n = 3;
//        System.out.println(LeftRotateString(str, 3));
        System.out.println(reverse(str));

    }

    public static String reverse(String str) {
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
//        StringBuilder sBuilder = new StringBuilder();
//        sBuilder.append(str);
//        StringBuilder reverse = sBuilder.reverse();
//        return reverse.toString();

}
