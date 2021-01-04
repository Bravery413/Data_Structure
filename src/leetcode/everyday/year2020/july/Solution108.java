package leetcode.everyday.year2020.july;

/**
 * @author: Bravery
 * @create: 2020-10-10 18:37
 **/


public class Solution108 {
    public static void main(String[] args) {
        TreeNode treeNode = sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        System.out.println(treeNode);
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    public static TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, left, mid - 1);
        node.right = helper(nums, mid + 1, right);
        return node;
    }
}
