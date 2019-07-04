import linearList.LinkList;
import linearList.SqList;

public class Hello {
    public static void main(String[] args) throws Exception {
//        SqList sqList = new SqList(10);
//        sqList.insert(0,"哈哈");
//        sqList.insert(1,"aaa");
//        sqList.toString();
//        System.out.println(sqList.toString());
        LinkList linkList = new LinkList();
        linkList.insert(0,"啊啊啊");
        linkList.insert(1,"你你你");
        linkList.insert(2,"问问");
        linkList.insert(1,"新增");
        System.out.println(linkList.isEmpty());
        System.out.println(linkList.length());
//        linkList.remove(1);
//        linkList.clear();
//        linkList.display();
        System.out.println(linkList.get(2));linkList.get(3);
        System.out.println( linkList.indexOf("问"));
        System.out.println(linkList.toString());

    }
}
