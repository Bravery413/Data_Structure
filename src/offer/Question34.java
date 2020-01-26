package offer;

import java.util.ArrayList;

/**
 * 二叉树中和为某一值的路径
 */
public class Question34 {
    static ArrayList<ArrayList<Integer>> resList = new ArrayList<>();

    /**
     * 学到一个可以传递路径(path[])，和深度的index的方法
     * @param root
     * @param target
     * @return
     */
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        if (root == null) {
            return resList;
        }
        int curSum = 0;
        int index = 0;
        int[] path = new int[1000];
        isTargetPath(root, target, curSum, path, index);
        System.out.println(resList);
        return resList;
    }

    public static void isTargetPath(TreeNode eleNode, int target, int curSum, int[] path, int index) {
        if (eleNode == null) {
            return;
        }
        curSum += eleNode.val;
        path[index] = eleNode.val;
        index++;
        if (curSum == target && eleNode.left == null && eleNode.right == null) {
            ArrayList<Integer> pathList = new ArrayList<>();
            for (int i = 0; i < index; i++) {
                pathList.add(path[i]);
            }
            resList.add(pathList);
            return;
        }
        if (curSum < target && eleNode.left != null) {
            isTargetPath(eleNode.left, target, curSum, path, index);
        }
        if (curSum < target && eleNode.right != null) {
            isTargetPath(eleNode.right, target, curSum, path, index);
        }

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(5);
        root.left = left;
        root.right = new TreeNode(12);
        left.left = new TreeNode(4);
        left.right = new TreeNode(7);
        FindPath(root, 15);
    }
}
