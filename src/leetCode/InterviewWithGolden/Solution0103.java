package leetCode.InterviewWithGolden;

/**
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
 * （注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 *提示：
 * 字符串长度在[0, 500000]范围内。
 */
public class Solution0103 {
    /**
     * 使用字符数组常规做法
     *
     * @param S
     * @param length
     * @return
     */
    public static String replaceSpaces0(String S, int length) {
        char[] chars = S.toCharArray();
        int times = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') times++;
        }
        char[] res = new char[length + 2 * times];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char c = chars[i];
            if (c != ' ') {
                res[index] = c;
                index++;
            } else {
                res[index] = '%';
                res[++index] = '2';
                res[++index] = '0';
                index++;
            }
        }
        return new String(res);
    }

    /**
     * 优化做法,从末尾开始替换,再截取
     *
     * @param S
     * @param length
     * @return
     */
    public static String replaceSpaces2(String S, int length) {
        int index = S.length()-1;
        int point = length - 1;
        char[] chars = S.toCharArray();
        while (point >= 0) {
            if (chars[point] == ' ') {
                chars[index--] = '0';
                chars[index--] = '2';
                chars[index--] = '%';
            } else {
                chars[index--] = chars[point];
            }
            point--;
        }
        //有部分是多余的空间
        System.out.println(String.valueOf(chars,index+1,S.length()-index-1));
        System.out.println(String.valueOf(chars));
        return String.valueOf(chars,index+1,S.length()-index-1);
//        return String.valueOf(chars);
    }

    /**
     * api做法1
     * @param S
     * @param length
     * @return
     */
    public static String replaceSpaces(String S, int length) {
        S.replaceAll(" ","%20");
        return "";
    }
    public static void main(String[] args) {
        System.out.println(replaceSpaces("ds sdfs afs sdfa dfssf asdf             ", 27));
    }
}
