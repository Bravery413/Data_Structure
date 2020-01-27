package offer;

/**
 * 序列化二叉树:把非线性的用线性表示
 */
public class Question44 {
    String Serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        print(root, sb);
        return sb.toString();
    }

    void print(TreeNode node, StringBuffer sb) {
        if (node == null) {
            sb.append("#,");
        } else {
            sb.append(node.val + ",");
            print(node.left, sb);
            print(node.right, sb);
        }

    }

    //865##7##67##5##
    TreeNode Deserialize(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String[] strs = str.split(",");
        TreeNode root = write(strs);
        return root;
    }

    private int index = -1;

    TreeNode write(String[] strs) {
        ++index;
        if (!strs[index].equals("#")) {
            TreeNode root = new TreeNode(Integer.parseInt(strs[index]));
            root.left = write(strs);
            root.right = write(strs);
            return root;
        }
        return null;
    }

}
