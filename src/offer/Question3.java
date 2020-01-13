package offer;

/**
 * 最大子序和
 */
public class Question3 {
    /**
     * 动态规划
     *
     * @param array
     * @return
     */
    public static int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        int cur = array[0];

        for (int i = 1; i < array.length; i++) {
            if (cur <= 0) {
                cur = array[i];
            } else {
                cur = cur + array[i];
            }
            if (cur > max) {
                max = cur;
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        int[] array = {6, -3, -2, 7, -15, 1, 2, 2};
        int[] array = {-2, -8, -1, -5, -9};
        System.out.println(FindGreatestSumOfSubArray(array));
    }

}
