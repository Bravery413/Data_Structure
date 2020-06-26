package leetcode.tree;

/**
 * @author: Bravery
 * @create: 2019-09-14 16:54
 **/


public class Solution106 {
    /**
     * 后序的遍历顺序是，左右中
     * 中序的遍历顺序是，左中右
     * 做法:
     * 1.根据后序建立索引，从后往前一个一个拿出来，首先拿出最后一个数a，然后找到中序里a的位置
     * 2.中序里面a左边的就是左子树，a右边的就是右子树，递归调用就行了
     */
    int index;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = postorder.length - 1;
        return helper(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] inorder, int[] postorder, int start, int end) {
        if (start > end) {
            return null;
        }
        int val = postorder[index--];
        for (int i = start; i <= end; i++) {
            if (inorder[i]==val){
                TreeNode root=new TreeNode(val);
                root.left=helper(inorder,postorder,start,i-1);
                root.right=helper(inorder,postorder,i+1,end);
                return root;
            }

        }
        return null;
    }


}
