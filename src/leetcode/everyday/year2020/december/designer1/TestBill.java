package leetcode.everyday.year2020.december.designer1;

/**
 * @author 潘勇
 * @date 2020/12/10 9:01
 */

import leetcode.everyday.year2020.december.designer1.factory.BillStrategyFactory;
import leetcode.everyday.year2020.december.designer1.strategy.*;

/**
 * 策略模式：方便扩展，职责单一
 * 如果再有50面值，100面值，直接加策略类
 * 如果再有1元面值的，全部都需要加一个共同逻辑：最后情况加一个有没有足够数量的1元
 */
public class TestBill {
    public static void main(String[] args) {
        System.out.println(lemonadeChange2(new int[]{5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5}));
    }

    /**
     * 单独策略模式
     *
     * @param bills
     * @return
     */
    public static boolean lemonadeChange(int[] bills) {
        new BillStrategyHelper(new FiveBillStrategy());
        Bill bill = new Bill();
        boolean result = false;
        BillStrategy billStrategy;
        for (int b : bills) {
            if (b == 5) {
                billStrategy = new FiveBillStrategy();
            } else if (b == 10) {
                billStrategy = new TenBillStrategy();
            } else if (b == 20) {
                billStrategy = new TwentyStrategy();
            } else {
                return false;
            }
            BillStrategyHelper strategyHelper = new BillStrategyHelper(billStrategy);
            result = strategyHelper.doChange(bill);
            if (!result) {
                return false;
            }
        }
        return result;
    }

    public static boolean lemonadeChange1(int[] bills) {
        new BillStrategyHelper(new FiveBillStrategy());
        Bill bill = new Bill();
        boolean result = false;
        BillStrategy billStrategy;
        BillStrategy fiveBillStrategy = new FiveBillStrategy();
        BillStrategy tenBillStrategy = new TenBillStrategy();
        BillStrategy twentyStrategy = new TwentyStrategy();
        for (int b : bills) {
            if (b == 5) {
                billStrategy = fiveBillStrategy;
            } else if (b == 10) {
                billStrategy = tenBillStrategy;
            } else if (b == 20) {
                billStrategy = twentyStrategy;
            } else {
                return false;
            }
            BillStrategyHelper strategyHelper = new BillStrategyHelper(billStrategy);
            result = strategyHelper.doChange(bill);
            if (!result) {
                return false;
            }
        }
        return result;
    }

    /**
     * 工厂+策略
     *
     * @param bills
     * @return
     */
    public static boolean lemonadeChange2(int[] bills) {
        new BillStrategyHelper(new FiveBillStrategy());
        Bill bill = new Bill();
        boolean result = false;
        BillStrategyFactory strategyFactory = new BillStrategyFactory();
        for (int b : bills) {
            BillStrategyHelper strategyHelper = new BillStrategyHelper(strategyFactory.getBillStrategy(b));
            result = strategyHelper.doChange(bill);
            if (!result) {
                return false;
            }
        }
        return result;
    }


}
