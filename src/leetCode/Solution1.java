package leetCode;


class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; nums[i]<target&&i < nums.length; i++) {
            for (int j = i + 1; nums[j]<target&&j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);

        System.out.println(ints[0]+"--"+ints[1]);
    }
}