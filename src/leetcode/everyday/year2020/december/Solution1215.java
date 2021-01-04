package leetcode.everyday.year2020.december;

/**
 * @author 潘勇
 * @date 2020/12/15 8:44
 */


public class Solution1215 {
    public static void main(String[] args) {
        System.out.println(monotoneIncreasingDigits(112489));
    }


    public static int monotoneIncreasingDigits(int N) {
        char[] chars = Integer.toString(N).toCharArray();
        int index=1;
        int len = chars.length;
        while (index<len&&chars[index-1]<=chars[index]){
            index++;
        }
        if (index<len){
            while (index>0){
                chars[index-1]-=1;
                index--;
            }
            index++;
            while (index<len){
                chars[index]='9';
                index++;
            }
        }
        return Integer.parseInt(new String(chars));
    }



















    public static int monotoneIncreasingDigits0(int N) {
        char[] strN = Integer.toString(N).toCharArray();
        int i = 1;
        //找出单调递增的区间[0,i]
        while (i < strN.length && strN[i - 1] <= strN[i]) {
            i += 1;
        }
        if (i < strN.length) {
            while (i > 0 && strN[i - 1] > strN[i]) {
                strN[i - 1] -= 1;
                i -= 1;
            }
            for (i += 1; i < strN.length; ++i) {
                strN[i] = '9';
            }
        }
        return Integer.parseInt(new String(strN));
    }

}
