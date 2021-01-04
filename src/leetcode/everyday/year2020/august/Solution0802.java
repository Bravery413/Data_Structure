package leetcode.everyday.year2020.august;

import leetcode.everyday.year2020.july.TreeNode;

/**
 * @author: Bravery
 * @create: 2020-08-02 14:19
 **/


public class Solution0802 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode newRoot = new TreeNode(root.val);
        helper(root, newRoot);

    }

    public void helper(TreeNode root, TreeNode newRoot) {
        if (root == null) {

        }


    }
}
