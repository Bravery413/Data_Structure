package design_pattern.设计模式.策略模式.Demo1;

/**
 * @author 潘勇
 * @date 2020/6/27 13:57
 */


public class PayState {
    private Integer code;
    private Object data;
    private String msg;

    public PayState(Integer code,Object data,String msg){
        this.code=code;
        this.data=data;
        this.msg=msg;
    }


    public String toString() {
        return "PayState{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
