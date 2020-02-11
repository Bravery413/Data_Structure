package offer;

import java.util.*;

public class Test {
    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        printTree(root.left);
        System.out.println(root.val);
        printTree(root.right);
    }

    public static void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        ListNode loop = new ListNode(3);
        node.next.next = loop;
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next.next = new ListNode(5);
        printListNode(node);
        System.out.println();
        Question49 question49 = new Question49();
        ListNode res = question49.deleteDuplication(node);
        printListNode(res);


//        Question48 question48 = new Question48();
//        System.out.println(question48.EntryNodeOfLoop(node).val);


//        Question47 question47 = new Question47();
//        question47.Insert(1);
//        question47.Insert(3);
//        question47.Insert(2);
//        question47.Insert(4);
//        question47.Insert(6);
//        question47.Insert(5);
//        System.out.println(question47.GetMedian());


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
