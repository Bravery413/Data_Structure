package design_pattern.设计模式.代理模式.demo2;

/**
 * @author 潘勇
 * @date 2020/6/15 13:53
 */

import java.util.Date;

/**
 * 订单实体
 */
public class Order {
    private Long id;
    private Date time;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
