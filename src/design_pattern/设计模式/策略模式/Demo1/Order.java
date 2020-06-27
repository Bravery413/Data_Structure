package design_pattern.设计模式.策略模式.Demo1;

/**
 * @author 潘勇
 * @date 2020/6/27 14:32
 */


public class Order {
    private String uid;
    private String orderId;
    private double money;

    public Order(String uid, String orderId, Double money) {
        this.uid = uid;
        this.orderId = orderId;
        this.money = money;
    }

    public PayState pay() {
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public PayState pay(String payKey) {
        BasePayment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payment.getPayType());
        System.out.println("本次交易金额:" + money + ",开始付款..");
        return payment.pay(uid, money);
    }


}
