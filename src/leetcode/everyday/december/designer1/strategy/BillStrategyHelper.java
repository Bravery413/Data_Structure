package leetcode.everyday.december.designer1.strategy;

/**
 * @author 潘勇
 * @date 2020/12/10 9:07
 */

import leetcode.everyday.december.designer1.Bill;
import leetcode.everyday.december.designer1.strategy.BillStrategy;

/**
 * 策略类帮助类，这边new的时候选择具体的策略类
 */
public class BillStrategyHelper {
    private BillStrategy billStrategy;

    public BillStrategyHelper(BillStrategy billStrategy) {
        this.billStrategy = billStrategy;
    }

    public boolean doChange(Bill bill) {
        return billStrategy.change(bill);
    }


}
