package leetcode.everyday.year2020.june;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * 二进制求和:
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * 示例 1:
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 */
public class Solution0623 {
    /**
     * JavaAPI
     * 1.Integer.parseInt(num,system)
     * 2.Integer.toBinaryString
     * 3.因为Integer超过32位溢出,选择BigInteger
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary0(String a, String b) {
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    }

    /**
     * 使用异或获取暂时的结果ans
     * 使用与结果左移一位获得所有进位carry
     * 两者再异或A=ans,B=carry
     * 如果没有进位就是答案,如有进位,继续
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        BigInteger A = new BigInteger(a, 2);
        BigInteger B = new BigInteger(b, 2);
        BigInteger ans, carry;
        while (!B.equals(BigInteger.ZERO)) {
            ans = A.xor(B);
            carry = A.and(B).shiftLeft(1);
            A = ans;
            B = carry;
        }
        return A.toString(2);
    }

    /**
     * 最直接做法,效率最高,coding能力
     * 略
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary2(String a, String b) {
        int len = Math.max(a.length(), b.length());
        //将两个字符串转换为等长的
        char[] s1 = new char[len];
        Arrays.fill(s1, '0');
        char[] s2 = new char[len];
        Arrays.fill(s2, '0');
        char[] s3 = new char[len + 1];
        Arrays.fill(s3, '0');
        int j = s1.length - 1;
        for (int i = a.length() - 1; i >= 0; i--) {
            s1[j] = a.charAt(i);
            j--;
        }
        j = s2.length - 1;
        for (int i = b.length() - 1; i >= 0; i--) {
            s2[j] = b.charAt(i);
            j--;
        }
        int i = s1.length - 1;
        boolean flag = false;//是否进位的标志器
        while (i >= 0) {
            if (s1[i] == '0' && s2[i] == '0') {
                if (flag) {
                    s3[i + 1] = '1';
                } else {
                    s3[i + 1] = '0';
                }
                flag = false;//两个0怎么加都不会有进位
            } else if (s1[i] == '0' && s2[i] == '1') {
                if (flag) {//根据情况判断是否有进位
                    s3[i + 1] = '0';
                    flag = true;
                } else {
                    s3[i + 1] = '1';
                    flag = false;
                }
            } else if (s1[i] == '1' && s2[i] == '0') {
                if (flag) {
                    s3[i + 1] = '0';
                    flag = true;
                } else {
                    s3[i + 1] = '1';
                    flag = false;
                }
            } else {
                if (flag) {
                    s3[i + 1] = '1';
                } else {
                    s3[i + 1] = '0';
                }
                flag = true;//两个1相加本来自带进位
            }
            i--;
        }
        if (!flag) {
            char[] ret = new char[len];
            for (int k = 0; k < ret.length; k++) {
                ret[k] = s3[k + 1];
            }
            return new String(ret);
        }
        s3[0] = '1';
        return new String(s3);
    }
}
