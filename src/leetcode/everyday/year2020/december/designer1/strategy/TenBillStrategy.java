package leetcode.everyday.year2020.december.designer1.strategy;

/**
 * @author 潘勇
 * @date 2020/12/10 8:55
 */

import leetcode.everyday.year2020.december.designer1.Bill;

/**
 * 收取10元面值策略
 */
public class TenBillStrategy implements BillStrategy {

    /**
     * 找零：需要找5元
     * 如果5元为0，返回错
     * 如果不为0，5元面值-1，10元面值+1；
     *
     * @param bill
     */
    @Override
    public boolean change(Bill bill) {
        if (bill.getFive() == 0) {
            return false;
        }
        bill.setFive(bill.getFive() - 1);
        bill.setTen(bill.getTen() + 1);
        return true;
    }
}
