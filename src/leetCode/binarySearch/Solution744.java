package leetCode.binarySearch;

/**
 * @author bravery
 * @date 2019/8/26 11:30
 */

/**
 * 二分法的重点是边界条件的判断
 * <p>
 * **特殊情况：**如果letters[0] > target || letters[letters.length - 1] <= target说明letters[0]就是我们需要查找的字符
 * <p>
 * 首先取mid = left + (right + left) / 2;
 * <p>
 * 如果letters[mid] == target，由于是有序的数组，说明需要在右边查找，left=mid+1;
 * <p>
 * 如果letters[mid] < target，由于是有序的数组，说明需要在右边查找，left=mid+1;
 * <p>
 * 当letters[mid] > target,需要分情况讨论，如果letters[mid - 1] <= target，说明letters[mid]就是我们需要查找的字符，返回即可。
 * 否则，我们需要继续在左边查找，left=mid-1
 */
public class Solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
        if (letters[0] > target || letters[letters.length - 1] <= target) {
            return letters[0];
        }
        int left = 1;
        int right = letters.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                if (letters[mid - 1] <= target) {
                    return letters[mid];
                } else {
                    right = mid - 1;
                }
            }
        }
        return ' ';
    }
}
