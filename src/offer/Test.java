package offer;

public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(5);
        Question41 question41 = new Question41();
        System.out.println(question41.isSymmetrical(root));
    }
}
