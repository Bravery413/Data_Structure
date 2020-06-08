package leetCode.everyDayOneQuestion.june;

/**
 * 给定一个由表示变量之间关系的字符串方程组成的数组，
 * 每个字符串方程 equations[i] 的长度为 4，并采用两种不同的形式之一："a==b" 或 "a!=b"。
 * 在这里，a 和 b 是小写字母（不一定不同），表示单字母变量名。
 * 只有当可以将整数分配给变量名，以便满足所有给定的方程时才返回 true，否则返回 false。 
 * 示例 1：
 * <p>
 * 输入：["a==b","b!=a"]
 * 输出：false
 * 解释：如果我们指定，a = 1 且 b = 1，那么可以满足第一个方程，但无法满足第二个方程。没有办法分配变量同时满足这两个方程。
 */
public class Solution0608 {
    /**
     * 并查集:
     * 一.数组构建树:下标是节点的值,值是父节点.例如:parent[3]=5   人为定义3的父亲是5
     * 二.解法:
     * 1.构建26字母长数组,并让每个节点父亲都是自己
     * 2.遍历相等的等式,让左边的根节点是右边的根节点的父节点.(同时缩短树高度:parent[index]=parent[parent[index]])
     * 3.遍历不等的式子:如果左边的根等于右边的根,return false;
     * 4.最后return true;
     *
     * @param equations
     * @return
     */
    public boolean equationsPossible(String[] equations) {
        int[] parent = new int[26];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        for (String equation : equations) {
            if (equation.charAt(1) == '=') {
                int index1 = equation.charAt(0) - 'a';
                int index2 = equation.charAt(3) - 'a';
                union(parent, index1, index2);
            }
        }
        for (String equation : equations) {
            if (equation.charAt(1) == '!') {
                int index1 = equation.charAt(0) - 'a';
                int index2 = equation.charAt(3) - 'a';
                if (find(parent, index1) == find(parent, index2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
    }

    public int find(int[] parent, int index) {
        while (parent[index] != index) {
            parent[index] = parent[parent[index]];
            index = parent[index];
        }
        return index;
    }
}
