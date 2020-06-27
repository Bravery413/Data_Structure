package design_pattern.设计模式.策略模式.Demo1;

/**
 * @author 潘勇
 * @date 2020/6/27 14:38
 * 支付时选择支付方式
 * 当用户未选,使用默认支付方式结算
 */
public class PayTest {
    /**
     * 总结:
     * 1:order在Pay的时候选择不同的策略,避免了if else判断
     * 2:实际避免是因为用了HashMap,直接用key获取了具体的支付类(value)
     */
    public static void main(String[] args) {
        Order order = new Order("123", "202006271438", 300.0);
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }
}
