package leetCode;

public class Solution263 {

    //自己常规解法
    public static boolean isUgly1(int num) {
        if (num == 0) {
            return false;
        }
        if (num == 1)
            return true;
        while (num % 2 == 0) {
            if (num == 2)
                return true;
            num = num / 2;
        }
        while (num % 3 == 0) {
            if (num == 3)
                return true;
            num = num / 3;
        }
        while (num % 5 == 0) {
            if (num == 5)
                return true;
            num = num / 5;
        }
        return false;
    }

    //优化写法
    public static boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        while (num % 2 == 0)
            num = num / 2;
        while (num % 3 == 0)
            num = num / 3;
        while (num % 5 == 0)
            num = num / 5;
        return num == 1 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }
}
