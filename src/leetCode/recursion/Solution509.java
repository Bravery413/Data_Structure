package leetCode.recursion;

/**
 * @author: Bravery
 * @create: 2019-09-13 18:11
 **/


public class Solution509 {
    public static int fib(int N) {
        if (N==0)
            return 0;
        if (N==1)
            return 1;
        return fib(N-1)+fib(N-2);
    }

    public static void main(String[] args) {
        for (int i=0;i<20;i++){
            System.out.println(fib(i));
        }
    }
}
