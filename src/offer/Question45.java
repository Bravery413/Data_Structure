package offer;

import java.util.ArrayList;

/**
 * 二叉搜索树的第k个节点
 */
public class Question45 {

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (k<=0){
            return null;
        }
        ArrayList<TreeNode> nodes = new ArrayList<>();
        middlePrint(pRoot,nodes);
        if (k>=nodes.size()){
            return null;
        }
        return nodes.get(k-1);
    }

    void middlePrint(TreeNode node, ArrayList<TreeNode> nodes) {
        if (node == null) {
            return;
        }
        middlePrint(node.left,nodes);
        nodes.add(node);
        middlePrint(node.right,nodes);
    }
}
