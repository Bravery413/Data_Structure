package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 按之字形顺序打印二叉树
 */
public class Question43 {
    /**
     * 队列迭代层序遍历
     *
     * @param pRoot
     * @return
     */
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null) {
            return result;
        }
        ArrayList<Integer> curLine;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(pRoot);
        int rows = 1;
        while (nodes.size() != 0) {
            curLine = new ArrayList<Integer>();
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.poll();
                if (rows % 2 == 1) {
                    curLine.add(node.val);//单行，从左往后：尾插进去，最后插在最后面
                } else {
                    curLine.add(0, node.val);//偶数行,从右往左头插进去，最后插在最前面
                }
                if (node.left != null) {
                    nodes.offer(node.left);
                }
                if (node.right != null) {
                    nodes.offer(node.right);
                }
            }
            rows++;
            result.add(curLine);
        }
        return result;
    }
}
