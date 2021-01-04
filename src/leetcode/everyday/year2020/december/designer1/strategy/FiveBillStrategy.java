package leetcode.everyday.year2020.december.designer1.strategy;

import leetcode.everyday.year2020.december.designer1.Bill;

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
