package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void print(TreeNode root) {
        if (root == null) {
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
//        Question41 question41 = new Question41();
//        System.out.println(question41.isSymmetrical(root));
//        Question42 question42 = new Question42();
//        System.out.println(question42.Print(root));
//        Question43 question43 = new Question43();
//        System.out.println(question43.Print(root));
//        Question44 question44 = new Question44();
//        String serialize = question44.Serialize(root);
//        System.out.println(serialize);
//        TreeNode deserialize = question44.Deserialize(serialize);
//        print(deserialize);
        Question45 question45 = new Question45();
        TreeNode node = question45.KthNode(root, 3);
        System.out.println(node.val);
    }
}
