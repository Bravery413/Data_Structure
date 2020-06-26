package leetcode.binarySearch;

/**
 * @author bravery
 * @date 2019/8/26 10:41
 */
public class Solution367 {
    //遇到很大的数会溢出
    public static boolean isPerfectSquare0(int num) {
        int high = num;
        int low = 1;
        int mid;
        while (low <= high) {
            mid = (low+high)>>> 1;
            double temp=(double) mid*mid;
            if (temp == num) {
                return true;
            } else if (temp < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static boolean isPerfectSquare(int num) {
        int i = 1;
        int res = 1;
        while (res <= num && i < num / 2) {
            res = i * i;
            if (res == num) {
                return true;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean square = isPerfectSquare0(2147483647);
        System.out.println(square);
    }
}
