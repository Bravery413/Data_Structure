package leetcode;

/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 */
public class Solution231 {
    //直接暴力运算过去,超时
    public static boolean isPowerOfTwo0(int n) {
        int nums=1;
        while (true){
            if (nums==n){
                return true;
            }
            if (nums>n){
                return false;
            }
            nums*=2;
            System.out.println("times++:"+ nums);
        }
    }
    //利用二进制特点
    //如何它是二进制那么肯定1开头后面全部0,并且n-1肯定0开头后面全部1
    //1除外,但是 1和0的与也是0
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }


    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(1023));

//        System.out.println(13&17);
    }
    /**
     * 总结:
     * 利用二进制特点
     * &符号位运算
     */
}
