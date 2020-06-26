package leetcode.tree;

/**
 * @author: Bravery
 * @create: 2019-09-14 17:52
 **/


public class Solution117 {
    /**
     * 思路：
     * 自顶向下递归构建next，分为以下几步：
     * 构建当前节点的左节点：
     * 1.1. 如果root有左节点和右节点，则左节点的Next为右节点
     * 1.2. 如果root右节点为Null，则查找父节点的兄弟节点的最左边子元素
     * 构建当前节点的右节点：
     * 2.1. 如果root右节点不为Null，则next为父节点的兄弟节点的最左边子元素
     * 递归：
     * 这里注意一定要先构建右子树，再构建左子树，
     * 因为寻找父节点的兄弟节点是从左到右遍历的，如果右子树未构建好就遍历，则会出错
     * 如果不考虑常数空间复杂度的情况下，也可以使用层序遍历，套模板就行

     */
    public Node connect(Node root) {
        if (root==null) {
            return null;
        }
        if (root.left!=null){
            if (root.right!=null){
                root.left.next=root.right;
            }else{
                root.left.next=findLeftChild(root);
            }
        }
        if(root.right!=null){
            root.right.next=findLeftChild(root);
        }
        connect(root.right);
        connect(root.left);
        return root;
    }
    private Node findLeftChild(Node root){
        if (root.next==null){
            return null;
        }
        while (root.next!=null){
            if (root.next.left!=null){
                return root.next.left;
            }
            if (root.next.right!=null){
                return root.next.right;
            }
            root=root.next;
        }
        return null;
    }
}