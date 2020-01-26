package offer;

/**
 * 二叉树的镜像
 */
public class Question36 {
    /**
     * 递归思想，都是左右节点互换
     * @param root
     */
    public static void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }
    public static void print(TreeNode root){
        if (root==null){
            return;
        }
        System.out.println(root.val);
        print(root.left);
        print(root.right);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
        Mirror(root);
        print(root);
    }
}
