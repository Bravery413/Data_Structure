package leetCode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: Bravery
 * @create: 2019-09-12 17:19
 **/


public class Solution102 {
    /**
     * 递归:
     * 最简单的解法就是递归，
     * 首先确认树非空，
     * 然后调用递归函数 helper(node, level)，参数是当前节点和节点的层次。
     * 程序过程如下：
     * 输出列表称为 levels，当前最高层数就是列表的长度 len(levels)。
     * 比较访问节点所在的层次 level 和当前最高层次 len(levels) 的大小，如果前者更大就向 levels 添加一个空列表。
     * 将当前节点插入到对应层的列表 levels[level] 中。
     * 递归非空的孩子节点：helper(node.left / node.right, level + 1)。
     */
    ArrayList<List<Integer>> levels = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) return levels;
        helper(root, 0);
        return levels;

    }

    public void helper(TreeNode node, int level) {
        if (levels.size() == level) {
            levels.add(new ArrayList<>());
        }
        levels.get(level).add(node.val);

        if (node.left != null) {
            helper(node.left, level + 1);
        }
        if (node.right != null) {
            helper(node.right, level + 1);
        }
    }

    /**
     * 迭代:
     * 我们将树上顶点按照层次依次放入队列结构中，队列中元素满足 FIFO（先进先出）的原则。
     * 在 Java 中可以使用 Queue 接口中的 LinkedList实现。
     * <p>
     * 第 0 层只包含根节点 root ，算法实现如下：
     * 初始化队列只包含一个节点 root 和层次编号 0 ： level = 0。
     * 当队列非空的时候：
     * 在输出结果 levels 中插入一个空列表，开始当前层的算法。
     * 计算当前层有多少个元素：等于队列的长度。
     * 将这些元素从队列中弹出，并加入 levels 当前层的空列表中。
     * 将他们的孩子节点作为下一层压入队列中。
     * 进入下一层 level++。
     */
    public static List<List<Integer>> levelOrder1(TreeNode root) {
        ArrayList<List<Integer>> levels = new ArrayList<>();
        if (root == null) {
            return levels;
        }
        Queue<TreeNode> quene = new LinkedList<>();
        quene.add(root);
        int level = 0;
        while (!quene.isEmpty()) {
            levels.add(new ArrayList<>());
            int level_length = quene.size();
            for (int i = 0; i < level_length; i++) {
                TreeNode node = quene.remove();
                levels.get(level).add(node.val);
                if (node.left != null) {
                    quene.add(node.left);
                }
                if (node.right != null) {
                    quene.add(node.right);
                }
            }
            level++;
        }
        return levels;
    }
    public static void main(String[] args) {
        TreeNode head = new TreeNode(3);
        head.left = new TreeNode(9);
        head.right = new TreeNode(20);
        TreeNode cur = head.right;
        cur.left = new TreeNode(15);
        cur.right = new TreeNode(7);
        List<List<Integer>> res = levelOrder1(head);
        System.out.println(res);
    }
}
