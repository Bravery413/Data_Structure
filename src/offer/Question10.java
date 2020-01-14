package offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 两输之和
 */
public class Question10 {
    //TODO 没考虑下标最小
    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        //key是互补的数,value是下标   查key对得上取出value和当前下标
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                res.add(sum - array[i]);
                res.add(array[i]);
                return res;
            } else {
                set.add(sum - array[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int sum = 9;
        System.out.println(FindNumbersWithSum(array, sum));
    }

}
