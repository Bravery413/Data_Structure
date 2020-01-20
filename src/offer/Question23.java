package offer;

import java.util.ArrayList;

/**
 * 顺时针打印矩阵
 */
public class Question23 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        return null;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int row = 0;
        int column = 0;
        while (true) {
            while (column < array[row].length) {
                System.out.println(array[row][column]);
                column++;
            }
            column--;
            while (true) {
                row++;
                if (row < array.length) {
                    System.out.println(array[row][column]);
                } else {
                    row--;
                    break;
                }


            }
            while (true) {
                if (column > 0) {
                    System.out.println(array[row][column]);
                } else {
                    row++;
                    break;
                }
            }
            break;


        }

    }

}
