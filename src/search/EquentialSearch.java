package search;

public class EquentialSearch {
    /**
     * 优化的顺序搜索
     */
    public static int equentialSearch(int[] nums, int key) {
        int i = nums.length - 1;
        nums[0] = key;//哨兵
        while (nums[i] != key) {
            i--;
        }
        return i;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0, 62, 88, 58, 47, 35, 51, 73, 99, 37, 93};
        int result = equentialSearch(nums, 35);
        System.out.println(result);
    }
}
