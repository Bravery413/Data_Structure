package leetcode.everyday.december.designer1.strategy;

/**
 * @author 潘勇
 * @date 2020/12/10 8:49
 */

import leetcode.everyday.december.designer1.Bill;

/**
 * 收银策略接口
 */
public interface BillStrategy {
    /**
     * 找零
     * @param bill
     */
    public boolean change(Bill bill);
}
