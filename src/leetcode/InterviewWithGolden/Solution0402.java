package leetcode.InterviewWithGolden;

import java.util.Arrays;

/**
 * 给定一个有序整数数组，元素各不相同且按升序排列，
 * 编写一个算法，创建一棵高度最小的二叉搜索树。
 */
public class Solution0402 {
    /**
     * 一般树,可以考虑递归
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST1(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(mid);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return treeHelper(nums,0,nums.length-1);
    }

    private TreeNode treeHelper(int [] nums,int left,int right){

        if(left > right){
            return null;
        }
        int mid = (left + right)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = treeHelper(nums,left,mid-1);
        node.right = treeHelper(nums,mid+1,right);
        return node;
    }


}
