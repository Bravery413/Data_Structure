package leetCode.tree;

/**
 * @author: Bravery
 * @create: 2019-09-12 18:22
 **/


public class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null){
            return false;
        }
        sum-=root.val;
        if (root.left==null&&root.right==null){
            return sum==0;
        }
        return hasPathSum(root.left,sum)||hasPathSum(root.right,sum);
    }
}
