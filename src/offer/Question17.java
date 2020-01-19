package offer;


/**
 * 二维数组中的查找
 */
public class Question17 {
    /**
     * 超时,写法不好
     *
     * @param target
     * @param array
     * @return
     */
    public static boolean Find1(int target, int[][] array) {
        if (array == null) {
            return false;
        }
        for (int row = 0; row < array.length; ) {
            for (int column = array[row].length - 1; column >= 0; ) {
                System.out.println(array[row][column]);
                int cur = array[row][column];
                if (target == cur) {
                    return true;
                } else if (target > array[row][column]) {
                    row++;
                } else {
                    column--;
                }
                if (row >= array.length || column <= 0) {
                    return false;
                }
            }
        }
        return false;
    }

    /**
     * 牛客的有问题,直接n^2遍历时间还更长
     * 较好的写法
     *
     * @param target
     * @param array
     * @return
     */

    public static boolean Find(int target, int[][] array) {
        boolean found = false;
        int lie = array[0].length;
        int hang = array.length;
        int column = lie - 1;
        int row = 0;
        while (row < hang && column >= 0) {
            int value = array[row][column];
            if (target > value) {
                row++;
            } else if (value > target) {
                column--;
            } else {
                found = true;
                break;
            }

        }
        return found;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 9}, {2, 3, 4, 11}, {3, 5, 10, 13}, {4, 8, 12, 20}};
        boolean res = Find(15, array);
        System.out.println(res);
//        System.out.println(Arrays.toString(array[0]));
//        System.out.println(array[0][array[0].length - 1]);
//        System.out.println(array.length);
    }
}
