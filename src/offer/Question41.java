package offer;

import java.util.ArrayList;

/**
 * 对称二叉树
 */
public class Question41 {
    public ArrayList<Integer> left = new ArrayList<>();
    public ArrayList<Integer> right = new ArrayList<>();

    /**
     * 发现规律，让往左和往右前序遍历的值相同便解答
     *
     * @param pRoot
     * @return
     */
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        readLeft(pRoot);
        readRight(pRoot);
        if (left.size() != right.size()) {
            return false;
        }
        for (int i = 0; i < left.size(); i++) {
            if (left.get(i) != right.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void readLeft(TreeNode root) {
        if (root == null) {
            left.add(0);
        } else {
            left.add(root.val);
            readLeft(root.right);
            readLeft(root.left);
        }

    }

    public void readRight(TreeNode root) {
        if (root == null) {
            right.add(0);
        } else {
            right.add(root.val);
            readRight(root.left);
            readRight(root.right);
        }

    }


}
