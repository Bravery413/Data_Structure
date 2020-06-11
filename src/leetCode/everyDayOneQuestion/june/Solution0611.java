package leetCode.everyDayOneQuestion.june;

import java.util.Arrays;
import java.util.Stack;

/**
 * 每日温度
 * 请根据每日 气温 列表，重新生成一个列表。对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。
 * 如果气温在这之后都不会升高，请在该位置用 0 来代替。
 *
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
 *

 */
public class Solution0611 {
    /**
     * 常规思路
     *
     * @param T
     * @return
     */
    public static int[] dailyTemperatures1(int[] T) {
        if (T == null || T.length == 0) {
            return new int[0];
        }
        int last = 0;
        int pre = 0;
        int[] res = new int[T.length];
        while (last < T.length) {
            pre++;
            if (pre >= T.length) {
                res[last] = 0;
                last++;
                pre = last;
            } else if (T[pre] > T[last]) {
                res[last] = pre - last;
                last++;
                pre = last;
            }
        }
        return res;
    }

    /**
     * 单调栈解法
     *
     * @param T
     * @return
     */
    public static int[] dailyTemperatures2(int[] T) {
        if (T == null || T.length == 0) {
            return null;
        }
        int[] res = new int[T.length];
        //栈存储下标
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                res[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }

    /**
     * 超级解法:
     * 突破口->从后往前,这样可以跳着找到比自己大的日子下标
     * 自己的后一天是:一步
     * 自己的后一天不是:则后一天比它自己大的日子和自己比较
     *
     * @param T
     * @return
     */
    public static int[] dailyTemperatures(int[] T) {
        if (T == null) {
            return null;
        }
        int[] res = new int[T.length];
        for (int i = T.length - 2; i >= 0; i--) {
            //取自己后一位和自己比较
            int j = i + 1;
            //为了跳着找
            while (true) {
                if (T[i] < T[j]) {
                    //后一位比自己大,直接赋值1
                    res[i] = 1;
                    break;
                } else if (T[j] == 0) {
                    //这种情况是自己大于后一位,后一位是后面最大的->自己是剩余最大的:赋值0
                    T[i] = 0;
                    break;
                }
                //都不属于这种情况,那么去找比后一位大的元素去比较,而不是一个个往上比较
                j = j + res[j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] qus = {55, 38, 53, 81, 61, 93, 97, 32, 43, 78};
        System.out.println(Arrays.toString(dailyTemperatures(qus)));

        int[] test = new int[3];
        System.out.println(test[2] == 0);
    }
}
