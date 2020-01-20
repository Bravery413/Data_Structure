package offer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question20 {
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);
        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]) {
                root.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                root.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
            }
        }
        return root;
    }

    /**
     * 递归遍历一颗树  (前中后序)---这个是深搜----对应栈
     *
     * @param root
     */
    public static void read(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);//前序
            read(root.left);
//            System.out.println(root.val);//中序
            read(root.right);
//            System.out.println(root.val);//后序
        }
    }

    /**
     * 迭代 深搜---栈--前序
     *
     * @param root
     */
    public static void DFS(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.println(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }


        }
//        从右往左遍历的一种实现方式
//        while (stack.size()!=0){
//            TreeNode node = stack.pop();
//            System.out.println(node.val);
//            if (node.left!=null){
//                stack.push(node.left);
//            }
//            if (node.right!=null){
//                stack.push(node.right);
//            }
//
//        }

    }

    /**
     * 迭代--广搜--队列
     *
     * @param root
     */
    public static void BFS(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

    }


    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode treeNode = reConstructBinaryTree(pre, in);
        BFS(treeNode);
    }
}
