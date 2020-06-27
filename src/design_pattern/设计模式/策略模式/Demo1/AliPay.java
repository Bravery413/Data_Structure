package design_pattern.设计模式.策略模式.Demo1;

/**
 * @author 潘勇
 * @date 2020/6/27 14:08
 */


public class AliPay extends BasePayment {

    @Override
    public String getPayType() {
        return "支付宝支付";
    }

    @Override
    public Double queryBalance(String uid) {
        return 10000.0;
    }
}
