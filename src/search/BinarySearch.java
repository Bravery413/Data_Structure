package search;

public class BinarySearch {
    /**
     * 二分搜索
     */
    public static int binary_search(int[] nums, int key) {
        int length = nums.length;
        int low, high, mid;
        low = 1;
        high = length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key > nums[mid]) {
                low = mid + 1;
            } else if (key < nums[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 16, 24, 35, 47, 59, 62, 73, 88, 99};
        int result = binary_search(nums, 47);
        System.out.println(result);
        System.out.println(nums[result]);
    }


}
