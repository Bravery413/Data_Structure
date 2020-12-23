package leetcode.everyday.december;

/**
 * @author 潘勇
 * @date 2020/12/23 8:27
 */


public class Solution1223 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s) {
        int[] map = new int[26];
        for (char c : s.toCharArray()) {
            map[c - 'a'] += 1;
        }
        int i = 0;
        for (char c : s.toCharArray()) {
            if (map[c - 'a'] == 1) {
                return i;
            }
            i++;
        }

        return -1;
    }

}
