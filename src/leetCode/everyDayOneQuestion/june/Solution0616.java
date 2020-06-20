package leetCode.everyDayOneQuestion.june;


public class Solution0616 {


    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        return "";
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        return null;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(8);
        TreeNode node5 = new TreeNode(10);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        String str = serialize(node1);
        TreeNode node = deserialize(str);
        System.out.println(node);
    }

}
