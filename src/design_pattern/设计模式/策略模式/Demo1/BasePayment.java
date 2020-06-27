package design_pattern.设计模式.策略模式.Demo1;

/**
 * @author 潘勇
 * @date 2020/6/27 13:53
 *
 * 抽象类不能有具体的实现
 * 继承抽象类必须实现自己的全部抽象方法
 * 非抽象方法不用
 */

public abstract class BasePayment {
    /**
     * 支付方式
     * @return 支付方式
     */
    public abstract String getPayType();

    /**
     * 查询余额
     * @param uid 用户id
     * @return 余额
     */
    public abstract Double queryBalance(String uid);

    public PayState pay(String uid, Double money) {
        if (queryBalance(uid) < money) {
            return new PayState(500, "支付失败", "余额不足");
        } else {
            return new PayState(200, "支付成功", "支付金额" + money);
        }
    }

}
