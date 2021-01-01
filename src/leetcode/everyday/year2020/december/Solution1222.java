package leetcode.everyday.year2020.december;

import java.util.*;

/**
 * @author 潘勇
 * @date 2020/12/22 8:45
 */


public class Solution1222 {


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> nodeList = new LinkedList<>();
        nodeList.offer(root);
        boolean isOrderLeft = true;

        while (!nodeList.isEmpty()) {

            Deque<Integer> levelList = new LinkedList<>();
            int size = nodeList.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = nodeList.poll();
                if (isOrderLeft) {
                    levelList.offerLast(curNode.val);
                } else {
                    levelList.offerFirst(curNode.val);
                }
                if (curNode.left != null) {
                    nodeList.offer(curNode.left);
                }
                if (curNode.right != null) {
                    nodeList.offer(curNode.right);
                }

            }
            res.add(new LinkedList<>(levelList));
            isOrderLeft = !isOrderLeft;
        }
        return res;
    }


    public List<List<Integer>> zigzagLevelOrder0(TreeNode root) {

        //创建答案容器+判空
        List<List<Integer>> res = new LinkedList<>();
        if (res == null) {
            return res;
        }
        //根节点加入Queue队列，定义左右方向
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        boolean isOrderLeft = true;

        //主逻辑:   Deque双端队列
        // 1. 队列有元素，创建此次放入结果集队列。
        // 2. 遍历每一层
        // 【当前层的当前节点】：向左当前方向则反着放，向右则顺序放
        // 【当前节点子节点】则放入队列。
        // 最后输出答案
        while (!nodeQueue.isEmpty()) {
            Deque<Integer> leverList = new LinkedList<>();
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = nodeQueue.poll();
                if (isOrderLeft) {
                    leverList.offerLast(curNode.val);
                } else {
                    leverList.offerFirst(curNode.val);
                }
                if (curNode.left != null) {
                    nodeQueue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    nodeQueue.offer(curNode.right);
                }
            }
            res.add(new LinkedList<>(leverList));
            isOrderLeft = !isOrderLeft;
        }
        return res;
    }
}
