package leetCode;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 */
public class Solution344 {
    //最普通的方法,注意细节,奇偶个数长度等
    public static void reverseString0(char[] s) {
        int half = s.length % 2 == 1 ? s.length / 2 : s.length / 2 - 1;
        int length=s.length-1;
        char temp;
        for (int i = 0; i <= half; i++) {
            temp=s[i];
            s[i]=s[length-i];
            s[length-i]=temp;
        }
    }
    //又是利用异或交换数字
    public static void reverseString(char[] s) {
        int end = s.length;
        int half = end / 2;
        end = end - 1;
        for (int i = 0; i < half && end >= 0; ++i, --end) {
            s[i] ^= s[end];
            s[end] ^= s[i];
            s[i] ^= s[end];
        }
    }

    public static void main(String[] args) {
        char[] c = {'h', 'e', 'l', 'o'};
        //char和String的互相转换
        String s = String.valueOf(c);
        char[] chars = s.toCharArray();
        reverseString(c);
    }
    /**
     * 总结:
     * 知识点1:char和String的互相转换
     * String s = String.valueOf(c);
     * char[] chars = s.toCharArray();
     * 知识点2:异或原地交换:
     * swap(a, b)
     * {
     *     a = a^b;
     *     b = b^a;//b因被a异或2次,还是b
     *     a = b^a;//a被b异或2次还是a
     * }
     * 还是同一个原理:一个数被异或两次还是他本身
     * 这次写的很棒,分单双个元素讨论,细节把握好
     *
     */

}
