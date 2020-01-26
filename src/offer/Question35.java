package offer;

/**
 * 树的子结构
 */
public class Question35 {
    /**
     * 递归root1找到与roo2根节点相同的节点
     * 这里会遍历完整个root1
     * @param root1
     * @param root2
     * @return
     */
    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null || root1 == null && root2 != null) {
            return false;
        }
        boolean flag = false;
        if (root1.val == root2.val) {
            flag = isSubtree(root1, root2);
        }
        if (!flag) {
            flag = HasSubtree(root1.left, root2);
            if (!flag) {
                flag = HasSubtree(root1.right, root2);
            }
        }
        return flag;
    }

    /**
     * 找到root2第一个相等的根节点后
     * 递归判断root2剩下的节点是否一致
     * @param root1
     * @param root2
     * @return
     */
    public static boolean isSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1==null&&root2!=null){
            return false;
        }
        if (root1.val == root2.val) {
            return isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
