package design_pattern.设计模式.策略模式.Demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 潘勇
 * @date 2020/6/27 14:08
 * 支付策略管理类
 */
public class PayStrategy {
    public static final String ALI_PAY = "aliPay";
    public static final String UNION_PAY = "unionPay";
    public static final String JD_PAY = "JDPay";
    public static final String WECHAT_PAY = "wechatPay";
    public static final String DEFAULT_PAY = ALI_PAY;
    private static Map<String, BasePayment> payStrategy = new HashMap<>();

    static {
        payStrategy.put(ALI_PAY, new AliPay());
        payStrategy.put(UNION_PAY, new UnionPay());
        payStrategy.put(JD_PAY, new JDPay());
        payStrategy.put(WECHAT_PAY, new WechatPay());
    }

    public static BasePayment get(String payKey) {
        if (!payStrategy.containsKey(payKey)) {
            return payStrategy.get(DEFAULT_PAY);
        } else {
            return payStrategy.get(payKey);
        }
    }
}
