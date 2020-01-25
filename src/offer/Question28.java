package offer;

/**
 * 数值的整数次方
 */
public class Question28 {
    /**
     * 有很多情況需要考慮的
     * @param base
     * @param exponent
     * @return
     */
    public static double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }

        double result = Power(base, exponent >> 1);
        result *= result;
        if ((exponent & 1) == 1) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Power(2,3));
    }
}
