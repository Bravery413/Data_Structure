package leetCode;

public class Solution371 {
    public static int getSum(int a, int b) {
        int temp;
        while (b!=0){
            temp=a^b;//不进位的a加b
            b=(a&b)<<1;//a和b的一次进位
            a=temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getSum(12, 7));
    }
}
