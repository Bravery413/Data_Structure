package linearList;

public interface MyList {
    //清空
    public void clear();

    //判空
    public boolean isEmpty();

    //长度
    public int length();

    //下标寻元素
    public Object get(int i) throws Exception;

    //插入
    public void insert(int i, Object obj) throws Exception;

    //移除
    public void remove(int i) throws Exception;

    //根据元素返回下标
    public int indexOf(Object obj);

    //遍历输出
    public void display();

    public String toString();

}
