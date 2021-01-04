package leetcode.everyday.year2020.july;

/**
 * @author: Bravery
 * @create: 2020-07-28 20:53
 * 104. 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度 3 。
 **/


public class Solution0728 {
    /**
     * 树->递归
     * 需要传递值->建立辅助递归函数,从上到下传递当前深度
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return maxDepth(root, 0);
    }

    public int maxDepth(TreeNode root, Integer depth) {
        if (root == null) {
            return depth;
        }
        depth++;
        return Math.max(maxDepth(root.left, depth), maxDepth(root.right, depth));
    }
}
