package leetcode.everyday.year2020.july;

/**
 * @author: Bravery
 * @create: 2020-07-07 21:57
 * 112. 路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * 说明: 叶子节点是指没有子节点的节点。
 * 示例: 
 * 给定如下二叉树，以及目标和 sum = 22，
 *              5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 **/


public class Solution0707 {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return hasPathSum(root, sum, 0);
    }

    /**
     * 其实就是遍历树,自己的思路:
     * 递归深度遍历,一旦计算相等,则判断是否叶子节点,
     * 如果是,返回true,否则返回false
     *
     * @param root
     * @param sum
     * @param count
     * @return
     */
    public static boolean hasPathSum(TreeNode root, int sum, int count) {
        if (root == null) {
            return false;
        } else {
            count += root.val;
            if (count == sum && root.left == null && root.right == null) {
                return true;
            }
//            因为有负数,不能因为大于就直接返回false
//            if (count > sum) {
//                return false;
//            }
            return hasPathSum(root.left, sum, count) || hasPathSum(root.right, sum, count);
        }
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(8);
        TreeNode n4 = new TreeNode(11);
        TreeNode n5 = new TreeNode(13);
        TreeNode n6 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(2);
        TreeNode n9 = new TreeNode(1);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n4.left = n7;
        n4.right = n8;
        n3.left = n5;
        n3.right = n6;
        n6.right = n9;
//        TreeNode n1 = new TreeNode(1);
//        TreeNode n2 = new TreeNode(2);
//        n1.left = n2;
        boolean b = hasPathSum(n1, 22);
        System.out.println(b);


    }
}
