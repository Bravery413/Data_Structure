package leetCode;

/**
 * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 */
public class Solution1342 {
    public static int numberOfSteps0(int num) {
        int times = 0;
        while (num != 0) {
            times++;
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
        }
        return times;
    }

    /**
     * 使用位运算
     *
     * @param num
     * @return
     */
    public static int numberOfSteps(int num) {
        int times = 0;
        while (num != 0) {
            times++;
            num = (num & 1) == 1 ? num - 1 : num >> 1;
        }
        return times;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
}
