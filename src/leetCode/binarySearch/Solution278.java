package leetCode.binarySearch;

/**
 * @author bravery
 * @date 2019/8/26 15:17
 */
public class Solution278 {
    //TODO 写到这里
    public int firstBadVersion0(int n) {
        int left = 0;
        int right = n;
        int mid = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            //自己是错的
            if (isBadVersion(mid)) {
                //如果自己是错的,自己上一位是对的,return
                if (!isBadVersion(mid - 1)) {
                    return mid;
                    //自己是错的,上一位还是错的,去前面找
                } else {
                    right = mid - 1;
                }
                //自己是对的,去后面找错的
            } else {
                left = mid + 1;
            }
        }
        return mid;
    }
    //这样直接也行 效率高
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


    public boolean isBadVersion(int n) {
        return true;
    }
}
