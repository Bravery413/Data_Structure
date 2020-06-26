package leetcode.hash;

import java.util.HashSet;
import java.util.Random;

/**
 * @author bravery
 * @date 2019/8/23 15:55
 */
public class RandomizedSet {
    HashSet<Integer> set;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        set=new HashSet<Integer>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (set.contains(val)){
            return false;
        }else {
            set.add(val);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (set.contains(val)){
            set.remove(val);
            return true;
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        Integer[] arr = set.toArray(new Integer[1]);
        return arr[new Random().nextInt(arr.length)];
    }

    public static void main(String[] args) {
//        RandomizedSet set = new RandomizedSet();
//        boolean insert = set.insert(3);
//        System.out.println(insert);
//        int random = set.getRandom();
//        System.out.println(random);
//        boolean remove = set.remove(3);
//        System.out.println(remove);
        //set转数组,调用随机数api
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Integer[] i=new Integer[1];
        Integer[] array = set.toArray(i);
        System.out.print("i==array?: ");
        System.out.println(i==array);
        int random = new Random().nextInt(array.length);
        int res=array[random];
        System.out.println(res);
    }
}
