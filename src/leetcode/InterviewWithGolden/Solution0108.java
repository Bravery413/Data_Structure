package leetcode.InterviewWithGolden;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution0108 {
    public static void setZeroes(int[][] matrix) {
        Set<Integer> Iset = new HashSet<>();
        Set<Integer> Jset = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    Iset.add(i);
                    Jset.add(j);
                }
            }
        }
        for (Integer index : Jset) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][index] = 0;
            }
        }
        for (Integer index : Iset) {
            for (int j = 0; j < matrix[index].length; j++) {
                matrix[index][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
//        int[][] q = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] q = {{0, 1}};
        setZeroes(q);
        System.out.println(Arrays.toString(q));
    }
}
