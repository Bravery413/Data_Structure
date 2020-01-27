package offer;

import java.util.ArrayList;

/**
 * 把二叉树打印成多行
 */
public class Question42 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null) {
            return result;
        }
        ArrayList<TreeNode> next = new ArrayList<>();
        next.add(pRoot);
        func(result, next);
        return result;
    }

    /**
     * 递归迭代层序遍历
     * @param result
     * @param nodes
     */
    public void func(ArrayList<ArrayList<Integer>> result, ArrayList<TreeNode> nodes) {
        if (nodes.size() == 0) {
            return;
        }
        ArrayList<Integer> curLine = new ArrayList<>();
        ArrayList<TreeNode> next = new ArrayList<>();
        for (TreeNode node : nodes) {
            curLine.add(node.val);
            if (node.left != null) {
                next.add(node.left);
            }
            if (node.right != null) {
                next.add(node.right);
            }
        }
        result.add(curLine);
        func(result, next);
    }
}
