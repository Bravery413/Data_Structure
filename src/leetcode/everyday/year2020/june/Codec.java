package leetcode.everyday.year2020.june;

import java.util.ArrayList;
import java.util.List;

public class Codec {

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        serHelper(res, root);
        return res.toString();
    }

    public static void serHelper(StringBuilder res, TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            res.append(root.val);
            serHelper(res, root.left);
            serHelper(res, root.right);
        } else {
            System.out.println("#");
            res.append("#");
        }
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        ArrayList<Character> chars = new ArrayList<>();
        for (char c : data.toCharArray()) {
            chars.add(c);
        }
        if (data == null || data.length() == 0) {
            return null;
        }
        return desHelper(chars);
    }

    public static TreeNode desHelper(List<Character> data) {
        if (data.size()==0){
            return null;
        }
        if ('#' == data.get(0)) {
            data.remove(0);
            return null;
        }
        Integer val;
        if ('-' == data.get(0)) {
            data.remove(0);
            val= Integer.valueOf(data.get(0).toString());
            val = -val;
        }else {
            val = Integer.valueOf(data.get(0).toString());
        }
        TreeNode root = new TreeNode(val);
        data.remove(0);
        root.left = desHelper(data);
        root.right = desHelper(data);
        return root;
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
