package leetCode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author: Bravery
 * @create: 2019-08-22 23:23
 **/


public class Solution599 {
    //理解错题意
    public static String[] findRestaurant0(String[] list1, String[] list2) {
        HashSet<String> set = new HashSet<>();
        for (String s : list1) {
            set.add(s);
        }
        ArrayList<String> strings = new ArrayList<>();
        for (String s : list2) {
            if (set.contains(s)) {
                strings.add(s);
            }
        }
        String[] res = new String[strings.size()];
        for (int i = 0; i < strings.size(); i++) {
            res[i] = strings.get(i);
        }
        return res;
    }


    public static String[] findRestaurant1(String[] list1, String[] list2) {
        HashSet<String> set = new HashSet<>();
        for (String s : list1) {
            set.add(s);
        }
        ArrayList<String> strings = new ArrayList<>();
        for (String s : list2) {
            if (set.contains(s)) {
                strings.add(s);
            }
        }
        String[] res = new String[strings.size()];
        for (int i = 0; i < strings.size(); i++) {
            res[i] = strings.get(i);
        }
        return res;
    }

    /**
     * 先将list1中的名称和对应索引位置加入Map，
     * 再遍历list2中元素，遇到相同的餐厅计算索引和并判断是否是最小，
     * 如果当前索引和小于最小值，则清空结果集，
     * 在将当前餐厅名加入结果集，并给最小值重新赋值；
     * 如果索引和和最小值相等，则直接加入List
     */

    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int index = Integer.MAX_VALUE;
        ArrayList<String> resList = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int temp = map.get(list2[i]) + i;
                if (temp < index) {
                    resList.clear();
                    resList.add(list2[i]);
                } else if (temp == index) {
                    resList.add(list2[i]);
                }
            }

        }
        return resList.toArray(new String[resList.size()]);
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] restaurant = findRestaurant(list1, list2);
        System.out.println(restaurant.toString());

    }


}
