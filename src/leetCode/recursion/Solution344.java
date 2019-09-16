package leetCode.recursion;

/**
 * @author: Bravery
 * @create: 2019-09-13 17:51
 **/


public class Solution344 {
    public void reverseString(char[] s) {
        helper(0,s);
    }

    private void helper(int index, char[] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.println(str[index]);
    }
}
