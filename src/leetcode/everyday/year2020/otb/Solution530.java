package leetcode.everyday.year2020.otb;

/**
 * @author: Bravery
 * @create: 2020-11-01 20:29
 **/


public class Solution530 {
    int pre;
    int res;

    public int getMinimumDifference(TreeNode root) {
        pre=-1;
        res=Integer.MAX_VALUE;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        if (pre != -1) {
            res = Math.min(node.val - pre, res);
        }
        pre = node.val;
        dfs(node.right);
    }

}
