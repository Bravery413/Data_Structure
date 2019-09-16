package leetCode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static leetCode.tree.Solution144.preorderTraversal;

/**
 * @author: Bravery
 * @create: 2019-09-12 08:42
 **/


public class Solution94 {
    /**
     * 递归
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;

    }

    public static void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }

    /**
     * 迭代--栈辅助:
     * 1. 遍历整个树
     * 2. 遍历整个左边,穷尽为止
     * 3. 一旦到左孩子是空,出栈,输出中序节点,然后遍历右边
     */
    public static List<Integer> inorderTraversal1(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr=root;
        while (curr!=null||!stack.isEmpty()){
            while (curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            res.add(curr.val);
            curr=curr.right;
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = null;
        head.right = new TreeNode(2);
        TreeNode cur = head.right;
        cur.left = new TreeNode(3);
        List<Integer> res = inorderTraversal1(head);
        System.out.println(res);
    }
}
