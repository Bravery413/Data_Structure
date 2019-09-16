package leetCode.tree;

import com.sun.org.apache.regexp.internal.RE;
import linearList.LinkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author: Bravery
 * @create: 2019-09-12 08:14
 **/


public class Solution144 {
    /**
     * 迭代写法(DFS--栈):
     * 1. 每次迭代弹出栈顶元素
     * 2. 并将孩子节点压栈,先压右在押左
     * 顺序:顶->底 左->右
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.add(node.val);
            //先压右孩子,因为要先输出左边
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return output;
    }

    /**
     * 递归写法:
     */

    public static List<Integer> preorderTraversal1(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public static void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            if (root.left != null) {
                helper(root.left, res);
            }
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }


    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = null;
        head.right = new TreeNode(2);
        TreeNode cur = head.right;
        cur.left = new TreeNode(3);
        List<Integer> res = preorderTraversal1(head);
        System.out.println(res);
    }
}
