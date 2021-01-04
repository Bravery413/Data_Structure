package leetcode.everyday.year2020.otb;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Bravery
 * @create: 2020-10-27 21:38
 **/


public class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        return list;
    }
    private void dfs(TreeNode root,List<Integer> res){
        if (root==null){
            return;
        }
        res.add(root.val);
        dfs(root.left,res);
        dfs(root.right,res);
    }



}
