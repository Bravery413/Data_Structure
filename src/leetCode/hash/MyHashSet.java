package leetCode.hash;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author bravery
 * @date 2019/8/21 11:37
 */

/**
 * 用ArrayList做桶
 * 用LinkedList做桶下面的元素
 * 每次哈希映射存储元素
 * 一般算法用来判唯一很好用
 */
public class MyHashSet {
    List<LinkedList<Integer>> list;
    int bucketNum=1000;
    /** Initialize your data structure here. */
    public MyHashSet() {
        list=new ArrayList<>();
        for (int i=0;i<bucketNum;i++){
            list.add(new LinkedList<>());
        }
    }

    public void add(int key) {
        if (!contains(key)){
            list.get(key%bucketNum).add(key);
        }
    }

    public void remove(int key) {
        if (contains(key)){
            list.get(key%bucketNum).removeFirstOccurrence(key);
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        LinkedList<Integer> bucket = list.get(key % bucketNum);
        for (int num:bucket) {
            if (num==key){
                return true;
            }
        }
        return false;
    }
}
