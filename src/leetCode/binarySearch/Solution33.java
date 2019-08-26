package leetCode.binarySearch;

/**
 * @author bravery
 * @date 2019/8/26 8:29
 */

/**
 * 题目要求O（logN）的时间复杂度，基本可以断定本题是需要使用二分查找，怎么分是关键
 * 由于题目说数字了无重复，举个例子
 * 1 2 3 4 5 6 7 可以大致分为两类,
 * 第一类 2 3 4 5 6 7 1这种，也就是nums[start] <= nums[mid]。此例子中就是2 <= 5
 * 这种情况下，前半部分有序。因此如果 nums[start] <=target<nums[mid]。则在前半部分找，
 * 否则去后半部分找。
 * 第二类 6 7 1 2 3 4 5这种，也就是nums[start] > nums[mid]。此例子中就是6 > 2
 * 这种情况下，后半部分有序。因此如果 nums[mid] <target<=nums[end]。则在后半部分找，
 * 否则去前半部分找
 */
//TODO 其实不太懂
public class Solution33 {
    public int search0(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            //前半部分有序,注意此处用小于等于
            if (nums[start] <= nums[mid]) {
                //target在前半部分
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target <= nums[end] && target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] q={4,5,6,7,0,1,2};
        int search = search(q, 0);
        System.out.println(search);
    }
}
