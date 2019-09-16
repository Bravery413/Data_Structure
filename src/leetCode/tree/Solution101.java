package leetCode.tree;

/**
 * @author: Bravery
 * @create: 2019-09-12 18:09
 **/


public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return t1==t2&&isMirror(t1.right,t2.left)&&isMirror(t1.left,t2.right);
    }

}
