package design_pattern.设计模式.代理模式.demo2;

/**
 * @author 潘勇
 * @date 2020/6/15 13:54
 */


public class OrderDao {
    public int insert(Order order) {
        System.out.println("订单:" + order.getId() + "新增成功");
        return 1;
    }
}
