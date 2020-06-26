package leetcode.tree;

/**
 * @author: Bravery
 * @create: 2019-09-14 17:41
 **/


public class Solution116 {
    public Node connect(Node root) {
        if (root==null){
            return null;
        }
        if (root.left!=null){
            root.left.next=root.right;
            if (root.next!=null){
                if (root.next.left!=null)
                root.right.next=root.next.left;
            }
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}
