package leetcode;


import java.util.HashMap;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class Solution20 {
//    private HashMap<Character, Character> mappings;
//
//    public Solution20() {
//        this.mappings = new HashMap<Character, Character>();
//        this.mappings.put(')', '(');
//        this.mappings.put('}', '{');
//        this.mappings.put(']', '[');
//    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        Stack<Character> stack = new Stack<>();
        //遍历字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //如果匹配某个右括号
            if (mappings.containsKey(c)) {
                //匹配上出栈,不匹配直接返回false
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(c)) {
                    return false;
                }
                //左括号进栈
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{()}[]}{}{";
        boolean valid = isValid(str);
        System.out.println(valid);
    }
}
/**
 * 总结
 * 时间空间复杂度O(n)
 * 1. char的包装类Character,for遍历
 * 2. hashMap
 * 3. stack pop出栈 push入栈 peek查看 empty栈顶元素是否空 isEmpty栈是否空
 */
