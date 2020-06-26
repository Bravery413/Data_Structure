package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Bravery
 * @create: 2019-09-14 10:27
 **/


public class Test {
    List<List<Integer>> res = new ArrayList<>();
    public  List<List<Integer>> levelOrder(TreeNode root) {
       if (root==null){
           return res;
       }
       helper(root,0);
       return res;
    }
    private void helper(TreeNode root,int level){
        if (res.size()==level){
            res.add(new ArrayList<Integer>());
        }
        res.get(level).add(root.val);
        if (root.left!=null)
        helper(root.left,level+1);
        if (root.right!=null)
        helper(root.right,level+1);
    }



}
