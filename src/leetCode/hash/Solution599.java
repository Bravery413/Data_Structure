package leetCode.hash;

import java.util.ArrayList;
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

    public static String[] findRestaurant(String[] list1, String[] list2) {
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

    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] restaurant = findRestaurant(list1, list2);
        System.out.println(restaurant);

    }


}
