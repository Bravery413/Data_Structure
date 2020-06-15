package design_pattern.设计模式.代理模式.demo2;

/**
 * @author 潘勇
 * @date 2020/6/15 13:57
 */


public class OrderServiceImpl implements IOrderService {
    /**
     * 这里本来是Spring注入的,简单new一个代替
     */
    OrderDao orderDao = new OrderDao();

    @Override
    public void insert(Order order) {
        orderDao.insert(order);
    }
}
