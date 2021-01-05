package leetcode.everyday.year2021.jan;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

/**
 * @author 潘勇
 * @date 2021/1/5 8:39
 */


public class Solution0105 {

    public static void main(String[] args) {
        System.out.println(largeGroupPositions("aaa"));
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int len = s.length();
        if (len < 3) {
            return res;
        }
        Stack<Character> stack = new Stack();
        stack.push(s.charAt(0));
        for (int i = 1; i < len; i++) {
            char c = s.charAt(i);
            if (stack.peek() != c) {
                if (stack.size() >= 3) {
                    List<Integer> more = new ArrayList<>();
                    more.add(i - stack.size());
                    more.add(i - 1);
                    res.add(more);
                }
                stack.clear();
            }
            stack.push(c);
        }
        if (stack.size() >= 3) {
            List<Integer> more = new ArrayList<>();
            more.add(len - stack.size());
            more.add(len - 1);
            res.add(more);
        }
        return res;
    }
}
