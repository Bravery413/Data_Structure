package leetCode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * //先用Hashmap记录第一个数组中的元素【放在key】，和出现的次数【放在value】。
 * 然后再遍历第二个数组，如果找到对用元素&&对应HashMap中的value不为0，则添加这个元素到list中等下放到数组中，
 * 同时，HashMap中的value值减一，表示已经找到一个相同的了。最后的话，将list中的值取出来，放到数组中返回
 */

/**
 * @author bravery
 * @date 2019/8/23 8:55
 */


public class Solution350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            int num=nums1[i];
            if (map.containsKey(num)) {
                int value = map.get(num);
                map.put(num, ++value);
            } else {
                map.put(num, 1);
            }
        }
        ArrayList<Integer> resList = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            if (map.containsKey(num) && map.get(num) != 0) {
                resList.add(num);
                int value = map.get(num);
                map.put(num, --value);
            }
        }
        int[] res = new int[resList.size()];
        int j = 0;
        for (int i : resList) {
            res[j] = i;
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] i1={1,2,2,1};
        int[] i2={2,2};
        int[] intersect = intersect(i1, i2);
        System.out.println(intersect);
    }
}
