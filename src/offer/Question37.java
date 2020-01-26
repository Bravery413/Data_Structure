package offer;

/**
 * 二叉树的深度
 */
public class Question37 {
    static int deep = 0;

    /**
     * 从打印路径联想到可以传递参数去记录深度
     *
     * @param root
     * @return
     */
    public static int TreeDepth0(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            int cur = 0;
            print(root, cur);
            return deep;
        }
    }

    public static void print(TreeNode root, int cur) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        cur++;
        if (cur > deep) {
            deep = cur;
        }
        print(root.left, cur);
        print(root.right, cur);
    }

    /**
     * 标准的递归解决
     * 还是拆分子问题的思想， 树的深度由左边和右边较大的+1，依次拆分子问题
     * @param root
     * @return
     */
    public static int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return left >= right ? left+1 : right+1;
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(8);
//        root.left = new TreeNode(6);
//        root.right = new TreeNode(10);
//        root.left.left = new TreeNode(5);
//        root.left.right = new TreeNode(7);
//        root.right.left = new TreeNode(9);
//        root.right.right = new TreeNode(11);
        TreeNode root = new TreeNode(1);
        System.out.println(TreeDepth(root));
    }
}
