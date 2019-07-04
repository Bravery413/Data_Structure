import linearList.SqList;

public class Hello {
    public static void main(String[] args) throws Exception {
        SqList sqList = new SqList(10);
        sqList.insert(0,"哈哈");
        sqList.insert(1,"aaa");
        sqList.toString();
        System.out.println(sqList.toString());
    }
}
