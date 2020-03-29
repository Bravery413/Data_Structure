package leetCode;

public class Solution258 {
    //递归解决
    public static int addDigits1(int num) {
        int temp;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        if (sum >= 10) {
            return addDigits(sum);
        } else {
            return sum;
        }
    }

    //迭代
    public static int addDigits2(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }

    //数学解法:每成了10需要取一位出来,再结合10打包
    public static int addDigits3(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 9 != 0) {
            return num % 9;
        } else {
            return 9;
        }
    }

    //数学解法:优化写法
    public static int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }


    public static void main(String[] args) {
        System.out.println(addDigits(37));
    }
}
