package leetCode.everyDayOneQuestion.june;


import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * List<String> qus = Arrays.asList(str);
 * 是效率最高的，因为他不需要复制array中的内容，而是直接返回一个List,但这种方式是不能添加和删除元素的。
 *
 * 序列化其实就是遍历
 * 遍历就有----先/中/后---深度/广度----递归/迭代
 * 最简单的选用先序-深度-递归
 * 因为序列化局部变量保存结果集,所以需要创建helper
 * 因为反序列化需要一直读取数据集,也需要创建helper
 *
 */
public class Solution0616 {


    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        serHelper(res, root);
        return res.toString();
    }

    public static TreeNode serHelper(StringBuilder res, TreeNode root) {
        if (root == null) {
            res.append("#");
            res.append(",");
        } else {
            res.append(root.val);
            res.append(",");
            root.left = serHelper(res, root.left);
            root.right = serHelper(res, root.right);
        }
        return root;
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        String[] strs = data.split(",");
        ArrayList<String> qus = new ArrayList<>();
        Collections.addAll(qus, strs);
        TreeNode root = desHelper(qus);
        return root;
    }

    public static TreeNode desHelper(List<String> qus) {
        if (qus.size() >= 0) {
            String val = qus.remove(0);
            if (!"#".equals(val)) {
                TreeNode root = new TreeNode(Integer.valueOf(val));
                root.left = desHelper(qus);
                root.right = desHelper(qus);
                return root;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        String str = serialize(node1);
        System.out.println(str);
        TreeNode root = deserialize(str);
        System.out.println(111);
    }

}
