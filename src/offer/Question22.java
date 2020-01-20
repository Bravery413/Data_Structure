package offer;

/**
 * 旋转数组的最小数字
 */
public class Question22 {
    public int minNumberInRotateArray(int[] array) {
        if (array == null) {
            return 0;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println(array[i + 1]);
            }
        }
    }

}
