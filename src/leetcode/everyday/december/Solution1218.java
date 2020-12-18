package leetcode.everyday.december;

/**
 * @author 潘勇
 * @date 2020/12/18 8:38
 */

/**
 * 389. 找不同
 */
public class Solution1218 {


    public static void main(String[] args) {
        System.out.println(findTheDifference("ae", "aea"));
        ;
    }


    /**
     * 计数
     *
     * @param s
     * @param t
     * @return
     */
    public static char findTheDifference0(String s, String t) {
        int[] map1 = new int[26];
        for (char c : s.toCharArray()) {
            map1[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            if (map1[c - 'a'] > 0) {
                map1[c - 'a'] -= 1;
            } else {
                return c;
            }
        }
        return ' ';
    }

    /**
     * 求和
     * @param s
     * @param t
     * @return
     */
    public static char findTheDifference1 (String s, String t) {
        int count1=0;
        int count2=0;
        for (char c : s.toCharArray()) {
            count1+=c;
        }
        for (char c : t.toCharArray()) {
            count2+=c;
        }
        return (char)(count2-count1);
    }

    /**
     * 位运算
     * @param s
     * @param t
     * @return
     */
    public static char findTheDifference (String s, String t) {
        int res=0;
        for (char c : s.toCharArray()){
            res^=c;
        }
        for (char c : t.toCharArray()) {
            res ^= c;
        }
        return (char)res;
    }

}
