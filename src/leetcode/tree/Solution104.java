package leetcode.tree;



/**
 * @author: Bravery
 * @create: 2019-09-12 17:56
 **/


public class Solution104 {

    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left,right)+1;
        }
    }

}
