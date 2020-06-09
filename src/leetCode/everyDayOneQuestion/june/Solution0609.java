package leetCode.everyDayOneQuestion.june;

/**
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，
 * 1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
 * 一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 *示例 1:
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 *
 */
public class Solution0609 {
    /**
     * 递归:(由上到下)
     * 1.如果一位数,直接返回1种组合
     * 2.每次取最后2位,如果在[10,25]间,有两种组合方法:1自己组,2两位一起组
     * 答案是最后一位自己组合的种类f(num/10)+最后两位一起组的种类f(num/100)
     * 除10表示去掉最后一位:自己组
     * 除100表示去掉最后2位:两位一组
     *
     * @param num
     * @return
     */
    public static int translateNum1(int num) {
        if (num < 10) {
            return 1;
        }
        return (num % 100) >= 10 && (num % 100 <= 25) ? translateNum(num / 10) + translateNum(num / 100) : translateNum(num / 10);
    }

    /**
     * 迭代:(由下到上)
     * 注:
     * 1.每次取数字前面,可以转化为String,再截取
     * 2.判断两个字符串大小可以用int i=str1.compareTo(str2);
     *
     * @param num
     * @return
     */
    public static int translateNum(int num) {
        if (num < 10) {
            return 1;
        }
        String s = String.valueOf(num);
        int a = 1;
        int b = 1;
        for (int i = 2; i <= s.length(); i++) {
            String sub = s.substring(i - 2, i);
            int k = sub.compareTo("10") >= 0 && sub.compareTo("25") <= 0 ? a + b : a;
            b = a;
            a = k;
        }
        return a;

    }

    public static void main(String[] args) {
        System.out.println(translateNum(12258));

    }
}
