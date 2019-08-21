package leetCode.hash;

import java.util.HashSet;
import java.util.Map;

/**
 * @author bravery
 * @date 2019/8/21 15:24
 */
public class Solution202 {
    /**
     *用hash唯一来判断无限循环出口
     * 如何循环遍历一个数每一位数的操作
     * 取一个m=0 累加 然后自己余 然后除 只要大于0做循环
     */
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int m = 0;
        while (true) {
            while (n > 0) {
                m += (int) Math.pow(n % 10, 2);
                n /= 10;
            }
            if (m == 1) {
                return true;
            }
            if (set.contains(m)) {
                return false;
            }
            set.add(m);
            n = m;
            m=0;
        }
    }

}
