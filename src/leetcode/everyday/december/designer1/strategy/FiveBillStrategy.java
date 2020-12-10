package leetcode.everyday.december.designer1.strategy;

import leetcode.everyday.december.designer1.Bill;
import leetcode.everyday.december.designer1.strategy.BillStrategy;

/**
 * @author 潘勇
 * @date 2020/12/10 8:49
 */


public class FiveBillStrategy implements BillStrategy {

    /**
     * 找银：
     * 收银5元策略：自己钱包多一张5块；
     */
    @Override
    public boolean change(Bill bill) {
        bill.setFive(bill.getFive()+1);
        return true;
    }
}
