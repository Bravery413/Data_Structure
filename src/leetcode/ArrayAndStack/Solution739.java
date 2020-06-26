package leetcode.ArrayAndStack;

import java.util.Stack;

/**
 * @author bravery
 * @date 2019/8/21 7:41
 */

/**
 * 思路:
 * 逆序遍历,才能预测未来
 * 创建一个res结果数组 每遍历一次得出结果存储,创建一个栈,非递增顺序存储高温下标
 * 往前遍历 取出温度和栈顶循环比 如果比栈顶高温 出栈直到非递增序列
 * 然后res[i]=stack.isEmpty)?0:stack.peek()-i;相隔日期
 */
public class Solution739 {
    public int[] dailyTemperatures(int[] T) {
        int[] res=new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i=T.length-1;i>=0;i--){
            while (!stack.isEmpty()&&T[i]>=T[stack.peek()]){
                stack.pop();
            }
            res[i]=stack.isEmpty()?0:stack.peek()-i;
            stack.push(i);
        }
        return res;
    }

}
