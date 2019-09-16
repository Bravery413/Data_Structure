package leetCode.tree;

/**
 * @author: Bravery
 * @create: 2019-09-14 17:15
 **/


public class Solution105 {
    int index;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index = 0;
        return helper(preorder,inorder,0,preorder.length-1);
    }

    private TreeNode helper(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) {
            return null;
        }
        int val = preorder[index++];
        for (int i = start; i <= end; i++) {
            if (inorder[i]==val){
                TreeNode root=new TreeNode(val);
                root.left=helper(preorder,inorder,start,i-1);
                root.right=helper(preorder,inorder,i+1,end);
                return root;
            }
        }
        return null;
    }
}
