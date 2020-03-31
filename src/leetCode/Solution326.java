package leetCode;

public class Solution326 {
    //超时
    public static boolean isPowerOfThree1(int n) {
        int temp = 1;
        while (n >= temp) {
            if (temp == n) return true;
            temp *= 3;
        }
        return false;
    }

    public static boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(82));
        System.out.println(81 % 3);
    }
}
