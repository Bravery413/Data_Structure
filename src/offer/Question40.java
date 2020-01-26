package offer;

import static sun.misc.Version.print;

/**
 * 二叉树的下一个结点
 */
public class Question40 {
    public static TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        //如果有右子树
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        }
        //如果没有右子树，寻找父节点，直到当前节点是左子树
        while (pNode.next != null) {
            if (pNode.next.left == pNode) {
                return pNode.next;
            }
            pNode = pNode.next;
        }
        return null;
    }

    public static void middlePrint(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        middlePrint(root.left);
        System.out.print(root.val);
        middlePrint(root.right);
    }

    public static void main(String[] args) {
        TreeLinkNode root = new TreeLinkNode(1);
        root.left = new TreeLinkNode(2);
        root.right = new TreeLinkNode(3);
        root.left.left = new TreeLinkNode(4);
        root.left.right = new TreeLinkNode(5);
        root.right.left = new TreeLinkNode(6);
        root.right.right = new TreeLinkNode(7);
        root.left.right.left = new TreeLinkNode(8);
        root.left.right.right = new TreeLinkNode(9);
        //428591637
        middlePrint(root);
    }
}
