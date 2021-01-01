package leetcode.everyday.year2020.march;

import java.util.Arrays;


public class Solution0328 {
    public static int[] getLeastNumbers(int[] arr, int k) {
        boolean[] bitMap = new boolean[10001];
        for (int i = 0; i < arr.length; i++) {
            bitMap[arr[i]] = true;
        }
        int[] res = new int[k];
        int count = 0;
        for (int i = 0; i < bitMap.length ; i++) {
            if (bitMap[i] == true) {
                res[count] = i;
                count++;
                if (count == k) {
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] qus = {0, 0, 2, 7, 3};
        int[] res = getLeastNumbers(qus, 2);
        System.out.println(Arrays.toString(res));
    }
}
