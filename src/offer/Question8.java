package offer;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 扑克牌顺着
 */
public class Question8 {

    public static boolean isContinuous(int[] numbers) {
        if (numbers.length == 0 || numbers == null) {
            return false;
        }
        //计算0的个数,计算缺的位数,并且一旦重复,返回false
        Arrays.sort(numbers);
        int zero = 0;
        int lost = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            int n = numbers[i];
            if (n == 0) {
                zero++;
            } else {
                if (n == numbers[i + 1]) {
                    return false;
                }
                lost += numbers[i + 1] - n - 1;
            }
        }
        if (zero >= lost) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] numbers = {0, 0, 5, 5, 7};
        System.out.println(isContinuous(numbers));

    }
}
