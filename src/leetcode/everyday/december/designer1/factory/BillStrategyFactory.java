package leetcode.everyday.december.designer1.factory;

import leetcode.everyday.december.designer1.strategy.BillStrategy;
import leetcode.everyday.december.designer1.strategy.FiveBillStrategy;
import leetcode.everyday.december.designer1.strategy.TenBillStrategy;
import leetcode.everyday.december.designer1.strategy.TwentyStrategy;

/**
 * @author 潘勇
 * @date 2020/12/10 9:29
 */


public class BillStrategyFactory {
    //五元面值
    public static final Integer fiveBill = 5;
    //10元面值
    public static final Integer tenBill = 10;
    //20元面值
    public static final Integer twentyBill = 20;


    public BillStrategy getBillStrategy(int billType) {
        if (fiveBill.equals(billType)) {
            return new FiveBillStrategy();
        } else if (tenBill.equals(billType)) {
            return new TenBillStrategy();
        } else if (twentyBill.equals(billType)) {
            return new TwentyStrategy();
        }
        return null;
    }
}
