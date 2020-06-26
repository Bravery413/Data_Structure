package leetcode.everyday.june;

/**
 * @author 潘勇
 * @date 2020/6/21 16:29
 */

/**
 * 二叉树中的最大路径和
 * 给定一个非空二叉树，返回其最大路径和。
 *
 * 本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 *
 *        1
 *       / \
 *      2   3
 *
 * 输出: 6
 */
public class Solution0621 {
    private static int res = Integer.MIN_VALUE;

    /**
     * 递归解决
     * @param root
     * @return
     */
    public static int maxPathSum(TreeNode root) {
        helper(root);
        return res;
    }

    public static int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = Math.max(helper(root.left), 0);
        int rightMax = Math.max(helper(root.right), 0);
        res = Math.max(root.val + leftMax + rightMax, res);
        return Math.max(root.val + leftMax, root.val + rightMax);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        n1.left=n2;
        n2.right=n3;
        int i = maxPathSum(n1);
        System.out.println(i);
        System.out.println(maxPathSum(new TreeNode(0)));
    }
}
