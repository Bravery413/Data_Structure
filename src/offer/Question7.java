package offer;

/**
 * 不用加减乘除做加法
 */
public class Question7 {
    public static int Add(int num1, int num2) {
        //如果有进位
        while (num2 != 0) {
            //加的步骤
            int temp = num1 ^ num2;
            //进位步骤
            num2 = (num1 & num2) << 1;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 17;
        System.out.println(Add(num1, num2));

//        System.out.println(num1 ^ num2);
//        System.out.println((num1 & num2)<<1);
//        int temp = num1 ^ num2;
//        num2=(num1 & num2) << 1;
//        num1=temp;
//        System.out.println("1:"+temp+" 2:"+num2);
//        System.out.println(num1 ^ num2);
    }
}
