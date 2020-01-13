//package linearList;
//
//import java.util.Arrays;
//
//public class SqList implements MyList {
//    //数组作为线性表储存空间
//    private Object[] listElem;
//
//    //线性表当前长度
//    private int curlen;
//
//    public SqList(int maxSize) {
//        curlen = 0;
//        listElem = new Object[maxSize];
//    }
//
//    @Override
//    public void clear() {
//        curlen = 0;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return curlen == 0;
//    }
//
//    @Override
//    public int length() {
//        return curlen;
//    }
//
//    @Override
//    public Object get(int i) throws Exception {
//        // 1.判断i是否合法;
//        // 2.合法则返回
//        if (i < 0 || i > curlen - 1) {
//            throw new Exception("元素不存在");
//        }
//        return listElem[i];
//    }
//
//    @Override
//    public void insert(int i, Object obj) throws Exception {
//        // 1.判断是否已满;
//        // 2.判断插入位置是否合法;
//        // 3.从i位置开始全部元素往后退一位
//        // 4.赋值到i位置,curlen++
//        if (curlen == listElem.length)
//            throw new Exception("储存空间已满");
//        if (i < 0 || i > curlen)
//            throw new Exception("插入位置不合法");
//        for (int j = curlen; j > i; j--) {
//            listElem[j] = listElem[j - 1];
//        }
//        listElem[i] = obj;
//        ++curlen;
//    }
//
//    @Override
//    public void remove(int i) throws Exception {
//        // 1.判断i是否合法;
//        // 2.i之后的元素全部往前一位;
//        // 3.curlen--
//        if (i < 0 || i > curlen - 1)
//            throw new Exception("删除位置不合法");
//        for (int j = i; j < curlen; j++) {
//            listElem[j] = listElem[j + 1];
//        }
//        --curlen;
//    }
//
//    @Override
//    public int indexOf(Object obj) {
//        // 1.遍历数组匹配如果有返回下标,如果没有返回-1
//        for (int i = 0; i < curlen - 1; i++) {
//            if (listElem[i].equals(obj)) {
//                return i;
//            } else {
//                i++;
//            }
//        }
//        return -1;
//    }
//
//    @Override
//    public void display() {
//        for (int i = 0; i < curlen; i++) {
//            System.out.println(listElem[i] + ",");
//        }
//
//    }
//
//    public String toString() {
//        StringBuffer sb = new StringBuffer();
//        sb.append("[");
//        for (Object obj : listElem) {
//            if (null != obj)
//                sb.append(obj.toString() + ", ");
//        }
//        sb.delete(sb.length() - 2, sb.length());
//        sb.append("]");
//        return sb.toString();
//    }
//}
