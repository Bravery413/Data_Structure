package leetCode.ArrayAndString;

import java.util.ArrayList;

/**
 * @author bravery
 * @date 2019/8/28 7:45
 */
public class Solution66 {
    /**
     * 其实就是模拟加法,大于10 有进位,
     *默认赋值为0
     */
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 == 10) {
                digits[i] = 0;
            } else {
                digits[i] = ++digits[i];
                return digits;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        //默认赋值为0
//        for (int i = 1; i < res.length; i++) {
//            res[i] = 0;
//        }
        return res;
    }



//    public static void main(String[] args) {
//        int[] q = {1, 2, 3};
//        int[] ints = plusOne(q);
//        System.out.println(ints.toString());
//
//    }

}
