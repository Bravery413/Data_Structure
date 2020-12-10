package leetcode.everyday.december.designer1.strategy;

/**
 * @author 潘勇
 * @date 2020/12/10 9:00
 */

import leetcode.everyday.december.designer1.Bill;
import leetcode.everyday.december.designer1.strategy.BillStrategy;

/**
 * 20元面值
 */
public class TwentyStrategy implements BillStrategy {
    /**
     * 找零：20元面值
     * 1张10和一张5找零
     * 3张5找零
     * 否则找不了
     * @param bill
     * @return
     */
    @Override
    public boolean change(Bill bill) {
        int fiveNum = bill.getFive();
        int tenNum = bill.getTen();
        if (fiveNum > 0 && tenNum > 0) {
            bill.setFive(fiveNum - 1);
            bill.setTen(tenNum - 1);
        } else if (fiveNum >= 3) {
            bill.setFive(tenNum - 3);
        } else {
            return false;
        }
        return true;
    }
}
