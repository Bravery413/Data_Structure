package leetcode.everyday.december;

import java.util.HashSet;
import java.util.Stack;

/**
 * @author: Bravery
 * @create: 2020-12-20 20:40
 **/


public class Solution1220 {

    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }


    public static String removeDuplicateLetters(String s) {
        int len = s.length();
        char[] charArray = s.toCharArray();
        int[] lastIndex = new int[26];
        //保存每个字符最后出现的位置
        for (int i = 0; i < len; i++) {
            lastIndex[charArray[i] - 'a'] = i;
        }
        boolean[] visited =new boolean[26];
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<len;i++){
            //在栈中的直接忽略
            if (visited[charArray[i]-'a']){
                continue;
            }
            //如果栈顶元素和当前元素比不是字典序(bc<-a),且栈顶元素(c)后面还会出现.则删除栈顶元素
            while (!stack.isEmpty()&&stack.peek()>charArray[i]&&lastIndex[stack.peek()-'a']>i){
                Character pop = stack.pop();
                visited[pop-'a']=false;
            }
            stack.push(charArray[i]);
            visited[charArray[i]-'a']=true;
        }
        StringBuilder sb = new StringBuilder();
        for (char c:stack){
            sb.append(c);
        }
        return sb.toString();
    }


    /**
     * 还是不对
     *
     * @param s
     * @return
     */
    public static String removeDuplicateLetters2(String s) {
        char[] chars = s.toCharArray();
        StringBuilder strs = new StringBuilder();
        boolean f1 = false;
        boolean f2 = false;
        char c1, c2;
        for (int i = 0; i < chars.length; i++) {
            c1 = chars[i];
            for (int j = i + 1; j < chars.length; j++) {
                c2 = chars[j];
                if (c1 > c2) {
                    f1 = true;
                }
                if (c1 == c2) {
                    f2 = true;
                }
            }
            if (f1 && f2) {
                f1 = false;
                f2 = false;
            } else {
                f1 = false;
                f2 = false;
                strs.append(c1);
            }

        }
        return strs.toString();
    }


    /**
     * 不符合规则
     *
     * @param s
     * @return
     */
    public static String removeDuplicateLetters1(String s) {
        boolean[] map = new boolean[26];
        for (char c : s.toCharArray()) {
            map[c - 'a'] = true;
        }
        StringBuilder strs = new StringBuilder();
        for (int i = 0; i < map.length; i++) {
            if (map[i]) {
                strs.append((char) (i + 'a' ));
            }
        }

        return strs.toString();
    }
}
