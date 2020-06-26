package leetcode.binarySearch;

/**
 * @author bravery
 * @date 2019/8/26 8:09
 */

/**
 * 重点在于调用别人接口怎么弄的
 */
public class Solution374 {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public int guess(int n) {
        return 0;
    }
}
