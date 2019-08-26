package leetCode.binarySearch;

/**
 * @author bravery
 * @date 2019/8/26 10:22
 */
public class Solution50 {
    //直接做 超出时间限制 使用快速幂
    public static double myPow0(double x, int n) {
        double res=1;
        int times;
        if (n<0)
            times=-n;
        else
            times=n;
        for (int i=0;i<times;i++){
            res*=x;
        }
        if (n<0){
            return 1/res;
        }
        return res;
    }
    private static double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return fastPow(x, N);
    }


    public static void main(String[] args) {
        double pow = myPow(2, -2);
        System.out.println(pow);
    }
}
