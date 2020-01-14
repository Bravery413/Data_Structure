package offer;

/**
 * 1+...+n的结果
 */
public class Question6 {

    public static int Sum_Solution(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(Sum_Solution(100));
    }
}
