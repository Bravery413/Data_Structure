package leetCode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author: Bravery
 * @create: 2019-09-12 09:08
 **/


public class Solution145 {
    public static List<Integer> postorderTraversal(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<>();
        if (root==null){
            return res;
        }
        TreeNode cur=root;
        helper(cur,res);
        return res;
    }
    public static void helper(TreeNode root, ArrayList<Integer> res){
        if (root.left!=null){
            helper(root.left,res);
        }
        if (root.right!=null){
            helper(root.right,res);
        }
        res.add(root.val);
    }

    /**
     * 从根节点开始依次迭代，弹出栈顶元素输出到输出列表中，
     * 然后依次压入它的所有孩子节点，
     * 按照从上到下、从左至右的顺序依次压入栈中。
     *
     * 因为深度优先搜索后序遍历的顺序是从下到上、从左至右，所以需要将输出列表逆序输出。
     *
     */

    public static List<Integer> postorderTraversal1(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> output = new LinkedList<>();
        if(root==null){
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            output.addFirst(node.val);
            if (node.left!=null){
                stack.add(node.left);
            }
            if (node.right!=null){
                stack.add(node.right);
            }
        }
        return output;
    }
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = null;
        head.right = new TreeNode(2);
        TreeNode cur = head.right;
        cur.left = new TreeNode(3);
        List<Integer> res = postorderTraversal1(head);
        System.out.println(res);
    }
}
