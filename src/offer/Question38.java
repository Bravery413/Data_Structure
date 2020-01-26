package offer;

/**
 * 判断是否平衡二叉树
 */
public class Question38 {
    /**
     * 从上到下，会多次重复计算
     *
     * @param root
     * @return
     */
    public static boolean IsBalanced_Solution0(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftDeep = treeDept(root.left);
        int rightDeep = treeDept(root.right);
        int cul = Math.abs(leftDeep - rightDeep);
        if (cul > 1) {
            return false;
        } else {
            return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        }
    }

    public static int treeDept(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = treeDept(root.left);
        int right = treeDept(root.right);
        return left > right ? left + 1 : right + 1;
    }


    /**
     * 该为从下到上
     *
     * @param root
     * @return
     */
    public static boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        return deep(root) != -1;
    }

    /**
     * 通过return来返回深度
     *
     * @param root
     * @return
     */
    public static int deep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = deep(root.left);
        if (left == -1) {
            return -1;
        }
        int right = deep(root.right);
        if (right == -1) {
            return -1;
        }
        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
    }

    /**
     * 通过参数来传递深度
     *
     * @param root
     * @return
     */
    public static int deep(TreeNode root, int dept) {
        if (root == null) {
            return 0;
        }
        int left = deep(root.left);
        if (left == -1) {
            return -1;
        }
        int right = deep(root.right);
        if (right == -1) {
            return -1;
        }
        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
    }

    public static void main(String[] args) {

    }
}
