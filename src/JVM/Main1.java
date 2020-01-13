package JVM;

import java.util.Scanner;

/**
 * @author: Bravery
 * @create: 2019-09-16 21:23
 **/


public class Main1 {
    public static void main(String[] args) {
        



//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int[] array=new int[num];
//        for (int i=0;i<num;i++){
//            int nextInt = scanner.nextInt();
//            array[i]=nextInt;
//        }
//        System.out.println(getMaxDiff(array));
    }

    public static int getMaxDiff(int[] array) {
        int sum = getSum(array);
        int length = array.length;
        int[][] f = new int[length+1][sum/2+1];
        for (int i=0;i<length;i++){
            for (int j=1;j<=sum/2;j++){
                f[i+1][j]=f[i][j];
                if (array[i]<=j&&f[i][j-array[i]]+array[i]>f[i][j]){
                    f[i+1][j]=f[i][j-array[i]]+array[i];
                }
            }
        }
        return sum-2*f[length][sum/2];
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
