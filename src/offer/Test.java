package offer;

import java.util.*;

public class Test {
    public static void print(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.println(root.val);
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

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                new Comparator<Integer>() { //大顶堆，容量11
                    @Override
                    public int compare(Integer i1, Integer i2) {
                        return i2 - i1;
                    }
                });
        maxHeap.add(1);
        maxHeap.add(3);
        maxHeap.add(2);
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());


//        Question46 question46 = new Question46();
//        int i = question46.curRope(7);
//        System.out.println(i);


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
//        Question45 question45 = new Question45();
//        System.out.println(question45.KthNode(root,3).val);
//        print(root);
//        TreeNode node = question45.KthNode(root, 3);
//        System.out.println(node.val);


    }
}
